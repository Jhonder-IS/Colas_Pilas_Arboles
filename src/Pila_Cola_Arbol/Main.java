/**
 * Clase main que toma las clases de pila, cola y arboles para ingresar
 * personas, eliminarlas y mostrarlas
 *
 * Ademas se crean personas para trabajar con ellas con las clases anteriores
 */
package Pila_Cola_Arbol;

public class Main {

    public static void main(String[] args) {
        //se crea la pila
        Pila pila = new Pila();

        //Se crea la cola
        Cola cola = new Cola();

        //se crea el arbol
        Arbol arbol = new Arbol();

        //se crea una persona
        Persona persona = new Persona();
        persona.setNombre("Nombre1");
        persona.setApellido("Apellido1");
        persona.setEdad(23);

        //se ingresa la persona anterior a la pila
        pila.push(persona);

        //se ingresa la persona anterior a la cola
        cola.enqueue(persona);

        //se ingresa la persona anterior al arbol
        arbol.insertar(persona);

        //se crea una persona
        persona = new Persona();
        persona.setNombre("Nombre2");
        persona.setApellido("Apellido2");
        persona.setEdad(42);

        //se ingresa la persona anterior a la pila
        pila.push(persona);

        //se ingresa la persona anterior a la cola
        cola.enqueue(persona);

        //se ingresa la persona anterior al arbol
        arbol.insertar(persona);

        //se crea una persona
        persona = new Persona();
        persona.setNombre("Nombre3");
        persona.setApellido("Apellido3");
        persona.setEdad(66);

        //se ingresa la persona anterior a la pila
        pila.push(persona);

        //se ingresa la persona anterior a la cola
        cola.enqueue(persona);

        //se ingresa la persona anterior al arbol
        arbol.insertar(persona);

        //se crea una persona
        persona = new Persona();
        persona.setNombre("Nombre4");
        persona.setApellido("Apellido4");
        persona.setEdad(82);

        //se ingresa la persona anterior a la pila
        pila.push(persona);

        //se ingresa la persona anterior a la cola
        cola.enqueue(persona);

        //se ingresa la persona anterior al arbol
        arbol.insertar(persona);

        //se crea una persona
        persona = new Persona();
        persona.setNombre("Nombre5");
        persona.setApellido("Apellido5");
        persona.setEdad(18);

        //se ingresa la persona anterior a la pila
        pila.push(persona);

        //se ingresa la persona anterior a la cola
        cola.enqueue(persona);

        //se ingresa la persona anterior al arbol
        arbol.insertar(persona);

        //IMPRIMIR DE LAS PILAS
        System.out.println("La cantidad de elementos en la pila es " + pila.getContElementos());

        System.out.println("\nLas personas en la pila son\n" + pila.imprimir());

        pila.pop();

        System.out.println("La cantidad de elementos en la pila luego de eliminar un elemento es " + pila.getContElementos());

        System.out.println("\nLas personas en la pila son\n" + pila.imprimir());

        System.out.println("\n____________________________________________________________________________________\n");

        //IMPRIMIR DE LAS COLAS
        System.out.println("La cantidad de elementos en la cola es " + cola.getTamanio());

        System.out.println("\nLas personas en la cola son\n" + cola.imprimir());

        cola.dequeue();

        System.out.println("La cantidad de elementos en la cola luego de eliminar un elemento es " + cola.getTamanio());

        System.out.println("\nLas personas en la cola son\n" + cola.imprimir());

        System.out.println("\n____________________________________________________________________________________\n");

        //IMPRIMIR DE LOS ARBOLES
        System.out.println("Arbol enorden");
        System.out.println(arbol.enorden());

        System.out.println("\n");

        System.out.println("Arbol preorden");
        System.out.println(arbol.preorden());

        System.out.println("\n");

        System.out.println("Arbol postorden");
        System.out.println(arbol.postorden());
    }
}
