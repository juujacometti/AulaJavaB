package Exemplo01_Aula7;

public class Treinamento {
    String nome;
    double preco;
    boolean exclusivoParaGestores;

    Instrutor instrutor;

    public Treinamento(String nome, double preco, boolean exclusivoParaGestores, Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.exclusivoParaGestores = exclusivoParaGestores;
        this.instrutor = instrutor;
    }

    @Override
    public String toString() {
        return String.format("\n\nO treinamento de %s está com o preço de R$%.2f e ele %s exclusivo para gestores e mistrado pelo treinador %s.", this.nome, this.preco, this.exclusivoParaGestores ? "é" : "não é", this.instrutor);
    }
}
