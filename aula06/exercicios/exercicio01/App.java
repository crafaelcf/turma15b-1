package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("São Paulo", "Palmeiras");
        Placar p3 = new Placar("São Paulo", "Palmeiras", 2, 1);

        System.out.println(p1.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());
    }
}
