package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Object otro) {
        if (!(otro instanceof Portero)) {
            return 0;
        }
        return Math.abs(this.golesRecibidos - ((Portero) otro).golesRecibidos);
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
}
