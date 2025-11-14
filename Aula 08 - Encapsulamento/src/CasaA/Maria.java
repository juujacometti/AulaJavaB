package CasaA;

public class Maria {
    private String segredo = "Roubei um carro";    // Somente Maria sabe
    String facoDentroDeCasa = "Ronca durante o sono";    // Visível para quem está na casaA
    protected String familiaSabe = "Deve no banco";    // Visível para quem está na casaB
    public String todoMundoSabe = "Vai no bar";    // Todos sabem

    void teste() {
        System.out.println(this.segredo);
        System.out.println(this.facoDentroDeCasa);
        System.out.println(this.familiaSabe);
        System.out.println(this.todoMundoSabe);
    }
}