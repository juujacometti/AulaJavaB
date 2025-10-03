package Exemplo01_Aula6;

public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;

    public Departamento(String nome, double orcamento, int numeroFuncionarios) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Utiliza-se 'void' pois não retorna nada
    void atualizarNome (String nome) {
        this.nome = nome;
    }

    void exibirDetalhes() {
        System.out.printf("O departamento de %s está com %d funcionários e com o orçamento de %.2f\n", this.nome, this.numeroFuncionarios, this.orcamento);
    }

    double calcularAumentoDeOrcamento(double percentual) {
        return (orcamento * percentual) + orcamento;
    }

    double obterNumeroDeFuncionarios() {
        return numeroFuncionarios;
    }
}
