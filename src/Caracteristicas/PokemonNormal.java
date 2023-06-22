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

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Número do SuperClasse.Pokemon: "+ this.num);
        System.out.println("Nome do pokemon: "+ this.nome);
        System.out.println("Tipo do pokemon: "+ this.tipo);
        System.out.println("Peso do pokemon: "+ this.num);
    }
}
