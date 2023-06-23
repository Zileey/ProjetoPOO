package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Fantasma;

public class PokemonArrepiante extends Pokemon implements Fantasma {

    public PokemonArrepiante(String nome, String tipo, int num, float peso) {
        super(nome, tipo, num, peso);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Número do SuperClasse.Pokemon: "+ this.num);
        System.out.println("Nome do pokemon: "+ this.nome);
        System.out.println("Tipo do pokemon: "+ this.tipo);
        System.out.println("Peso do pokemon: "+ this.num);
    }

    @Override
    public void estaAssustando() {

    }

    @Override
    public void boo() {

    }
}