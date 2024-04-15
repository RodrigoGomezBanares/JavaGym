
public class Caracteres {
    public static void main(String[] args) {
        
        char mySimpleChar = '?'; 
        char myUnicodeChar = '\u003F'; 
        char myDecimalChar = (char) 63;

        // mostrar por pantalla todas las distintas variables de un mismo simbolo/caracter
        System.out.println("Se escribe '?' = " + mySimpleChar + " como un simple caracter. \n" +
                ", ' /u003F ' = "+ myUnicodeChar + " en unicode char. \n" +
                "o '(char) 63 = ' "+myDecimalChar + " en decimal char.");
    }
   
}
