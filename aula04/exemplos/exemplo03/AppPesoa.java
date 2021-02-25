package exemplos.exemplo03;

public class AppPesoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson", 5000); // instanciando um objeto do tipo Pessoa
        Pessoa p2 = new Pessoa("Carlos", 3000);

        p.apresentar();

        p2.apresentar();
    }

}
