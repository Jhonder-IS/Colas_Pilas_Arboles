/**
 * Esta clase tiene el nodo de las colas y las pilas que vamos a crear
 * posteriormente, con los set y get necesarios
 */
package Pila_Cola_Arbol;

/**
 *
 * @author Jhonder Lopez Alfaro Carne C14252
 * @date 14-nov-2022
 * @time 20:59:14
 */
public class Nodo {

    //atributos
    private Persona persona;
    private Nodo siguiente;

    //Constructor vacio
    public Nodo() {
    }

    //construcctor lleno
    public Nodo(Persona persona) {
        this.persona = persona;
    }

    /**
     * Get de la persona
     *
     * @return la persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Set de la persona
     *
     * @param persona la persona setear
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Get del siguiente nodo
     *
     * @return el nodo siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Set del siguiente nodo
     *
     * @param siguiente El siguiente nodo a setear
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
