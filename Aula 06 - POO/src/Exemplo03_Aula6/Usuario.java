package Exemplo03_Aula6;

public class Usuario {
    String nome;
    String senha;
    String email;

    Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    void autenticar() {
        System.out.printf("Usuario %s está autenticado.\n", this.nome);
    }

    // Sobrescrita
    // É quando eu tenho na mesma classe métodos com assinaturas diferentes
    void autenticar(String sobrenome) {
        System.out.printf("Usuário %s está autenticado\n", this.nome + sobrenome);
    }

    void concederAcessos() {
        System.out.printf("O usuário %s está com acessos regulares.\n", this.nome);
    }

    void configurar() {

    }
}
