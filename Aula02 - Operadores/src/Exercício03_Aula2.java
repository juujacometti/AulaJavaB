import java.util.Scanner;

public class Exercício03_Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Crie um programa que leia o peso e a altura de um usuário e imprima o IMC

        double peso, altura, imc;

        System.out.println("Informe o seu peso em Kg:");
        peso = leia.nextDouble();
        System.out.println("Informe a sua altura em metros:");
        altura = leia.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f", imc);
    }
}
