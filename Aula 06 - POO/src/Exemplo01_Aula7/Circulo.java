package Exemplo01_Aula7;

public class Circulo {
    // Cor e raio são variáveis dinâmicas, pois mudam de acordo com o objeto instanciado
    String cor;
    double raio;
    static final double PI = Math.PI;    // É uma constante, pois não se altera dentro do código

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea() {
        return PI * this.raio * this.raio;    // Fórmula da área de um círculo
    }
}
