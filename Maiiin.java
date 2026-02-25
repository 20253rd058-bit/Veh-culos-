public class Maiiin {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Animal Genérico", 5);
        Animal animal2 = new Perro("Max", 3, "Labrador");

        System.out.println("=== Animal Normal ===");
        animal1.hacerSonido();


        
        System.out.println("\n=== Perro ===");
        animal2.hacerSonido(); 
    }}
    

