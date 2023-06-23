package SuperClasse;

public abstract class Pokemon {

    public String nome;
    public String tipo;
    public int num;
    public float peso;


    public Pokemon(String nome, String tipo, int num, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.num = num;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Número do Pokemon: " + this.num);
        System.out.println("Nome do pokemon: " + this.nome);
        System.out.println("Tipo do pokemon: " + this.tipo);
        System.out.println("Peso do pokemon: " + this.peso + "kg");
    }
}
