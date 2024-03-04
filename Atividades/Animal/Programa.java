package Atividades.Animal;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(1, "Doméstico", "Terrestre", "Uggo", "Maltês", 12);

        System.out.println("Dados do cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());
    }
}