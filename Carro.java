package atividadesfaculdade;

public class Carro {
    private String nome;
    private String cor;
    private String marca;
    private int ano;

    public Carro(String nome, String cor, String marca, int ano){
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

     public String getCor(){
        return cor;
     }
     public void setCor(String cor){
        this.cor = cor;
     }

     public String getMarca(){
        return marca;
     }
     public void setMarca(String marca){
        this.marca = marca;
     }
     
     public int getAno(){
        return ano;
     }

     public void setAno(int ano){
        this.ano = ano;
     }

     public void acelerar(){
        System.out.println("Acelerando...");
     }

     public void frear(){
        System.out.println("Freando...");
     }

     public void  buzinar(){
        System.out.println("Buzinando bip bip!");
     }

}
