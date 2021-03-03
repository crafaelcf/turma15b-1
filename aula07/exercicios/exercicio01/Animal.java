package exercicios.exercicio01;

public class Animal {
    private String nome, raca, cor;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int anoNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario();
    }

    public Animal(String nome, String raca, String cor, int anoNascimento, String nomeProprietario, String telefone) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(nomeProprietario, telefone);
    }

    public Animal(String nome, String raca, String cor, int anoNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return nome + ", " + raca+ ", " + cor + ", " + anoNascimento + " -- " + proprietario;
    }

}
