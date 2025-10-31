package Exemplo02_Aula6;

public class Main {
    public static void main(String[] args) {

        Mensalista mensalista = new Mensalista(92909290, "Giovana", "Técnica de Qualidade", 4000);
        System.out.println(mensalista.toString());

        Horista gabriel = new Horista(92900000, "Gabriel", "Operador de Manufatura", 240, 8.50);
        System.out.printf("O salário de Gabriel é: R$%.2f", gabriel.receberSalario());
    }
}
