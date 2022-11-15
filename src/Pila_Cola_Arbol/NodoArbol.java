/**
 * Esta clase tiene el nodo de los arboles que vamos a crear
 * posteriormente, con los set y get necesarios
 */
package Pila_Cola_Arbol;

/**
 *
 * @author Jhonder Lopez Alfaro Carne C14252
 * @date 14-nov-2022
 * @time 20:59:14
 */
public class NodoArbol {

    //atributos
    private Persona dato;
    private NodoArbol izquierdo, derecho;

    //constructor
    public NodoArbol(Persona dato) {
        this.dato = dato;
    }

    /**
     * Get de la persona
     *
     * @return la persona que se obtuvo
     */
    public Persona getDato() {
        return dato;
    }

    /**
     * Set de la persona que queremos setear
     *
     * @param dato la persona a ingresar
     */
    public void setDato(Persona dato) {
        this.dato = dato;
    }

    /**
     * get del nodo izquierdo
     *
     * @return el nodo izquierdo
     */
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    /**
     * Set del nodo izquierdo
     *
     * @param izquierdo nodo que queremos definir como izquierdo
     */
    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * get del nodo derecho
     *
     * @return el nodo derecho
     */
    public NodoArbol getDerecho() {
        return derecho;
    }

    /**
     * Set del nodo derecho
     *
     * @param derecho nodo que queremos definir como derecho
     */
    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
}
