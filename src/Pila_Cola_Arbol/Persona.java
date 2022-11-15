/**
 * Esta clase crea una persona con sus atributos, sus set y get, el metodo para
 * mostrar la informacion de la persona y ademas un metodo para comparar las
 * cedulas de las personas con otra
 */
package Pila_Cola_Arbol;

/**
 *
 * @author Jhonder Lopez Alfaro Carne C14252
 * @date 14-nov-2022
 * @time 20:59:14
 */
public class Persona implements Comparable<Persona> {

    //atributos de la persona
    private String nombre;
    private String apellido;
    private Integer edad;

    //constructor vacio
    public Persona() {
    }

    //constructor lleno
    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * Metodo para obtener el nombre de la persona
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para setear el nombre de la persona
     *
     * @param nombre el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el apellido de la persona
     *
     * @return el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para setear el apellido de la persona
     *
     * @param apellido el apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo para obtener la de la persona
     *
     * @return la edad de la persona
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Metodo para setear el nombre de la persona
     *
     * @param edad la edad de la persona
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Metodo para tener la informacion de la persona
     *
     * @return string con la informacion de la persona
     */
    @Override
    public String toString() {
        return "El nombre de la persona es " + nombre + " " + apellido + " y tiene una edad de " + edad;
    }

    /**
     * Metodo para comparar cedulas
     *
     * @param t la persona
     * @return int con la compracion
     */
    public int compareTo(Persona t) {
        return edad.compareTo(t.getEdad());
    }
}
