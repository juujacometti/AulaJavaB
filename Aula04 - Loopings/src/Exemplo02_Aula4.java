// .equalsIgnoreCase -> Função para verificar se a String é igual ao solicitado, porém, ignorando se está em maiúsculo / minúsculo

import java.util.Scanner;

public class Exemplo02_Aula4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String valor = "";

// Toda vez que o usuário digitar algo dsiferente de "sair", o código continua.
// Quando o usuário digitar a palavara "sair, o código encerra."

        // '=='' só funciona para tipos primitivos de dados, para strings, utilizamos .equals()
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Digite algo: ");
            valor = leia.nextLine();
        }

        leia.close();
    }
}
