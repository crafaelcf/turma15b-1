package exemplos.exemplo01;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(56);
        lista.add(23);
        lista.add(76);

        System.out.println(lista);

        System.out.println(lista.get(1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("procurando no índice " + i);
            if (lista.get(i) == 56) {
                System.out.println("Achei no índice: " + i);
                break; // interrompe o laço
            }
        }

        for (Integer numero : lista) { // para cada "numero" da "lista" faça
            if(numero == 56) {
                System.out.println("Achei");
                break;
            }
        }

    }
}
 