package Exemplo01_Aula7;

public class Licenca {
    String software;
    String departamento;

    static int licencasAtribuidas;

    public Licenca(String software, String departamento) {
        this.software = software;
        this.departamento = departamento;
        licencasAtribuidas++;    // A cada vez que uma licença for instanciada, uma licença será adicionada.
    }

    // Método estático
    static int retornarLicencasAtribuidas() {
        return licencasAtribuidas;
    }
}