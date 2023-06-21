import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        String regiao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Seja Bem vindo ao Registro de Inatel para Treinadores de Pokemons\n");
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua Regiao: ");
        regiao = sc.nextLine();

    Treinador trainer1 = new Treinador(nome,idade,regiao);

    System.out.println("Digite suas preferencias de tipo e mobilidade: ");


    }
}