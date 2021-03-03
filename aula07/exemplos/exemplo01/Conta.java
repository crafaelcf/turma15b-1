package exemplos.exemplo01;

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

    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return numero + ": " + saldo;
    }
}
