package exemplos;

public class Exemplo01 {
    
    public static void main(String[] args) {
        System.out.println("Programa de cadastro v. 1.1.2");
        linha2(30); // chamada de método
        System.out.println("Bom dia!");
        linha();

        linha2(15);
        linha2(25);

        int comprimento = 35;
        linha2(comprimento);

        linha3(20, '*');
        linha3(20, '#');

    }
    
    
    static void linha() { // void - nada, não tem
        System.out.println("----------------");
    }

    static void linha2(int tamanho) { 
        for(int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char tipo) { // char é um caracter apenas
        for(int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
    }


}