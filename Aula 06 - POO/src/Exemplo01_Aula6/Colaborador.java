package Exemplo01_Aula6;

public class Colaborador {
    int edv;
    String nome;
    String cargo;

    // Construtor padrão ou sem parâmetros
    Colaborador() {
        System.out.println("O construtor sem parâmetros foi executado");
    }

    // Construtor com um parâmetro
    Colaborador(String nome) {
        this.nome = nome;
        System.out.println("Construtor com um parâmetro foi chamado");
    }

    // Construtor com dois parâmetros
    Colaborador(int edv, String nome) {
        this.edv = edv;
        this.nome = nome;
        System.out.println("Construtor com dois parâmetros foi chamado");
    }

    // Construtor com três parâmetros

    Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
        System.out.println("Construtor com três parâmetros foi chamado");

    }
}
