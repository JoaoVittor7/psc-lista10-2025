package atividadesfaculdade;

public class Impressora {
private String marca;
private int anoFabricacao;
private String tipo;
private String conectividade;

public Impressora(String marca, int anoFabricacao, String tipo, String conectividade){
    this.marca = marca;
    this.anoFabricacao = anoFabricacao;
    this.tipo = tipo;
    this.conectividade = conectividade;
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

public String getConec(){
    return conectividade;
}


public void setConec(String conectividade){
    this.conectividade = conectividade;
}

public void imprimir(){
    System.out.println("imprimindo...");
}

public void copiar(){
    System.out.println("copiando...");
}

public void digitalizar(){
    System.out.println("Digitalizando");
}

}
