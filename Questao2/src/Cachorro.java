public class Cachorro extends Animal{

    private String latir;

    public Cachorro(){}
    public Cachorro(String latir, String nome, String raça){
        super(nome, raça);
        this.latir = latir;
    }

    public void late(String late){
        late = ("o cachorro viu um esquiloe comecou a latir " + latir);
    }


}
