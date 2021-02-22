package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // 1. entrada
        // ler o custo
        Scanner entrada = new Scanner(System.in);
        double custoFabrica, imposto, precoFinal;

        System.out.println("Informe o valor do custo de fabrica: ");
        custoFabrica = entrada.nextDouble();

        // 2. processamento
        // calcular o imposto e preço final
        imposto = custoFabrica * 0.45;
        precoFinal = custoFabrica + imposto + custoFabrica * 0.28;
        
        // 3. saída
        // exibir o imposto e o preço final
        System.out.println("Valor do imposto: " + imposto);
        System.out.println("Preço final: " + precoFinal);

        entrada.close();
    }
}
