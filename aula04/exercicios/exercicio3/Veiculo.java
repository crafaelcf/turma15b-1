package exercicios.exercicio3;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo; // this se refere ao próprio objeto
        this.marca = marca;
        setConsumo(consumo);
    }

    public void exibir() {
        System.out.println("Veiculo-> " + modelo + " : " + marca);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        if(consumo > 0) {
            this.consumo = consumo;
        }
    }

}
