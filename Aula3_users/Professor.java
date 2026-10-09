import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
    private String departamento;
    private String titulacao;       // "Especialista", "Mestre", "Doutor"
    private String regimeTrabalho;  // "20h", "40h", "Dedicação Exclusiva"
    private List<String> turmasAtivas;

    public Professor() {
        super();
        this.turmasAtivas = new ArrayList<>();
    }

    public Professor(int matricula, String nome, String login, String senha, String departamento, String titulacao, String regimeTrabalho) {
        setMatricula(matricula);
        setNome(nome);
        setLogin(login);
        setSenha(senha);
        this.departamento = departamento;
        this.titulacao = titulacao;
        this.regimeTrabalho = regimeTrabalho;
        this.turmasAtivas = new ArrayList<>();
    }

    // Regras de negócio / Gestão de turmas
    public void vincularTurma(String codigoTurma) {
        if (!turmasAtivas.contains(codigoTurma)) {
            turmasAtivas.add(codigoTurma);
        }
    }

    public boolean desvincularTurma(String codigoTurma) {
        return turmasAtivas.remove(codigoTurma);
    }

    public int getTotalTurmas() {
        return turmasAtivas.size();
    }

    // Getters e Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public void setRegimeTrabalho(String regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    public List<String> getTurmasAtivas() {
        return turmasAtivas;
    }
}