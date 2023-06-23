package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Eletrico;

public class PokemonChocante extends Pokemon implements Eletrico {
    int voltagem;

    public PokemonChocante(String nome, String tipo, int num, float peso, int voltagem) {
        super(nome, tipo, num, peso);
        this.voltagem = voltagem;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Voltagem: "+this.voltagem + "V");
    }

    @Override
    public void taEmShokk() {

    }
}
