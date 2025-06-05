package atividadesfaculdade;

public class Celular {
private String marca;
private String modelo;
private int anoFabricacao;

public Celular(String marca, String modelo, int anoFabricacao){
    this.marca = marca;
    this.modelo = modelo;
    this.anoFabricacao = anoFabricacao;
}

public String getMarca(){
    return marca;
}

public void setMarca(String marca){
    this.marca = marca;
}

public String getModelo(){
    return modelo;
}

public void setModelo(String modelo){
    this.modelo = modelo;
}

public int getAno(){
    return anoFabricacao;
}

public void setAno(int anoFabricacao){
    this.anoFabricacao = anoFabricacao;
}

public void RealizarChamadas(){
    System.out.println("chamando...");
}

public void TirarFotos(){
    System.out.println("fotografando...");
}

public void EnviarMensagens(){
    System.out.println("enviando mensagem...");
}

public void EnviarEmails(){
    System.out.println("enviando email...");
}
}
