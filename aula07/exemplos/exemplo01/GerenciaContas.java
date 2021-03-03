package exemplos.exemplo01;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> mapaDeContas;

    public GerenciaContas() {
        mapaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        mapaDeContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        mapaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        mapaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean deposito(int numeroConta, double valor) {
        Conta conta = mapaDeContas.get(numeroConta);

        if(conta != null) {
            return conta.deposito(valor);
        }
        return false;
    }

    public boolean saque(int numeroConta, double valor) {
        Conta conta = mapaDeContas.get(numeroConta);

        if(conta != null) {
            return conta.saque(valor);
        }
        return false;
    }

    public String exibirSaldo(int numeroConta) {
        Conta conta = mapaDeContas.get(numeroConta);

        if(conta != null) {
            return conta.toString();
        }
        return "Conta não encontrada";
    }
}
