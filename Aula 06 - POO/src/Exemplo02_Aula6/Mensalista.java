package Exemplo02_Aula6;

public class Mensalista extends Colaborador {
    double bancoDeHoras;
    double salarioMensal;

    public Mensalista(int edv, String nome, String cargo, double salarioMensal) {
        super(edv, nome, cargo);
        this.salarioMensal = salarioMensal;
    }

    double receberSalario() {
        return this.salarioMensal;
    }

//    @Override
//    public String toString() {
//        return "Nome: " + this.nome;
//    }


    @Override
    public String toString() {
        return "Mensalista{" +
                "edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}
