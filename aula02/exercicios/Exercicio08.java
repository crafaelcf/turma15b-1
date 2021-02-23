package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // 1. entrada
        // 3 lados
        Scanner teclado = new Scanner(System.in);
        int lado1, lado2, lado3;
        boolean ehTriangulo;
        String resposta;

        System.out.println("Digite os valores dos três lados:");
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();

        // 2. processamento
        // 2.1 verificar se é um triângulo
        // 2.2 classificar o triângulo

        ehTriangulo = (lado1 <= lado2 + lado3) && (lado2 <= lado1 + lado3) && (lado3 <= lado2 + lado1);

        if(ehTriangulo) {
            if( lado1 == lado2 && lado2 == lado3 ) {
                resposta = "O triângulo é equilátero";
            } else {
                if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    resposta = "O triângulo é Isósceles";
                } else {
                    resposta = "O triângulo é Escaleno";
                }
            }

        } else { // não forma um triângulo
            resposta = "Os lados não formam um triângulo";
        }

        // 3. saída 
        System.out.println(resposta);

        teclado.close();
    }
}
