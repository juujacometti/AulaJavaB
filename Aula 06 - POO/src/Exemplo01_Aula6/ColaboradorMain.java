package Exemplo01_Aula6;

public class ColaboradorMain {
    public static void main(String[] args) {

        // Classe   // Instância
//        Colaborador colaborador = new Colaborador();    // Instanciação
//        colaborador.nome = "Julya";
//        colaborador.cargo = "Técnica de Qualidade";
//        colaborador.edv = 92901234;
//        System.out.println(colaborador.nome);

        Colaborador colaborador = new Colaborador("Letice");
        System.out.println(colaborador.nome);

        Colaborador colaborador1 = new Colaborador(92904321, "Layslle");
        System.out.println(colaborador1.edv + " " + colaborador1.nome);

        Colaborador colaborador2 = new Colaborador(92901234, "Yasme", "Aprendiz da JJ");
        System.out.println(colaborador2.edv + " " + colaborador2.nome + " " + colaborador2.cargo);
    }
}
