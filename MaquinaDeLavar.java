package atividadesfaculdade;

public class MaquinaDeLavar {
private String marca;
private int anoFabricacao;
private String tipo;
private int capacidade;

public MaquinaDeLavar(String marca, int anoFabricacao, String tipo, int capacidade){
    this.marca = marca;
    this.anoFabricacao = anoFabricacao;
    this.tipo = tipo;
    this.capacidade = capacidade;
}

public String getMarca(){
    return marca;
}

public void setMarca(String marca){
    this.marca = marca;
}

public int getAno(){
    return anoFabricacao;
}

public void setAno(int anoFabricacao){
    this.anoFabricacao = anoFabricacao;
}

public String getTipo(){
    return tipo;
}

public void setTipo(String tipo){
    this.tipo = tipo;
}

public int getCapacidade(){
    return capacidade;
}

public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}

public void lavar(){
    System.out.println("lavando...");
}

public void enxaguar(){
    System.out.println("enxaguando...");
}

public void centrifugar(){
    System.out.println("centrifugando...");
}

}
