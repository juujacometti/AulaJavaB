package Exemplo04_Aula6;

public class Main {
    public static void main(String[] args) {

        Prioridade prioridade = Prioridade.BAIXA;

        switch (prioridade) {
            case BAIXA -> System.out.println("Chamado com prioridade baixa, resolver quando houver disponibilidade.");
            case MEDIA -> System.out.println("Chamado com prioridade média, resolver assim que possível.");
            case ALTA -> System.out.println("Chamado com prioridade alta, resolver o quanto antes.");
            case URGENTE -> System.out.println("Chamado urgente, resolver agora.");


        }

    }
}
