public class Gato extends Animal{
    private String miar;

    public Gato(){}
    public Gato(String miar, String nome, String raça){
        super(nome, raça);
        this.miar = miar;
    }

    public void mia (String miar){
        miar = ("o gato quer comer e começou a miar alto" + miar);
    }
}
