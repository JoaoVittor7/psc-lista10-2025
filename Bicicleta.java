package atividadesfaculdade;

public class Bicicleta {
    private String modelo;
    private String cor;
    private String marca;
    private int ano;

    public Bicicleta(String modelo, String cor, String marca, int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
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

     public void pedalar(){
        System.out.println("pedalando...");
     }

     public void frear(){
        System.out.println("freando...");
     }

   

}



