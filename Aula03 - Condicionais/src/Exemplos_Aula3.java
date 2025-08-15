import java.util.Scanner;

public class Exemplos_Aula3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Modificando as cores do terminal
        String negritoVermelhoPreto = "\033[1;31;40m";
        String reset = "\033[0m";
        System.out.println(negritoVermelhoPreto.concat("Texto"));
        System.out.println(reset+"Texto");

        // Operador relacional
        // Operadores relacionais sempre retornam valores booleanos - true ou false
        String minhaString = "Like a Bosch"; // '=' Atribuição
        System.out.println(10 == 5 + 5); // '==' igualdade
        System.out.println('A' != 'a'); // '!=' diferente de
        System.out.println(20 > 15); // Maior que
        System.out.println(10 < 15); // Menor que
        System.out.println(10 <= 10); // Menor ou igual a
        System.out.println(15 >= 15); // Maior ou igual a

        // Operador lógico
        // && -> and
        // || -> or
        // ! -> not //Inversor lógico
        // ^ -> xor // aceita somente uma das condições do 'or' como verdadeira. caso ambas as condições sejam verdadeiras, seu resultado é falso.

        boolean condicao1 = true, condicao2 = 15 < 12;

        System.out.println(condicao1);
        System.out.println(condicao2);
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(!condicao1);
        System.out.println(condicao1 ^ condicao2);

        // Incremento
        //x++; x += 1; -> Significa x = x + 1

        // Operador ternário
        String resultado;
        double media = 4.9;

        resultado = media <= 5 ? "Aprovado" : "Reprovado"; // Ao lado esquerdo do '?' valor se verdadeiro, ao lado direito de ':' valor se falso
        System.out.println(resultado);






    }
}