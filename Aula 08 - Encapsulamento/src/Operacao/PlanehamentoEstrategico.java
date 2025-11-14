package Operacao;

import Estrategia.Diretoria;

public class PlanehamentoEstrategico extends Diretoria {
    void teste() {
        // System.out.println(super.segredo);    // private - Somente a classe Diretoria pode ter acesso
        // System.out.println(super..memorandoInterno);    // package - Pode ser acessado somente se o arquivo estiver no mesmo pacote que a classe
        System.out.println(super.orcamentoAnual);    // protected - Pode ser acessado de outro pacote quando existe uma relação de herança com a classe
        System.out.println(super.missaoDaEmpresa);    // public - Pode ser acessado por qualquer arquivo
    }
}