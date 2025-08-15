import java.util.Scanner;

public class Exercício02_Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Crie um programa que leia a temperatura em Celsius e converta para Fahreinheit

        double temperatura, fahrenheit;

        System.out.println("Informe a temperatura em garus Celsius que você deseja converter para Fahrenheit:");
        temperatura = leia.nextInt();

        fahrenheit = (temperatura * 1.8) + 32;

        System.out.printf("A temperatura %f convertida em graus Fahrenheit é: %f", temperatura, fahrenheit);
    }
}
