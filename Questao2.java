import java.util.Scanner;

public class Questao2 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Digite o numero:");

    int numero = scanner.nextInt();  // Read user input
    System.out.println("antes: " + (numero-1) + "depois: " + (numero+1));  // Output user input
   }
 
}
