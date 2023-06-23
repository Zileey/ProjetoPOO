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
        boolean flag = true;

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
        System.out.println("");
        System.out.println("||====================================================||");
        System.out.println("|| Seja Bem vindo ao Registro de Treinadores Pokemons ||");
        System.out.println("||====================================================||");
        System.out.println("");
        System.out.print("Digite seu nome: \n");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: \n");
        idade = sc.nextInt();
        System.out.print("Digite sua Região: \n");
        sc.nextLine();
        regiao = sc.nextLine();

        //Lista de Pokemons que o treinador tem
        Treinador trainer1 = new Treinador(nome, idade, regiao);
        List<Pokemon> Pokemaes_1 = null;

        while (flag) {
            //Menu para adicionar pokemons á lista do treinador
            System.out.println("Digite suas preferencias de tipo: \n");
            System.out.println("1 - Para Água\n");
            System.out.println("2 - Para Elétrico\n");
            System.out.println("3 - Para Fogo\n");
            System.out.println("4 - Para Normal\n");
            System.out.println("5 - Para Pedra\n");
            System.out.println("6 - Para Voador\n");
            System.out.println("7 - Para Fantasma\n");
            System.out.println("8 - Para sair\n");

            tipo = sc.nextInt();

            switch (tipo) {
                case 1:
                    List<Pokemon> aqua = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokémons de água: \n");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i); //Pega o pokemon da lista em um objeto
                        if (pokemon.tipo.equals("Agua")) { //se ele for do tipo Agua, então será mostrado suas informações
                            pokemon.mostrarInfo();
                            aqua.add(pokemon);
                        }
                    }
                    System.out.println("Escolha um pokémon de água digitando o número correspondente: ");

                    int opcao = sc.nextInt();//Mostra todos os pokemons que foram identificados com o tipo
                    for (int i = 0; i < aqua.size(); i++) {
                        Pokemon pokemon = aqua.get(i);
                        if (pokemon.num == opcao){
                            Pokemaes_1.add(pokemon);
                            //Se o numero digitado é igual ao numero do pokemon, ele é adicionado á lista do treinador
                        }
                    }
                    break;
                case 2:
                    List<Pokemon> raio = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokémons Elétricos: \n");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i);
                        if (pokemon.tipo.equals("Eletrico")) {
                            pokemon.mostrarInfo();
                            raio.add(pokemon);
                        }
                    }
                    System.out.println("Escolha um pokémon do tipo Elétrico digitando o número correspondente: ");

                    int opcao2 = sc.nextInt();
                    for (int i = 0; i < raio.size(); i++) {
                        Pokemon pokemon = raio.get(i);
                        if (pokemon.num == opcao2) {
                            Pokemaes_1.add(pokemon);
                        }
                    }
                        break;
                case 3:
                    List<Pokemon> fire = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokémons de Fogo: \n");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i);
                        if (pokemon.tipo.equals("Fogo")) {
                            pokemon.mostrarInfo();
                            fire.add(pokemon);
                        }
                    }
                    System.out.println("Escolha um pokémon do tipo Fogo digitando o número correspondente:");
                    int opcao3 = sc.nextInt();
                    for (int i = 0;i < fire.size(); i++) {
                        Pokemon pokemon = fire.get(i);
                        if (pokemon.num == opcao3) {
                            Pokemaes_1.add(pokemon);
                        }
                    }
                    break;
                case 4:
                    List<Pokemon> nor = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokémons do tipo Normal: ");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i);
                        if (pokemon.tipo.equals("Normal")) {
                            pokemon.mostrarInfo();
                            nor.add(pokemon);
                        }
                    }
                    System.out.println("Escolha um pokémon do tipo Normal digitando o numero correspondente:");
                    int opcao4 = sc.nextInt();

                    for (int i = 0; i < nor.size(); i++) {
                        Pokemon pokemon = nor.get(i);
                        if (pokemon.num == opcao4) {
                            Pokemaes_1.add(pokemon);
                        }
                    }
                    break;

                case 5:
                    List<Pokemon> rock = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokémons de Pedra: ");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i);
                        if (pokemon.tipo.equals("Pedra")) {
                            pokemon.mostrarInfo();
                            rock.add(pokemon);
                        }
                    }

                    System.out.println("Escolha um pokémon do tipo Pedra digitando o número correspondente:");
                    int opcao5 = sc.nextInt();

                    for (int i = 0; i < rock.size(); i++) {
                        Pokemon pokemon = rock.get(i);
                        if (pokemon.num == opcao5) {
                            Pokemaes_1.add(pokemon);
                        }
                    }
                    break;

                case 6:
                    List<Pokemon> fly = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokemons Voadores: ");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i);
                        if (pokemon.tipo.equals("Voador")) {
                            pokemon.mostrarInfo();
                            fly.add(pokemon);
                        }
                    }
                    System.out.println("Escolha um pokémon voador digitando o número correspondente: ");
                    int opcao6 = sc.nextInt();

                    for (int i = 0; i <fly.size(); i++) {
                        Pokemon pokemon = fly.get(i);
                        if (pokemon.num == opcao6) {
                            Pokemaes_1.add(pokemon);
                        }
                    }
                    break;

                case 7:
                    List<Pokemon> ghost = new ArrayList<Pokemon>();
                    System.out.println("Temos os seguintes pokemons Fantasma: ");
                    for (int i = 0; i < catalogo.size(); i++) {
                        Pokemon pokemon = catalogo.get(i);
                        if (pokemon.tipo.equals("Fantasma")) {
                            pokemon.mostrarInfo();
                            ghost.add(pokemon);
                        }
                    }

                    System.out.println("Escolha um pokémon do tipo fantasma digitando o número correspondente: ");
                    int opcao7 = sc.nextInt();

                    for (int i = 0; i <ghost.size(); i++) {
                        Pokemon pokemon = ghost.get(i);
                        if (pokemon.num == opcao7) {
                            Pokemaes_1.add(pokemon);
                        }
                    }
                    break;

                case 8:
                    flag = false;
                    break;

                default:
                    System.out.println("\t Insira uma opção válida!");
                    break;
            }
        }
    }
}}