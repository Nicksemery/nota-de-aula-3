public class Funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;

    public Funcionario(){

    }
    public Funcionario (String nome, int nasc, double salario){
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNasc(int nasc){
        this.nasc = nasc;
    }

    public int getNasc(){
        return nasc;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double informarSalario(){
        return salario;
    }

    public int CalcularIdade(){
        return nasc - 2024;
    }

}
