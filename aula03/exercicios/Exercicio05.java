package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares;
        final int QTDE_NUMEROS = 10;

        pares = 0;

        for(int i = 1; i <= QTDE_NUMEROS ; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = entrada.nextInt();
            if(numero % 2 == 0) {
                pares++;
            } 
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + (QTDE_NUMEROS - pares));
        entrada.close();
    }
}
