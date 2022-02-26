package lab6p2_victorvalladares_12141026;

import java.util.ArrayList;

public class Explorador extends Alien{
    ArrayList <Planeta> planetas = new ArrayList();
    private Planeta favorito;

    public Explorador() {
        super();
    }

    public Explorador(Planeta favorito, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.favorito = favorito;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    public Planeta getFavorito() {
        return favorito;
    }

    public void setFavorito(Planeta favorito) {
        this.favorito = favorito;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
    
}
