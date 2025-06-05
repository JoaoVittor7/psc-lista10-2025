package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Moto moto = new Moto("Honda CB 600F", "Preta", "Honda", 2024);
    System.out.print(moto.getNome() + " de cor " +moto.getCor() + " " + " esta ");
    moto.acelerar();

    }
}
