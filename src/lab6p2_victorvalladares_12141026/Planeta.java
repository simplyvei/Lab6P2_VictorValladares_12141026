
package lab6p2_victorvalladares_12141026;

import java.util.ArrayList;

public class Planeta {
    private String nombre;
    private boolean agua;
    private int size;
    private int temperatura;
    ArrayList <Alien> habitantes = new ArrayList();

    public Planeta() {
    }

    public Planeta(String nombre, boolean agua, int size, int temperatura) {
        this.nombre = nombre;
        this.agua = agua;
        this.size = size;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<Alien> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Alien> habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
