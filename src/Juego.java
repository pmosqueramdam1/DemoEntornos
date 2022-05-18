package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String[] args)
    {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;
        int rondasJugadas = 0;    // Número de rondas jugadas
        int exitosJugador1 = p1.exitos;
        int exitosJugador2 = p2.exitos;
        int empates = 0;
        String opcionJugador1;
        String opcionJugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcionJugador1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++p2.exitos;
                
            }
            else if((opcionJugador1.equals("papel")) && ( opcionJugador2.equals("piedra")))
            {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras")))
            {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra")))
            {
            	exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel")))
            {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras")))
            {
            	exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJugador1.equals(opcionJugador2))
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.exitos >= 3) || (p2.exitos >= 3))
            {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(!finDeJuego);
    }
}
/**
 * Clase que representa al Jugador
 */
class Jugador{

    int exitos;      // número de partidas ganadas

    /**
     * Constructor de Jugador
     */
    public Jugador() {
        this.exitos = 0;
    }

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion = "";
        int c = (int)(Math.random() * 3);
        switch (c) {
            case 0 -> opcion = ("piedra");
            case 1 -> opcion = ("papel");
            case 2 -> opcion = ("tijeras");
        }
        return opcion;
    }
    public void setExitos()
    {
        exitos++;
    }
    public int getExitos()
    {
        return exitos;
    }
}
