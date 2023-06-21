package SuperClasse;

public abstract class Pokemon{

    protected String nome;
    protected String tipo;
    protected int num;
    protected float peso;

    //protected int patas;


    void mostrarInfo(){
        System.out.println("Número do SuperClasse.Pokemon: "+ this.num);
        System.out.println("Nome do pokemon: "+ this.nome);
        System.out.println("Tipo do pokemon: "+ this.tipo);
        System.out.println("Peso do pokemon: "+ this.num);
    }
}
