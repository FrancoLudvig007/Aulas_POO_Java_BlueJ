import hashlib

class Atleta():
    def __init__(self, nome, idade, peso, esporte, senha=None):
        self.nome = nome
        self.idade = idade
        self.peso = peso
        self.esporte = esporte
        self.senha = senha

    def input_dados(self):
        self.nome = input("Digite o nome do atleta: ")
        self.idade = int(input("Digite a idade do atleta: "))
        self.peso = float(input("Digite o peso do atleta (em kg): "))
        self.esporte = input("Digite o esporte praticado pelo atleta: ")
        #criptografando a senha usando SHA-256
        self.senha = hashlib.sha256(input("Digite a senha do atleta: ").encode()).hexdigest()

    def apresentar(self):
        return f"\nNome:{self.nome}\nIdade: {self.idade} anos \nPeso: {self.peso}kg \nEsporte: {self.esporte}.\nSenha: {self.senha}."

atleta1 = Atleta("", 0, 0.0, "")
atleta1.input_dados()
print(atleta1.apresentar())