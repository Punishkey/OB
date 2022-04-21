package Ejercicio8;

/*

Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona();

        System.out.println("Bienvenido al generador de personas. Por favor introduce un nombre:");
        persona1.setNombre(sc.nextLine());

        System.out.println("Introduce la edad de la persona que estas creando:");
        persona1.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Introduce el numero de telefono de la persona:");
        persona1.setTelefono(Integer.parseInt(sc.nextLine()));

        System.out.println("La persona que has creado se llama: " + persona1.getNombre() + " su edad es: " + persona1.getEdad() + " y su telefono es " + persona1.getTelefono());
    }
}
