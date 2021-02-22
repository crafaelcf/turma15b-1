package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // 1 entrada
        // 1.1 salario minimo e quantidade kw
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, qtdeKw, valorKw, valorTotal, valorComDesconto;

        System.out.println("Informe o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Informe a quantidade de Kw consumido:");
        qtdeKw = entrada.nextDouble();

        // 2 processamento
        // 2.1 valor de 1 kw
        // 2.2 valor total a ser pago
        // 2.3 desconto de 15%
        valorKw = salarioMinimo / 500;
        valorTotal = valorKw * qtdeKw;
        valorComDesconto = valorTotal * 0.85;

        // 3 saída
        // cada um dos valores calculados
        System.out.println("Cada KW custa " + valorKw);
        System.out.println("Valor total a ser pago: " + valorTotal);
        System.out.println("Valor com desconto: " + valorComDesconto);

        entrada.close();
    }
}
