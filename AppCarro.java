package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Carro carro = new Carro("M5", "Preta", "BMW", 2024);
    System.out.print(carro.getMarca() + " " + carro.getNome() + " esta ");
    carro.buzinar();

    }
}
