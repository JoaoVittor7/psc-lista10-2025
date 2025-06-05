package atividadesfaculdade;

public class Notebook {
private String marca;
private String modelo;
private int anoFabricacao;

public Notebook(String marca, String modelo, int anoFabricacao){
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

public void receberEmails(){
    System.out.println("Email recebido!");
}

public void enviarEmails(){
    System.out.println("Email enviado!");
}

public void salvarArquivos(){
    System.out.println("salvando arquivo...");
}

public void instalarApp(){
    System.out.println("instalando...");
}

public void desinstalarApp(){
    System.out.println("desinstalando...");
}

public void executarPrograma(){
    System.out.println("abrindo seu programa...");
}

public void processarDados(){
    System.out.println("processando dados...");
}
}
