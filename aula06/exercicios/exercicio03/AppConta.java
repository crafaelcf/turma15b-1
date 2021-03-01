package exercicios.exercicio03;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123);

        if(cc.deposito(100)) {
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Falha na operação");
        }

        if (cc.saque(20)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("O saque não foi feito");
        }

        System.out.println(cc);

    }
}
