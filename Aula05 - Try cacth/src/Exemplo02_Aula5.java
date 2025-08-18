import java.util.Scanner;

public class Exemplo02_Aula5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String numeroEmTexto = leia.nextLine();
        int numeroEmInt = Integer.parseInt(numeroEmTexto);  // Converte Strings em números inteiros
        Double numeroEmDouble = Double.parseDouble(numeroEmTexto);  // Converte Strings em números do tipo double
        int numero = 18;
        String numeroEmString = Integer.toString(numero);   // Converte números em String

        System.out.println(numeroEmTexto + 18);
        System.out.println(numeroEmInt + 18);
        System.out.println(numeroEmDouble + 18);
        System.out.println(numeroEmString + 18);
    }
}
