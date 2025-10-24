package Exemplo02_Aula6;

public class Horista extends Colaborador{
    double HorasTrabalhadas;
    double salarioPorHora;

    public Horista(int edv, String nome, String cargo, double HorasTrbalhadas, double salarioPorHora) {
        super(edv, nome, cargo);
        this.salarioPorHora = salarioPorHora;
    }
}
