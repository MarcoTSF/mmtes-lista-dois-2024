package Atividades.Universidade;

public class Professor {
    private String nome;
    private int matricula;
    private String disciplinaLecionada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisciplinaLecionada() {
        return disciplinaLecionada;
    }

    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }
}