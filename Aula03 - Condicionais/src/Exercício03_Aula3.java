import java.util.Scanner;

public class Exercício03_Aula3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para verificar se ele é par ou ímpar:");
        numero = leia.nextInt();

        if (numero % 2 == 0){
            System.out.printf("O número %d é par.", numero);
        }
        else{
            System.out.printf("O número %d é ímpar.", numero);
        }

    }
}
