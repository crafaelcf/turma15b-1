package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Armando", 5000);
        //Funcionario f2 = new Funcionario();

        Gerente g = new Gerente("Ricardo", 5000, 10);

        f.aumentarSalario(10);
        g.aumentarSalario(10);

        System.out.println("Funcionário: " + f);
        System.out.println("Gerente: " + g);

    }
}
