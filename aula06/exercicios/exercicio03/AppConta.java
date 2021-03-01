package exercicios.exercicio03;

public class AppConta {
    public static void main(String[] args) {
        // ContaCorrente cc = new ContaCorrente(123);
        // ContaEspecial ce = new ContaEspecial(321, 200);
        ContaPoupanca cp = new ContaPoupanca(333);

        ContaPoupanca.setTaxaDeSaque(0.15);

        if(cp.deposito(100)) {
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Falha na operação");
        }

        if (cp.saque(100)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("O saque não foi feito");
        }

        System.out.println(cp);

    }
}
