package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        // 1. entrada de dados
        // 1.1 declarar um scanner
        // 1.2 crir 2 variáveis tipo double
        // 1.3 ler as 2 notas digitadas pelo usuario
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        // 2. processamento
        // calcular a média: somar as notas e dividir por 2
        media = (nota1 + nota2) / 2;

        // 3. saída
        // exibir a média
        System.out.println("A média é " + media);

        entrada.close();
    }
}
