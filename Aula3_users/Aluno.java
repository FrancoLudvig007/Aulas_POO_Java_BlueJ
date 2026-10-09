import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private String curso;
    private int semestreAtual;
    private String status; // "Ativo", "Trancado", "Formado"
    private double ira;    // Índice de Rendimento Acadêmico
    private List<String> disciplinasMatriculadas;

    public Aluno() {
        super();
        this.status = "Ativo";
        this.ira = 0.0;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public Aluno(int matricula, String nome, String login, String senha, String curso, int semestreAtual) {
        setMatricula(matricula);
        setNome(nome);
        setLogin(login);
        setSenha(senha);
        this.curso = curso;
        this.semestreAtual = semestreAtual;
        this.status = "Ativo";
        this.ira = 0.0;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    // Regras de negócio / Ações acadêmicas
    public boolean matricularDisciplina(String codigoDisciplina) {
        if ("Ativo".equalsIgnoreCase(this.status) && !disciplinasMatriculadas.contains(codigoDisciplina)) {
            disciplinasMatriculadas.add(codigoDisciplina);
            return true;
        }
        return false;
    }

    public boolean cancelarMatriculaDisciplina(String codigoDisciplina) {
        return disciplinasMatriculadas.remove(codigoDisciplina);
    }

    public void trancarMatricula() {
        this.status = "Trancado";
        this.disciplinasMatriculadas.clear();
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(int semestreAtual) {
        this.semestreAtual = semestreAtual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public List<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }
}