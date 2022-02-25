package lab6p2_victorvalladares_12141026;

import java.util.ArrayList;

public class Conquistador extends Alien{
    ArrayList <Planeta> conquistados = new ArrayList ();

    public Conquistador() {
        super();
    }

    public Conquistador(String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
    }

    public ArrayList<Planeta> getConquistados() {
        return conquistados;
    }

    public void setConquistados(ArrayList<Planeta> conquistados) {
        this.conquistados = conquistados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
