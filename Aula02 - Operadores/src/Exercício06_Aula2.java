import java.util.Scanner;

public class Exercício06_Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Crie um programa que resolva equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

        double a, b, c, delta, x, x_negativo;

        System.out.println("Para realizar o cálculo da fórmula de Bhaskara, informe o valor de a:");
        a = leia.nextDouble();
        System.out.println("Informe o valor de b:");
        b = leia.nextDouble();
        System.out.println("Informe o valor de c:");
        c = leia.nextDouble();

        delta = Math.sqrt(Math.pow(b, 2) - ((4 * a) * c));

        // Positivo
        x = (-(b) + delta) / 2 * a;

        //Negativo
        x_negativo = (-(b) - delta) / 2 * a;

        System.out.printf("A fórmula de Bhaskara, de acordo com esses valores é:\nDelta: %.2f\nX positivo: %.2f\nX negativo: %.2f", delta, x, x_negativo);

    }
}
