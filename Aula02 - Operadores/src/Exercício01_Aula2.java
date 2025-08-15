import java.util.Scanner;

public class Exercício01_Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Crie um programa que leia a temperatura em Fahrenheit e converta para Celsius

        double temperatura, celsius;

        System.out.println("Informe a temperatura que você deseja converter para graus Celsius:");
        temperatura = leia.nextDouble();

        celsius = ((temperatura - 32) / 9) * 5;

        System.out.printf("A temperatura %f convertida em graus Celsius é: %f", temperatura, celsius);
    }
}