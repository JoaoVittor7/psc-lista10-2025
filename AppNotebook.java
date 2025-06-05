package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Notebook notebook = new Notebook("Samsung", "Galaxy book4", 2025);

    System.out.print("Comprei um notebook "+ notebook.getModelo() + " da marca " +notebook.getMarca() + " agora ele esta ");

    notebook.executarPrograma();
    }
}
