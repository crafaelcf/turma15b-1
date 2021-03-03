package exemplos.exemplo04;

public class Endereco {
    private String logradouro;
    private int numero;

    public Endereco(String logradouro, int numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String toString() {
        return logradouro + ", " + numero;
    }
}
