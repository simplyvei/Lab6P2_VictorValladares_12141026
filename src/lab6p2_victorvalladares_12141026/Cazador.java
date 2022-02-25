package lab6p2_victorvalladares_12141026;

public class Cazador extends Alien{
    private int humanos;

    public Cazador() {
        super();
    }

    public Cazador(int humanos, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.humanos = humanos;
    }

    public int getHumanos() {
        return humanos;
    }

    public void setHumanos(int humanos) {
        this.humanos = humanos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
