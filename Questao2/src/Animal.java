public class Animal {

    private String nome, raça;

    public Animal(){}

    public Animal(String nome, String raça){
        this.nome = nome;
        this.raça = raça;
    }

    public void caminha (String caminha){
        caminha = ("o animal" + raça + "esta caminhando");
    }
}
