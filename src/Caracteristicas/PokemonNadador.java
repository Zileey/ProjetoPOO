package Caracteristicas;

import SuperClasse.Pokemon;
import Tipos.Agua;

public class PokemonNadador extends Pokemon implements Agua {
    float VelocidadeDeNado;
    int ProfundidadeMaxima;

    public PokemonNadador(String nome, String tipo, int num, float peso, float velocidadeDeNado, int profundidadeMaxima) {
        super(nome, tipo, num, peso);
        VelocidadeDeNado = velocidadeDeNado;
        ProfundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public void RespiraAgua() {
        System.out.println(this.nome + " está submerso!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Velocidade de nado: "+this.VelocidadeDeNado+" Km/h");
        System.out.println("Profundidade máxima: "+this.ProfundidadeMaxima+"m");
    }
}
