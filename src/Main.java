import SuperClasse.Pokemon;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        String regiao;
        String tipo;
        String mobilidade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Seja Bem vindo ao Registro de Inatel para Treinadores de Pokemons\n");
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua Regiao: ");
        regiao = sc.nextLine();

    Treinador trainer1 = new Treinador(nome,idade,regiao);
        List<Pokemon> Pokemaes_1 = null;

    System.out.println("Digite suas preferencias de tipo: ");
    tipo =  sc.nextLine();
    //mobilidade = sc.nextLine();
    if (tipo == "Agua"){

    } else if (tipo == "Fogo") {

    } else if () {

    }

    }
}