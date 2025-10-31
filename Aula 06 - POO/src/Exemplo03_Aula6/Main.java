package Exemplo03_Aula6;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Isabela", "12345678", "isabela@ets.com.br");
        usuario.autenticar();
        usuario.concederAcessos();

        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Julya", "12345678", "julya@ets.com.br");
        usuarioAdmin.autenticar();
        usuarioAdmin.concederAcessos();
    }
}
