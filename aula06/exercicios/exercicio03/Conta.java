package exercicios.exercicio03;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor; // saldo = saldo + valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if(valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return numero + ": " + saldo;
    }
}
