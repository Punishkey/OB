package Ejercicio3.sumatorio;

/*

Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.

 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero 1:");

        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el numero 2:");

        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el numero 3:");

        int num3 = Integer.parseInt(sc.nextLine());

        System.out.println("La suma de los 3 numeros es: " + suma(num1, num2, num3));

    }

    private static int suma (int num1, int num2, int num3){

        return num1 + num2 + num3;
    }

}
