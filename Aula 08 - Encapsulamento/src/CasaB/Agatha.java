package CasaB;

import CasaA.Maria;

public class Agatha {
    Maria sogra = new Maria();

    void teste() {
        // System.out.println(sogra.segredo);    // Somente Maria tem acesso
        // System.out.println(sogra.facoDentroDeCasa);    // Somente quem mora na mesma casa (package) que Maria
        // System.out.println(sogra.familiaSabe);    // Somente quem possui relação de herança com Maria
        System.out.println(sogra.todoMundoSabe);    // Todos podem ter acesso
    }
}