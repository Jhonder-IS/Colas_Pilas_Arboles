/**
 * Esta clase es el donde se manejan los nodos de la cola, donde se crea la cola y demas
 * Tiene metodos para insertar una persona en la cola, eliminarlos y mostrarlos
 */
package Pila_Cola_Arbol;

/**
 *
 * @author Jhonder Lopez Alfaro Carne C14252
 * @date 14-nov-2022
 * @time 20:59:14
 */
public class Cola {

    //atributos de tamanio, el primer y ultimo nodo
    private Nodo primero, ultimo;
    private int tamanio;

    //constructor
    public Cola() {
    }

    /**
     * metodo para obtener el tamanio de la cola
     *
     * @return un int numero con el tamanio de la cola
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * Metodo para encolar o ingresar en la cola una nueva persona
     *
     * @param persona persona que se desea ingresar
     * @return la persona ingresada
     */
    public Persona enqueue(Persona persona) {
        Nodo nuevo = new Nodo(persona);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
        return ultimo.getPersona();
    }

    /**
     * Metodo para eliminar o sacar una persona de la cola
     *
     * @return String con la persona desencolada
     */
    public String dequeue() {
        if (primero == null) {
            return "La cola está vacia";
        }
        Persona persona = primero.getPersona();
        primero = primero.getSiguiente();
        if (primero == null) {
            ultimo = null;
        }
        tamanio--;
        return persona.toString();
    }

    /**
     * Metodo para mostrar los datos de las personas en la cola
     *
     * @return String con la informacion de las personas en la cola
     */
    public String imprimir() {
        String text = "";
        Nodo actual = primero;
        while (actual != null) {
            text = text + actual.getPersona().toString() + "\n";
            actual = actual.getSiguiente();
        }
        return text;
    }

}
