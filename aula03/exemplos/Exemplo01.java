package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1; //inicialização

        while(cont <= 10) { //condição = valor final
            System.out.println(cont);
            // cont++; // cont = cont + 1; //passo
            cont += 2; // cont = cont + 2;
        }
        System.out.println("Valor final: " + cont);
    }
}