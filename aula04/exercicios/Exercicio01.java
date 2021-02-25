package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor inteiro:");
        valor = entrada.nextInt();

        System.out.println(ehPar(valor));

        if (ehPar2(valor)) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

        entrada.close();
    }

    // métodos

    public static String ehPar(int numero) {
        if (numero % 2 == 0) {
            return "É par";
        } else {
            return "É impar";
        }
    }

    public static boolean ehPar2(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
