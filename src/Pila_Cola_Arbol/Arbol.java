/**
 * Esta clase es el donde se manejan los nodos del arbol, donde se crea el arbol y demas
 * Tiene metodos para insertar una persona en el arbol y mostrarlos de diferente orden
 */
package Pila_Cola_Arbol;

/**
 *
 * @author Jhonder Lopez Alfaro Carne C14252
 * @date 14-nov-2022
 * @time 20:59:14
 */
public class Arbol {

    //atributo raiz
    private NodoArbol raiz;

    //constructor
    public Arbol() {
        this.raiz = null;
    }

    /**
     * Este metodo lo que hace es tomar una persona pasada por parametros e
     * insertarla en el arbol
     *
     * @param dato es la persona que se pasa por parametros al ser un metodo
     * publico
     */
    public void insertar(Persona dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    /**
     * Este metodo es privado y es llamado en el metodo publico insertar para
     * realizar la operacion necesaria para insertar correctamente una persona
     * en el arbol
     *
     * @param padre Este es el nodo padre o raiz
     * @param dato es la persona a ingresar
     */
    private void insertar(NodoArbol padre, Persona dato) {
        if (dato.getEdad().compareTo(padre.getDato().getEdad()) > 0) {
            if (padre.getDerecho() == null) {
                padre.setDerecho(new NodoArbol(dato));
            } else {
                this.insertar(padre.getDerecho(), dato);
            }
        } else {
            if (padre.getIzquierdo() == null) {
                padre.setIzquierdo(new NodoArbol(dato));
            } else {
                this.insertar(padre.getIzquierdo(), dato);
            }
        }
    }

    /**
     * Metodo que se llama para imprimir el arbol en preorden
     *
     * @return Un string con los datos en el arbol
     */
    public String preorden() {
        return preorden(raiz);
    }

    /**
     * Metodo privado llamado en el metodo publico preorden para obtener el
     * string de los datos en el arbol
     *
     * @param r es la raiz del arbol
     * @return un string con los datos del arbol
     */
    private String preorden(NodoArbol r) {
        if (r != null) {
            return r.getDato() + "\n" + preorden(r.getIzquierdo()) + preorden(r.getDerecho());
        }
        return "";
    }

    /**
     * Metodo que se llama para imprimir el arbol en enorden
     *
     * @return Un string con los datos en el arbol
     */
    public String enorden() {
        return enorden(raiz);
    }

    /**
     * Metodo privado llamado en el metodo publico enorden para obtener el
     * string de los datos en el arbol
     *
     * @param r es la raiz del arbol
     * @return un string con los datos del arbol
     */
    private String enorden(NodoArbol r) {
        if (r != null) {
            return enorden(r.getIzquierdo()) + r.getDato() + "\n" + enorden(r.getDerecho());
        }
        return "";
    }

    /**
     * Metodo que se llama para imprimir el arbol en postorden
     *
     * @return Un string con los datos en el arbol
     */
    public String postorden() {
        return postorden(raiz);
    }

    /**
     * Metodo privado llamado en el metodo publico postorden para obtener el
     * string de los datos en el arbol
     *
     * @param r es la raiz del arbol
     * @return un string con los datos del arbol
     */
    private String postorden(NodoArbol r) {
        if (r != null) {
            return postorden(r.getIzquierdo()) + postorden(r.getDerecho()) + r.getDato() + "\n";
        }
        return "";
    }
}
