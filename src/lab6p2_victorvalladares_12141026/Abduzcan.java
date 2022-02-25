package lab6p2_victorvalladares_12141026;

public class Abduzcan extends Alien{
    private int animales;

    public Abduzcan() {
        super();
    }

    public Abduzcan(int animales, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.animales = animales;
    }

    public int getAnimales() {
        return animales;
    }

    public void setAnimales(int animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
