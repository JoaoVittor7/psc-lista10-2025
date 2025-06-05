package atividadesfaculdade;

public class Pessoa {
private String nome;
private int idade;
private String cpf;
private String email;

public Pessoa(String nome, int idade, String cpf,  String email){
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.email = email;
}
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }




    public void falar(){
        System.out.println("Aopa!");
    }

    public void comer(){
        System.out.println("Mastigando...");
    }

    public void dormir(){
        System.out.println("Tirando uma soneca!");
    }

    public void andar(){
        System.out.println("andando tantos metros");
    }

}
