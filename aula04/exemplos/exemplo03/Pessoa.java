package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;
    double salario;

    //métodos

    // método construtor = inicializar o objeto
    Pessoa(String n, double s) {
        nome = n;
        salario = s;
    }


    void apresentar() {
        System.out.println("Olá! Eu sou " + nome + " e ganho " + salario);
    }



}
