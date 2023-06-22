import Caracteristicas.*;
import SuperClasse.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variáveis auxiliares
        String nome;
        int idade;
        String regiao;
        int tipo;

        //Criando os pokemons para a lista
        List<Pokemon> catalogo = new ArrayList<Pokemon>();
        PokemonAereo Pidgey = new PokemonAereo("Pidgey","Voador",1, 12.5F,50,25);
        PokemonArrepiante Gengar = new PokemonArrepiante("Gengar","Fantasma",4,0);
        PokemonNadador Squirtle = new PokemonNadador("Squirtle","Agua",2,23);
        PokemonNadador Blastoise = new PokemonNadador("Blastoise","Agua",5,120);
        PokemonNadador Staryu = new PokemonNadador("Staryu","Agua",6,5);
        PokemonQuente Charmander = new PokemonQuente("Charmander","Fogo",3,30);
        PokemonChocante Pikachu = new PokemonChocante ("Pikachu" , "Eletrico", 8 , 32);
        PokemonChocante Raichu = new PokemonChocante ("Raichu" , "Eletrico", 9 , 56);
        PokemonChocante Electabuzz = new PokemonChocante ("Electabuzz" , "Eletrico", 10 , 86);
        PokemonNormal Rattata = new PokemonNormal ("Rattata", "Normal", 11 , 18);
        PokemonRocha Onix = new PokemonRocha ("Onix","Pedra", 7 , 450);


        //Adicionando os pokemons para a lista
        catalogo.add(Pidgey);
        catalogo.add(Squirtle);
        catalogo.add(Charmander);
        catalogo.add(Gengar);
        catalogo.add(Blastoise);
        catalogo.add(Staryu);
        catalogo.add(Onix);
        catalogo.add(Pikachu);
        catalogo.add(Raichu);
        catalogo.add(Electabuzz);
        catalogo.add(Rattata);

        //Pedindo informações para o usuário
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja Bem vindo ao Registro de Inatel para Treinadores de Pokemons\n");
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua Regiao: ");
        regiao = sc.nextLine();

        //Lista de Pokemons que o treinador tem
        Treinador trainer1 = new Treinador(nome, idade, regiao);
        List<Pokemon> Pokemaes_1 = null;

        //Menu para adicionar pokemons á lista do treinador
        System.out.println("Digite suas preferencias de tipo: ");
        System.out.println("1 - Para Água\n");
        System.out.println("2 - Para Elétrico\n");
        System.out.println("3 - Para Fogo\n");
        System.out.println("4 - Para Normal\n");
        System.out.println("5 - Para Pedra\n");
        System.out.println("6 - Para Voador\n");
        System.out.println("7 - Para Fantasma\n");
        System.out.println("0 - Para sair");
        tipo = sc.nextInt();
        
        while (tipo != 0) {
            switch (tipo) {
                case 1:
                    System.out.println("Temos os seguintes pokemons de água: ");
                    for (int i = 0; i <catalogo.size(); i++) {
                        if(catalogo.contains("Agua")){
                            System.out.println(catalogo.get(i));
                        }
                    }
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:

                    break;
            }
        }
    }
}