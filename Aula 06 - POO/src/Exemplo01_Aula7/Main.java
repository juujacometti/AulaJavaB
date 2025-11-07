package Exemplo01_Aula7;

public class Main {
    public static void main(String[] args) {

        Circulo circuloRosa = new Circulo("Rosa", 2);
        System.out.printf("A área do circulo %s é de %.2f\n", circuloRosa.cor, circuloRosa.calcularArea());

        Circulo circuloRoxo = new Circulo("Roxo", 3);
        System.out.printf("A área do circulo %s é de %.2f\n", circuloRoxo.cor, circuloRoxo.calcularArea());

        // É possível alterar o valor de uma variável estática realizando a alteração dentro da classe
        // Circulo.PI = 0;
        // System.out.printf("A área do circulo %s é de %.2f\n", circuloRosa.cor, circuloRosa.calcularArea());
        // System.out.printf("A área do circulo %s é de %.2f\n", circuloRoxo.cor, circuloRoxo.calcularArea());


        Investimento investimentoDeMarcelo = new Investimento("Marcelo", 1000);
        System.out.printf("\n\nO investimento de %s está com o saldo de R$%.2f\n", investimentoDeMarcelo.nomeDoInvestidor, investimentoDeMarcelo.saldoAtual);
        investimentoDeMarcelo.rentabilizar();
        System.out.printf("Após a rentabilização, o investimento de %s está com o saldo de R$%.2f\n", investimentoDeMarcelo.nomeDoInvestidor, investimentoDeMarcelo.saldoAtual);

        // Alteração da taxa de investimento
        Investimento investimentoDeNick = new Investimento("Nick", 1000);
        Investimento.taxaDeRentabilidade = 0.03;    // Alteração da variável estática
        System.out.printf("\nO investimento de %s está com o saldo de R$%.2f\n", investimentoDeNick.nomeDoInvestidor, investimentoDeNick.saldoAtual);
        investimentoDeNick.rentabilizar();
        System.out.printf("Após a rentabilização, o investimento de %s está com o saldo de R$%.2f\n", investimentoDeNick.nomeDoInvestidor, investimentoDeNick.saldoAtual);


        System.out.print("\n\nContagem de licenças atual: " + Licenca.retornarLicencasAtribuidas());

        Licenca windows = new Licenca("Windows", "CaP/ETS");
        System.out.print("\nContagem de licenças após compra do Windows: " + Licenca.retornarLicencasAtribuidas());

        Licenca docker = new Licenca("Docker", "BD/XD");
        System.out.print("\nContagem de licenças após compra do Docker: " + Licenca.retornarLicencasAtribuidas());


        Instrutor instrutor = new Instrutor("Francis");
        Treinamento treinamento = new Treinamento("Power BI", 4000, true, instrutor);
        System.out.println("\n" + treinamento);
    }
}