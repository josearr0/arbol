package tercersemestre.arboles;

import java.util.ArrayList;
import java.util.List;

public class Nodo<A> {

    //Atributos
    private A valor;
    private List<Nodo<A>> Hijo;
    private Nodo<A> Padre;

    
    
    //Constructor
    public Nodo(A valor) {
        this.valor = valor;
        this.Hijo = new ArrayList<Nodo<A>>();
    }

    
    
    //Metodos
    public void agregarNodo(Nodo<A> hijo) {
        hijo.setPadre(this);
        Hijo.add(hijo);
    }

    public void setPadre(Nodo<A> padre) {
        this.Padre = padre;
    }
    
    public void eliminarArbol(){
        this.Padre = null;
        this.Hijo.clear();
    }
    
    public String toString() {
        return " Nodo{ valor= " 
                + valor.toString() 
                + "  Hijo=" 
                + Hijo.toString() +" ";
    
    }
    

}
