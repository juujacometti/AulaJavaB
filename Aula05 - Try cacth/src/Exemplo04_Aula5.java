import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04_Aula5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // O programa só aceita números, e esses números devem ser maior ou igual a 20.
        // Caso forem menores ou forem outros tipos de texto, o programa pede para digitar novamente.
        // O programa só será encerrado quando atender aos critérios.

        int numero;

        while (true) {
            try {
                System.out.print("Digite um número: ");
                numero = leia.nextInt();
                if (numero < 20) {
                    System.out.println("O número que você digitou é menor que 20.");
                    continue;   // Caso chegue nessa condição, o 'continue' reinicia o laço
                }
                break;  // Esse 'break' só será acessado caso o usuário não gere uma tentativa de erro
            } catch (InputMismatchException e) {    // Caso a tentativa de erro, o código repetira o cacth quantas vezes forem necessárias
                System.out.println("Você digitou caracteres inválidos! Digite apenas números.");
            }
            // Serve para evitar "bugs" da função 'nextInt' quando é digitado algo não esperado
            leia.nextLine();    // Para evitar esse tipo de problema, podemos utilizar a conversão de String para número
        }

        System.out.println("O número que você digitou foi: " + numero);
    }
}
