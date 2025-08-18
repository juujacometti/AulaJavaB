import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo03_Aula5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroEmTexto = leia.nextLine();

        try {
            int numeroEmInt = Integer.parseInt(numeroEmTexto);  // Conversor de String para inteiro
            System.out.println("O número que você digitou foi: " + numeroEmInt);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Formato incorreto. Digite apenas números!");
        } finally {
            System.out.println("Finally é sempre executado");
        }

    }
}
