package Atividades.Universidade;

import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Universidade universidade = new Universidade("Centro Universitario UNA");

        Disciplina disciplina1 = new Disciplina("Modelos, Métodos e Técnicas de Engenharia de Software");
        Disciplina disciplina2 = new Disciplina("Análise de Dados e Big Data");

        universidade.adicionarDisciplina(disciplina1);
        universidade.adicionarDisciplina(disciplina2);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas Chagas");
        aluno1.setMatricula(6212);
        aluno1.setCurso("Engenharia da Computação");
        aluno1.setSemestre(6);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Marco Tulio");
        aluno2.setMatricula(6213);
        aluno2.setCurso("Engenharia da Computação");
        aluno2.setSemestre(5);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Paulo Mateus");
        aluno3.setMatricula(6214);
        aluno3.setCurso("Engenharia da Computação");
        aluno3.setSemestre(5);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Daniel Jones");
        aluno4.setMatricula(6215);
        aluno4.setCurso("Engenharia da Computação");
        aluno4.setSemestre(5);

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Gustavo Rodrigues");
        aluno5.setMatricula(6216);
        aluno5.setCurso("Engenharia da Computação");
        aluno5.setSemestre(5);

        universidade.adicionarAluno(aluno1);
        universidade.adicionarAluno(aluno2);
        universidade.adicionarAluno(aluno3);
        universidade.adicionarAluno(aluno4);
        universidade.adicionarAluno(aluno5);

        Professor professor1 = new Professor();
        professor1.setNome("Daniel Paiva");
        professor1.setMatricula(7575);
        professor1.setDisciplinaLecionada("Modelos, Métodos e Técnicas de Engenharia de Software");

        Professor professor2 = new Professor();
        professor2.setNome("Leonardo Melgaço");
        professor2.setMatricula(7676);
        professor2.setDisciplinaLecionada("Análise de Dados e Big Data");
        
        universidade.adicionarProfessor(professor1);
        universidade.adicionarProfessor(professor2);

        aluno1.setNota1(95);
        aluno1.setNota2(90);

        aluno2.setNota1(90);
        aluno2.setNota2(80);

        aluno3.setNota1(80);
        aluno3.setNota2(80);

        aluno4.setNota1(75);
        aluno4.setNota2(85);

        aluno5.setNota1(85);
        aluno5.setNota2(75);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Ulife!");
        System.out.println("Por favor, selecione uma opção:");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                exibirListaAlunos(universidade);
                System.out.println("Selecione o aluno:");
                int indiceAluno = scanner.nextInt();
                Aluno alunoSelecionado = universidade.getAlunos().get(indiceAluno - 1);
                System.out.println("Opções para Aluno:");
                System.out.println("1 - Visualizar disciplinas");
                System.out.println("2 - Visualizar notas");
                System.out.println("3 - Sair");
                int escolhaAluno = scanner.nextInt();
                switch (escolhaAluno) {
                    case 1:
                        exibirDisciplinas(universidade);
                        break;
                    case 2:
                        System.out.println("Nota para Modelos, Métodos e Técnicas de Engenharia de Software:");
                        System.out.println(alunoSelecionado.getNota1());
                        System.out.println("Nota para Análise de Dados e Big Data:");
                        System.out.println(alunoSelecionado.getNota2());
                        break;
                    case 3:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;
            case 2:
                exibirListaProfessores(universidade);
                System.out.println("Selecione o professor:");
                int indiceProfessor = scanner.nextInt();
                Professor professorSelecionado = universidade.getProfessores().get(indiceProfessor - 1);
                System.out.println("Opções para Professor:");
                System.out.println("1 - Lançar notas");
                System.out.println("2 - Visualizar alunos");
                System.out.println("3 - Sair");
                int escolhaProfessor = scanner.nextInt();
                switch (escolhaProfessor) {
                    case 1:
                        System.out.println("Sistema ainda não implementado.");
                        break;
                    case 2:
                        visualizarAlunos(universidade, professorSelecionado);
                        break;
                    case 3:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;            
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void exibirListaAlunos(Universidade universidade) {
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < universidade.getAlunos().size(); i++) {
            Aluno aluno = universidade.getAlunos().get(i);
            System.out.println((i + 1) + ". " + aluno.getNome());
        }
    }

    private static void exibirListaProfessores(Universidade universidade) {
        System.out.println("Lista de Professores:");
        for (int i = 0; i < universidade.getProfessores().size(); i++) {
            Professor professor = universidade.getProfessores().get(i);
            System.out.println((i + 1) + ". " + professor.getNome());
        }
    }

    private static void exibirDisciplinas(Universidade universidade) {
        System.out.println("Disciplinas disponíveis:");
        for (Disciplina disciplina : universidade.getDisciplinas()) {
            System.out.println("- " + disciplina.getNomeDisciplina());
        }
    }

    private static void visualizarAlunos(Universidade universidade, Professor professor) {
        List<Aluno> alunos = universidade.getAlunos();
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println((i + 1) + ". " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
    }
}