package CasaB;

import CasaA.Maria;

public class Joao extends Maria {
    void teste() {
        // System.out.println(super.segredo);    // Soemnete a classe Maria tem acesso
        // System.out.println(super.facoDentroDeCasa);    // Somente quem está no mesmo package (casa) de Maria
        System.out.println(super.familiaSabe);    // É vísivel em packages diferentes, porém deve existir uma relação de herança
        System.out.println(super.todoMundoSabe);
    }
}