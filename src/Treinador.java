public class Treinador {

    private String Nome;
    private int idade;
    private String Regiao;

    public Treinador(String nome, int idade, String regiao) {
        Nome = nome;
        this.idade = idade;
        Regiao = regiao;
    }

    public String getNome() {
        return Nome;
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
}
