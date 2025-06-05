package atividadesfaculdade;

public class App {
public static void main(String[] args) {
   Bicicleta bicicleta = new Bicicleta("Bicicleta BMX", "branca", "KSW", 2025);
   System.out.println(bicicleta.getModelo() + " de cor "+ bicicleta.getCor() + " se trata da marca " + bicicleta.getMarca() + " e esta ");
    bicicleta.frear();

    }
}
