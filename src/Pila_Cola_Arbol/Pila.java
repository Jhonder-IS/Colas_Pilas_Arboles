/**
 * Esta clase es el donde se manejan los nodos de la pila, donde se crea la pila y demas
 * Tiene metodos para insertar una persona en la pila, eliminarlos y mostrarlos
 */
package Pila_Cola_Arbol;

import java.util.EmptyStackException;

/**
 *
 * @author Jhonder Lopez Alfaro Carne C14252
 * @date 14-nov-2022
 * @time 20:59:14
 */
public class Pila {

    //atributos de la pila
    private Nodo cima;
    private final int tamanio;
    private int contElementos;

    //constructor
    public Pila() {
        tamanio = 0;
        contElementos = 0;
    }

    /**
     * Metodo para obtener la cantidad de elementos que tiene la pila
     *
     * @return int numero con la cantidad de elementos en la pila
     */
    public int getContElementos() {
        return contElementos;
    }

    /**
     * Metodo para sacar un elemento de la pila
     *
     * @return la persona que se saca de la pila
     * @throws EmptyStackException exepcion que se retorna si algo sale mal
     */
    public Persona pop() throws EmptyStackException {
        if (cima == null) {
            throw new EmptyStackException();
        }
        Persona persona = cima.getPersona();
        cima = cima.getSiguiente();
        contElementos--;
        return persona;
    }

    /**
     * Metodo para ingresar una nueva persona en la pila
     *
     * @param persona persona que se va a ingresar
     * @return la persona que se ingresa
     */
    public Persona push(Persona persona) {
        if (tamanio != 0 && tamanio == contElementos) {
            throw new StackOverflowError();
        }
        Nodo nuevo = new Nodo(persona);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        contElementos++;
        return cima.getPersona();
    }

    /**
     * Metodo para mostrar los datos o personas en la pila
     *
     * @return el string con la informacion
     */
    public String imprimir() {
        String text = "";
        Nodo actual = cima;
        while (actual != null) {
            text = text + actual.getPersona().toString() + "\n";
            actual = actual.getSiguiente();
        }
        return text;
    }
}
