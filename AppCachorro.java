package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("pinscher", "preta", 1);
    System.out.println("Hoje meu cachorro da raça " + cachorro.getRaca() + " fez aniversario! Sua idade é de: " + cachorro.getIdade() + " ano " + "e agora ele se encontra la fora ");
    cachorro.andar();

    }
}
