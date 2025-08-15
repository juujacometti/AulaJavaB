import java.util.Scanner;

public class Exercício04_Aula3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// Ao digitar um número no terminal => múltiplo de 2 (print Fizz), múltiplo de 5 (Buzz), múltiplo de 2 e 5 (FizzBuzz) e caso nenhuma das condições sejam satisfeiras (erro)

        int numero;

        System.out.println("Insira um número:");
        numero = leia.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (numero % 5 == 0){
            System.out.println("Buzz");
        }
        else if (numero % 2 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println("Erro!");
        }
    }
}
