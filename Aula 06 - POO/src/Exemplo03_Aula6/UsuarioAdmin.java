package Exemplo03_Aula6;

public class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nome, String senha, String email) {
        super(nome, senha, email);
    }

    // Sobrecarga de métodos
    // Sobrecarga é sempre quando temos relação de heranças.
    @Override
    void concederAcessos() {
        super.concederAcessos();    // Herda características do outro método conceder acessos.
        System.out.printf("O usuário %s está com acessos administrativos.", this.nome);
    }


}
