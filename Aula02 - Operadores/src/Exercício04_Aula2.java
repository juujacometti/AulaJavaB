import java.util.Scanner;

public class Exercício04_Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Crie um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor

        int numero;
        double potencia;

        System.out.println("Insira um número para descobrir seu vqlor ao quadrado e ao cubo:");
        numero = leia.nextInt();

        potencia = Math.pow(numero, 2);

        System.out.printf("O número %d\nAo quadrado: %.2f", numero, potencia);

        potencia = Math.pow(numero, 3);

        System.out.printf("\nAo cubo: %.2f", potencia);


    }
}
