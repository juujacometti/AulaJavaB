import java.util.Scanner;

public class Exemplo03_Aula4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 0, acumulador = 0;

        while (contador < 5) {
            contador ++;
            System.out.print("Digite um número: ");
            acumulador += leia.nextInt();
            System.out.printf("Contador está em: %d\nAcumulador está em: %d\n", contador, acumulador);
        }
    }
}
