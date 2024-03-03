package Atividades.Pessoa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Marco Túlio Salvador Filho";
        pessoa1.cpf = 123456789;
        pessoa1.idade = 21;
        pessoa1.sexo = "Masculino";
        pessoa1.altura = 1.68;
        pessoa1.peso = 58.8;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Daniel Jones";
        pessoa2.cpf = 987654321;
        pessoa2.idade = 78;
        pessoa2.sexo = "Duvidoso";
        pessoa2.altura = 1.54;
        pessoa2.peso = 32.6;

        System.out.println("Selecione uma pessoa do nosso registro: ");
        System.out.println("1 - " + pessoa1.getNome());
        System.out.println("2 - " + pessoa2.getNome());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente a pessoa desejada:");
        int pessoaEscolhida = scanner.nextInt();

        switch (pessoaEscolhida) {
            case 1:
                System.out.println("Dados da pessoa:");
                System.out.println("Nome: " + pessoa1.getNome());
                System.out.println("CPF: " + pessoa1.getCpf());
                System.out.println("Idade: " + pessoa1.getIdade());
                System.out.println("Sexo: " + pessoa1.getSexo());
                System.out.println("Altura: " + pessoa1.getAltura());
                System.out.println("Peso: " + pessoa1.getPeso());
                break;
            case 2:
                System.out.println("Dados da pessoa:");
                System.out.println("Nome: " + pessoa2.getNome());
                System.out.println("CPF: " + pessoa2.getCpf());
                System.out.println("Idade: " + pessoa2.getIdade());
                System.out.println("Sexo: " + pessoa2.getSexo());
                System.out.println("Altura: " + pessoa2.getAltura());
                System.out.println("Peso: " + pessoa2.getPeso());
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}