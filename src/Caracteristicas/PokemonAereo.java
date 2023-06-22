package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Normal;
import Tipos.Voador;

public class PokemonAereo extends Pokemon implements Voador, Normal {

    private int VelocidadeV;
    private int AlturaMax;

    public PokemonAereo(String nome, String tipo, int num, float peso, int velocidadeV, int alturaMax) {
        super(nome, tipo, num, peso);
        VelocidadeV = velocidadeV;
        AlturaMax = alturaMax;
    }

    @Override
    public void Voando() {
        System.out.println("O pokemon está voando!");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Velocidade de vôo: "+ this.VelocidadeV);
        System.out.println("Altura máxima: "+this.AlturaMax);
    }

    @Override
    public void Existindo() {
        System.out.println("Está existindo!");
    }



}
