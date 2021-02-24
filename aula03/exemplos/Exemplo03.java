package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valor;
        char resposta;

        resposta = 's';
        
        while( resposta == 's' || resposta == 'S') {
            System.out.println("Digite um número: ");
            valor =  Integer.parseInt(entrada.nextLine());
            
            System.out.println("Valor lido: " + valor);

            System.out.println("Quer continuar(S/N)?");
            resposta = entrada.nextLine().charAt(0);
        }
        entrada.close();
    }
}
