package exercicios.exercicio3;

public class App {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Vectra", "Chevrolet", -7.5);

        veiculo.exibir();

        // veiculo.consumo = -7;

        //veiculo.setConsumo(-5);

        System.out.printf("Consumo: %.2f\n" , veiculo.getConsumo());

    }
}

