package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Agua;

public class PokemonNadador extends Pokemon implements Agua {

    public PokemonNadador(String nome, String tipo, int num, float peso) {
        super(nome, tipo, num, peso);
    }

    @Override
    public void RespiraAgua() {

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Número do pokemon: "+ this.num);
        System.out.println("Nome do pokemon: "+ this.nome);
        System.out.println("Tipo do pokemon: "+ this.tipo);
        System.out.println("Peso do pokemon: "+ this.num);
    }
}
