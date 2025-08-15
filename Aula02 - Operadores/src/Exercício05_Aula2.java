import java.util.Scanner;

public class Exercício05_Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Crie um programa que leia o valor da base e da altura de um triângulo e calcule a área

        double base, altura, area;

        System.out.println("Informe o valor da base do triângulo:");
        base = leia.nextDouble();
        System.out.println("Agora, informe o valor da altura do triângulo:");
        altura = leia.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("O valor da área de um triângulo com essas medidas é de: %.2fcm²", area);
    }
}
