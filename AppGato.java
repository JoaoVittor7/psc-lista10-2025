package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Gato gato = new Gato("siames", "branco", 1);

    System.out.print("o gato de raca " + gato.getRaca() + " da cor " + gato.getCor() + " esta ");
    gato.dormir();
    }
}
