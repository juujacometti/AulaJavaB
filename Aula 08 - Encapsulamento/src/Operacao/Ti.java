package Operacao;

import Estrategia.Diretoria;

public class Ti {
    Diretoria diretoria = new Diretoria();

    void teste() {
        // System.out.println(diretoria.segredo);    // private - Somente a classe Diretoria pode ter acesso
        // System.out.println(diretoria..memorandoInterno);    // package - Pode ser acessado somente se o arquivo estiver no mesmo pacote que a classe
        // System.out.println(diretoria.orcamentoAnual);    // protected - Pode ser acessado de outro pacote quando existe uma relação de herança com a classe
        System.out.println(diretoria.missaoDaEmpresa);    // public - Pode ser acessado por qualquer arquivo
    }
}