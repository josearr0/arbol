package tercersemestre.arboles;

public class Arbol<A> {

    public Nodo<A> raiz;

    public Arbol(Nodo<A> raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        return "Arbol{" + "raiz=" + raiz + '}';
    }
    
    
    public static void main(String[] args) {
        
        //Creamos el nodo raiz
        Nodo<Integer> raiz = new Nodo<>(1);
        
        //Creamos el arbol
        Arbol<Integer> tree = new Arbol<>(raiz);
        
        //Creamos los hijos
        Nodo<Integer> nodo1 = new Nodo<>(3);
        Nodo<Integer> nodo2 = new Nodo<>(3);
        
        //Agregamos los hijos
        raiz.agregarNodo(nodo1);
        nodo1.agregarNodo(nodo2);
        
        //Imprimimos el arbol
        System.out.println(tree.toString());
        
        //Elminamos el arbol y lo volvemos a imprimir
        raiz.eliminarArbol();
        System.out.println(tree.toString());

        
    }

    
    
    

}
