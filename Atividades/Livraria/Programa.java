package Atividades.Livraria;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("A Arte da Guerra");
        livro1.setAutor("Sun Tzu");
        livro1.setEditora("RECORD");
        livro1.setAno(2010);
        livro1.setIsbn("978-85-01-09250-2");

        Livro livro2 = new Livro();
        livro2.setTitulo("Código Limpo");
        livro2.setAutor("Robert C. Martin");
        livro2.setEditora("Alta Books");
        livro2.setAno(2009);
        livro2.setIsbn("978-85-7608-267-5");

        Livro livro3 = new Livro();
        livro3.setTitulo("Solo Leveling 01");
        livro3.setAutor("Chugong");
        livro3.setEditora("Panini");
        livro3.setAno(2024);
        livro3.setIsbn("978-65-2591-949-2");

        Livro livro4 = new Livro();
        livro4.setTitulo("Initial D Vol. 1");
        livro4.setAutor("Shuichi Shigeno");
        livro4.setEditora("Kodansha Comics");
        livro4.setAno(2019);
        livro4.setIsbn("978-19-3151-498-9");

        Livro livro5 = new Livro();
        livro5.setTitulo("The Beginning After the End Vol. 1");
        livro5.setAutor("TurtleMe");
        livro5.setEditora("NewPOP");
        livro5.setAno(2023);
        livro5.setIsbn("978-85-8362-368-7");

        System.out.println("Selecione um livro do nosso acervo: ");
        System.out.println("1 - " + livro1.getTitulo());
        System.out.println("2 - " + livro2.getTitulo());
        System.out.println("3 - " + livro3.getTitulo());
        System.out.println("4 - " + livro4.getTitulo());
        System.out.println("5 - " + livro5.getTitulo());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao livro desejado:");
        int livroEscolhido = scanner.nextInt();


        switch (livroEscolhido) {
            case 1:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro1.getTitulo());
                System.out.println("Autor: " + livro1.getAutor());
                System.out.println("Editora: " + livro1.getEditora());
                System.out.println("Ano: " + livro1.getAno());
                System.out.println("ISBN: " + livro1.getIsbn());
                break;
            case 2:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro2.getTitulo());
                System.out.println("Autor: " + livro2.getAutor());
                System.out.println("Editora: " + livro2.getEditora());
                System.out.println("Ano: " + livro2.getAno());
                System.out.println("ISBN: " + livro2.getIsbn());
                break;
            case 3:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro3.getTitulo());
                System.out.println("Autor: " + livro3.getAutor());
                System.out.println("Editora: " + livro3.getEditora());
                System.out.println("Ano: " + livro3.getAno());
                System.out.println("ISBN: " + livro3.getIsbn());
                break;
            case 4:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro4.getTitulo());
                System.out.println("Autor: " + livro4.getAutor());
                System.out.println("Editora: " + livro4.getEditora());
                System.out.println("Ano: " + livro4.getAno());
                System.out.println("ISBN: " + livro4.getIsbn());
                break;
            case 5:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro5.getTitulo());
                System.out.println("Autor: " + livro5.getAutor());
                System.out.println("Editora: " + livro5.getEditora());
                System.out.println("Ano: " + livro5.getAno());
                System.out.println("ISBN: " + livro5.getIsbn());
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}