package Estrategia;

public class Financeiro {
    Diretoria diretoria = new Diretoria();

    void teste() {
        // System.out.println(diretoria.segredo);    // private - Somente a classe Diretoria pode ter acesso
        System.out.println(diretoria.memorandoInterno);    // package - Arquivos que estão dentro do mesmo package podem ter acesso
        System.out.println(diretoria.orcamentoAnual);    // protected - Apenas aqueles que possuem relação de herança com a classe podem ter acesso
        System.out.println(diretoria.missaoDaEmpresa);    // public - Todos podem ter acesso
    }
}