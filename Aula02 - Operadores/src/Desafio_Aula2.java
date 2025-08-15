public class Desafio_Aula2 {
    public static void main(String[] args) {

        // Declaração de números negativos como variável
        double x = -3, y = -2, z = -1;
        double divisao = (x / 4),  potencia2 = Math.pow(3, z) ;

        // Cálculo
        double resultado = ((3 * Math.pow(divisao, y)) + (6 * (potencia2 / 4) - 4)) / (7 * Math.pow(divisao, z) + 2);
        double total = (Math.pow(resultado, z)) + 4;

        System.out.println(total);
    }
}
