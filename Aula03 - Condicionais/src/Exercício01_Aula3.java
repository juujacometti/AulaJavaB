import java.util.Scanner;

public class Exercício01_Aula3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double media = 7.1;
        int faltas = 20;
        boolean postura = true;

        String situacao;

        // Verdadeiro ou falso
        if (media >=  5 && faltas < 25 && postura == true) {
            situacao = "Aprovado";
        }
        else if (media < 5.0  && faltas < 25 && postura) {
            situacao = "Recuperação";
        }
        else if (media >= 5 && faltas >= 25 && postura) {
            situacao = "Sem férias";
        }
        else if (media >= 5 && faltas < 25 && postura == false) {
            situacao = "Chamar para conversar";
        }
        else {
            situacao = "Reprovado";
        }

        System.out.println(situacao);
    }
}
