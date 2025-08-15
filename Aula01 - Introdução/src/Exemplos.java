import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {

// Tipos de variáveis inteiras
        byte variavelByte = 127;  // Padrao de nomenclatura camelCase
        // System.out.println(variavelByte);
        System.out.printf("Tamanho do byte: %d e também %d\n", variavelByte, 10);  // Print formatado

        short variavelShort = 32767;
        System.out.println(variavelShort);

        int variavelInt = 2147483647;
        System.out.printf("Tamanho do int: %d", variavelInt);

        long variavelLong = 9_223_372_036_854_775_807L;
        System.out.printf("Tamanho do long: %d", variavelLong);


// Tipos de varáveis reais
        float variavelFloat = 3.4e+38F;
        System.out.printf("Valor do float : %f", variavelFloat);

        double variavelDouble = 1.7e+308;
        System.out.printf("Valor do double : %f", variavelDouble);


// Outros tipos de variáveis:
        char variavelCaractere = 'J'; // Sempre aspas simples, pois é um único caractere
        System.out.printf("Meu caractere é: %c", variavelCaractere);

        boolean variaveBoolean = true;
        System.out.printf("Meu booleano é: %b", variaveBoolean);

        String variavelString = "Bem vindo a Bosch!";
        System.out.println(variavelString);
        System.out.println(variavelString.length()); // Rerorna a quantidade de caracteres (incluindo os espaços)
        System.out.println(variavelString.toUpperCase()); // Torna todos os caracteres maiúsculos
        System.out.println(variavelString.toLowerCase()); // Torna todos os caracteres minúsculos
        System.out.println(variavelString.charAt(4)); // Retorna um caractere de uma posição específica


// Operações matemáticas:
        int numero1 = 9, numero2 = 2;

        System.out.println(numero1 + numero2); // Adição
        System.out.println(numero1 - numero2); // Subtração
        System.out.println(numero1 * numero2); // Multiplicação
        System.out.println(numero1 / numero2); // Divisão
        System.out.println(numero1 % numero2); // Resto da divisão

        // Potenciação e Raiz
        double potencia = Math.pow(2, 3); //Primeiro elemento é a base e o segundo é o expoente
        System.out.println(potencia);

        double raiz = Math.sqrt(4.0); // Função para raiz quadrada
        System.out.println(raiz);

// Inserção de dados via teclado
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número:");
        numero = scanner.nextInt(); // Entrada de dados pelo usuário
        System.out.println("O número que você digitou foi: " + numero);

        scanner.nextLine(); // É necessário colocar scanner.nextLine após um nextInt e antes de uma string, pois o Enter após o número gera uma "string vazia" e para não ocorrer um "bug", é necessário colocar esta linha.

        String nome;
        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();
        System.out.println("O seu nome é: " + nome);


    }
}


