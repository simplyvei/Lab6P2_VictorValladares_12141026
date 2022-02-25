package lab6p2_victorvalladares_12141026;

public class Raza {
    private Planeta primordial;
    private String nombre;

    public Raza() {
    }

    public Raza(Planeta primordial, String nombre) {
        this.primordial = primordial;
        this.nombre = nombre;
    }

    public Planeta getPrimordial() {
        return primordial;
    }

    public void setPrimordial(Planeta primordial) {
        this.primordial = primordial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
