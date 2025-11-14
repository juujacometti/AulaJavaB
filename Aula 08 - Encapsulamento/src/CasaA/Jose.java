package CasaA;

public class Jose {
    Maria esposa = new Maria();

    void teste() {
        // System.out.println(esposa.segredo);    // Gera um erro pois só é visível dentro da classe Maria
        System.out.println(esposa.facoDentroDeCasa);    // É visível pois Jose está no mesmo package que Maria
        System.out.println(esposa.familiaSabe);
        System.out.println(esposa.todoMundoSabe);
    }
}