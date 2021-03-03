package exemplos.exemplo01;

import java.util.ArrayList;

public class GerenciaContas_old {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas_old() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new ContaPoupanca(numeroConta));
    }

    public boolean deposito(int numeroConta, double valor) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false; // não achou a conta
    }

    public boolean saque(int numeroConta, double valor) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                return conta.saque(valor);
            }
        }
        return false; // não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta conta : listaDeContas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }
}
