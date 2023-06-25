import SuperClasse.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Treinador {

    //Variáveis do Treinador
    private String Nome;
    private int idade;
    private String Regiao;

    //Construtor
    public Treinador(String nome, int idade, String regiao) {
        Nome = nome;
        this.idade = idade;
        Regiao = regiao;
    }
}
