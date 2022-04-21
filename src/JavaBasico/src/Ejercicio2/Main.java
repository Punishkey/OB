package Ejercicio2;

/*
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio:");

        double precio = Double.parseDouble(sc.nextLine());


        System.out.println("Introduce el IVA:");

        double iva = Double.parseDouble(sc.nextLine());

        System.out.println("El precio con iva es: " + devuelvePrecioIva(precio, iva));

    }
    private static double devuelvePrecioIva(double precio, double iva){

        return precio + (precio * iva);
    }
}
