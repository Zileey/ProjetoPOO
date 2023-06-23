package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Pedra;

public class PokemonRocha extends Pokemon implements Pedra {
    int TempoDeResistencia;

    public PokemonRocha(String nome, String tipo, int num, float peso, int tempoDeResistencia) {
        super(nome, tipo, num, peso);
        TempoDeResistencia = tempoDeResistencia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tempo de resistencia: "+ this.TempoDeResistencia);
    }

    @Override
    public void taDuro() {
        System.out.println("O pokemon está mais resistente!");
    }
}
