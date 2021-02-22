package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int numeroInt;
        double numeroDouble;

        numeroInt = 12;
        numeroDouble = 10.99;

        // numeroDouble = numeroInt;
        numeroInt = (int) numeroDouble; // casting - conversão

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        numeroDouble = 15.0 / 7;
        System.out.println(numeroDouble);

        numeroDouble = (double)numeroInt / 7;
        System.out.println(numeroDouble);
    }
}
