package atividadesfaculdade;

public class Gato {
private String raca;
private String cor;
private int idade;

public Gato(String raca, String cor, int idade){
    this.raca = raca;
    this.cor = cor;
    this.idade = idade;
}

public String getRaca(){
    return raca;
}
public void setRaca(String raca){
    this.raca = raca;
}

public String getCor(){
    return cor;
}

public void setCor(String cor){
    this.cor = cor;
}

public int getIdade(){
    return idade;
}

public void setIdade(int idade){
    this.idade = idade;
}

public void miar() {
    System.out.println("meow meoooooooowwwwww");
}

public void comer() {
    System.out.println("Comendo algo...");
}

public void andar(){
    System.out.println("andando...");
}

public void dormir(){
    System.out.println("dormindo...");
}

}
