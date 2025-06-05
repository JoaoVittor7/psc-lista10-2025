package atividadesfaculdade;

public class App {
public static void main(String[] args) {
    Celular celular = new Celular("Iphone", "13 pro", 2021);

    System.out.print("Comprei um "+celular.getMarca() + celular.getModelo() + " e atualmente ele esta "); 
    celular.EnviarEmails();
    }
}
