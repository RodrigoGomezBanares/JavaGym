
public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("El rango de valores de un byte es entre: " + Byte.MIN_VALUE + " y " + Byte.MAX_VALUE);
        System.out.println("El rango de valores de un short es entre: " + Short.MIN_VALUE + " y " + Short.MAX_VALUE);
        System.out.println("El rango de valores de un int es entre: " + Integer.MIN_VALUE + " y " + Integer.MAX_VALUE);
        System.out.println("El rango de valores de un long es entre: " + Long.MIN_VALUE + " y " + Long.MAX_VALUE);

        //inicializar valores
        byte vByte = 120;
        short vShort = -500;
        int vInt = 30;

        System.out.println("valorByte = " + vByte);
        System.out.println("valorShort = " + vShort);
        System.out.println("valorInt = " + vInt);

        long sumaTotal = 50000 + ((vByte + vShort + vInt) * 10L);

        System.out.println("La suma total es: " + sumaTotal);
        
    }
}
