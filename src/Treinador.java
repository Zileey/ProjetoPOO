import SuperClasse.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Treinador {

    private String Nome;
    private int idade;
    private String Regiao;

    Pokemon pokemon;

    public Treinador(String nome, int idade, String regiao) {
        Nome = nome;
        this.idade = idade;
        Regiao = regiao;
    }

    private List<Pokemon> Pokemaes = new ArrayList<Pokemon>();

    public String getNome() {
        return Nome;
    }

    public Treinador(List<Pokemon> pokemaes) {
        this.Pokemaes = pokemaes;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String regiao) {
        Regiao = regiao;
    }

    public void addPokemaes(Pokemon pokemon){
        Pokemaes.add(pokemon);
    }

    public List<Pokemon> getPokemaes() {
        return Pokemaes;
    }

    public void setPokemaes(List<Pokemon> pokemaes) {
        this.Pokemaes = pokemaes;
    }
}
