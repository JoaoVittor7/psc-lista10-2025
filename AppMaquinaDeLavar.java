package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    MaquinaDeLavar maquinaDeLavar = new MaquinaDeLavar("brastemp", 2024, "lava e seca", 13);
    System.out.println("Comprei uma maquina de lavar da marca "+ maquinaDeLavar.getMarca() + " sua capacidade é de "+ maquinaDeLavar.getCapacidade()
    + " Kg, e agora ela esta ");
    maquinaDeLavar.enxaguar();
    }
}
