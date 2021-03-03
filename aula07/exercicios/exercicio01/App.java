package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Lulu", "Doberman", "Marom", 2020);
        Animal animal2 = new Animal("Lulu", "Doberman", "Marom", 2020, "Carlos", "(11) 9876-9876");
        
        Proprietario proprietario = new Proprietario("Carlos", "(11) 9876-9876");
        Animal animal3 = new Animal("Lulu", "Doberman", "Marom", 2020, proprietario);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
