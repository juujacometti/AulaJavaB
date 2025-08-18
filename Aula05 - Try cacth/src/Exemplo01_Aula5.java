import java.util.Scanner;

public class Exemplo01_Aula5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Tentativa de execução
        try {
            int numero = leia.nextInt();
            System.out.println(numero);
        // Só aparece caso a tentaiva gere erro
        } catch (Exception e) {     // e -> Apenas uma variável, pode ser nomeada de outras maneiras
            System.out.println("Digite apenas números!");
        }
    }
}

