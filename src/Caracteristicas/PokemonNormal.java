package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Fogo;
import Tipos.Normal;

public class PokemonNormal extends Pokemon implements Normal{


    public PokemonNormal(String nome, String tipo, int num, float peso) {
        super(nome, tipo, num, peso);
    }

    @Override
    public void Existindo() {
        System.out.println("Ele está apenas existindo!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}
