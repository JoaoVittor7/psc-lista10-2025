package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Joao", 19, "13452323", "jotaveyt15@gmail.com");

    System.out.print(pessoa.getNome() + " esta ");
    pessoa.andar();
}
}
