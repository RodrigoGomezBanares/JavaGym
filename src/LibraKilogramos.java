import java.util.Scanner;

public class LibraKilogramos {
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de libras a convertir en kilogramos: ");
        double libra = leer.nextDouble();
        double equivalencia = 0.453592;
        double kilo = libra * equivalencia;
        
        System.out.printf("%f libras equivalen a %f kilogramos", libra, kilo);
    
    }
}
