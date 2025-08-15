import java.util.Scanner;

public class Exercício01_Aula4 {
    public static void main(String[] args) {

// Faça a tabuada do 1 até a tabuada do 10, utilizando a seguinte formatação: '1X1 = 1' e assim por diante. Utilize o loop 'for'.

        for (int i = 1; i < 11; i++){
            System.out.printf("\nTabuada do %d\n", i);
            for (int j = 1; j < 11; j++ ) {
                System.out.printf("%d X %d = %d\n", i, j, (i * j));
            }
        }

// Agora, repita o mesmo exercício, porém utilizando o loop 'while'
        int i = 1;

        while (i < 11) {
            int j = 1;
            System.out.printf("\nTabuada do %d\n", i);
            while (j < 11) {
                System.out.printf("%d X %d = %d\n", i, j, (i * j));
                j++;
            }
            i++;
        }
    }
}
