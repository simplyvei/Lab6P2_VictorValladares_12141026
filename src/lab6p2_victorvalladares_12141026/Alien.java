package lab6p2_victorvalladares_12141026;

public class Alien {
    private String nombre;
    private Raza raza;
    private int edad;
    private boolean amenaza;

    public Alien() {
    }

    public Alien(String nombre, Raza raza, int edad, boolean amenaza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenaza = amenaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmenaza() {
        return amenaza;
    }

    public void setAmenaza(boolean amenaza) {
        this.amenaza = amenaza;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
