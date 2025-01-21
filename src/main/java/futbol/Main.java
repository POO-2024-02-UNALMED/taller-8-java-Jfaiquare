package futbol;

public class Main {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Messi", 34, "delantero", (short)789, (byte)10);
        Jugador jugador2 = new Jugador();  
        Portero portero1 = new Portero("Courtois", 29, (short)25, (byte)1);
        
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(portero1);
        
        
        System.out.println("\nDiferencia de edad entre jugadores: " + 
                          jugador1.compareTo(jugador2));
        
      
        Jugador jugador3 = new Jugador("Messi", 34, "delantero", (short)789, (byte)10);
        System.out.println("\n¿Son iguales jugador1 y jugador3?: " + 
                          jugador1.equals(jugador3));
    }
}
