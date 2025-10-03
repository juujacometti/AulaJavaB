package Exemplo01_Aula6;

public class DepartamentoMain {
    public static void main(String[] args) {



        Departamento departamento = new Departamento("ETS", 1000000, 450);
        System.out.println(departamento.nome + " " + departamento.orcamento + " " + departamento.numeroFuncionarios);

        departamento.atualizarNome("TPM");
        System.out.println(departamento.nome);

        departamento.exibirDetalhes();

        System.out.println("O orçamento foi de: " + departamento.calcularAumentoDeOrcamento(0.20));

        System.out.printf("O departamento %s tem %.2f funcionários", departamento.nome, departamento.obterNumeroDeFuncionarios());
    }
}
