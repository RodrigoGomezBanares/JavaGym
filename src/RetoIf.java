public class RetoIf {
    public static void main(String[] args) {
        
        //variables:
        boolean gameOver = true;
        int puntaje = 9999;
        int NivelesCompletados = 8;
        int enemigosDerrotados = 200;
        int bonus = 500;
        int puntajeFinal = puntaje;
        
        //Calculo de puntaje final
        if(gameOver){
            puntajeFinal += (NivelesCompletados * puntaje + enemigosDerrotados * bonus);
            
            System.out.printf("""
                           Fin de la partida - Resultados: 
                               Enemigos derrotados: %d 
                               Niveles completados: %d 
                               Bonus: %d 
                               Puntaje final: %d """, enemigosDerrotados, NivelesCompletados, bonus, puntajeFinal);
        }
        
    }
}
