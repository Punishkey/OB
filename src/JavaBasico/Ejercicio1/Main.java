package JavaBasico.Ejercicio1;

/*
Para este primer ejercicio tendréis que realizar lo siguiente:


    Crea un proyecto de Java desde 0

    Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

    Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.


Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */

public class Main {
    public static void main(String[] args) {
        int entero = 10;
        long largo = 200;
        double decimal = 10.99;
        boolean siNo = false;
        String texto = "Carlos";

        System.out.println("Esto es un int - " + entero);
        System.out.println("Esto es un largo - " + largo);
        System.out.println("Esto es un decimal - " + decimal);
        System.out.println("Esto es un booleano - " + siNo);
        System.out.println("Esto es un String - " + texto);
    }
}
