import java.util.Scanner;
public class iva{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        //constante
        final double IVA = 0.16;
        double producto1 ;
        double producto2;
        double producto3;        
        double ope;
        double total;
        System.out.println("introduce el producto 1");
        producto1 = scanner.nextDouble();
        System.out.println("introduce el producto 2");
        producto2 = scanner.nextDouble();
        System.out.println("introduce el producto 3");
        producto3 = scanner.nextDouble();
        ope = (producto1 + producto2 + producto3) * IVA;
        total = ope + producto1 + producto2 + producto3;
        System.out.println("el total es:" + total);
        producto1 = scanner.nextDouble();
    
}
}
