package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Fogo;

public class PokemonQuente extends Pokemon implements Fogo {
    int TemperaturaCorporal;

    public PokemonQuente(String nome, String tipo, int num, float peso, int temperaturaCorporal) {
        super(nome, tipo, num, peso);
        TemperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temperatura Corporal: " +this.TemperaturaCorporal+ "ºC");
    }

    @Override
    public void CuspirFogo() {

    }
}
