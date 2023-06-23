package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Fantasma;

import java.sql.SQLOutput;

public class PokemonArrepiante extends Pokemon implements Fantasma {

    public PokemonArrepiante(String nome, String tipo, int num, float peso) {
        super(nome, tipo, num, peso);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public void estaAssustando() {
        System.out.println("BOO!");
    }

    @Override
    public void boo() {
        System.out.println("Atrás de você!");
    }
}
