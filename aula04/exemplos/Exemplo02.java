package exemplos;

public class Exemplo02 {
    
    public static void main(String[] args) {
        int resultado;

        resultado = soma(12, 5);

        System.out.println("A soma é " + resultado);
    }

    static int soma(int valor1, int valor2) {
        int resposta;

        resposta = valor1 + valor2;

        return resposta; // return = termina a execução e devolve o valor
    }

}
