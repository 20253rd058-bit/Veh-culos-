public class Maiin {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Carlos", 1000);
        Empleado empleado2 = new EmpleadoConBono("Ana", 1200, 300);

        System.out.println("=== Empleado Normal ===");
        empleado1.calcularSalario();

        System.out.println("\n=== Empleado con Bono ===");
        empleado2.calcularSalario(); 
    }
}
    

