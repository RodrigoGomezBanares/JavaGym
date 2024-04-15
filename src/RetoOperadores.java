public class RetoOperadores {
    public static void main(String[] args) {
        
        //variables
        double primerV = 25.00d;
        double segundoV = 65.00d;

        //sumar el primer y el segundo valor, luego multiplicarlo por 100
        double ope = (primerV + segundoV) * 100.00d;
        System.out.printf("La suma de %f + %f multiplicado por 100.00 = %f \n", primerV, segundoV, ope);
        
        //calcular el resto con 40
        double resto = ope % 48.00d;
                System.out.printf("El resto de %f y 48.00 = %f \n", ope, resto);
       
        //Calculo Booleano
        boolean noResto = (resto == 0.00);
        System.out.println("resto perfecto: "+ noResto);
        
        //imprimir resultado
        if (!noResto){
            System.out.println("Se obtuvo un resto de la operacion");
        }
        
                
        

        
        
        
                
    }
    
}
