package Ejercicio4;

/*

En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable
estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la
variable no sea una estación.

 */

import java.util.Scanner;

public class EstructurasControl {

    public static void main(String[] args) {

        //if
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un valor numérico:");

        int numeroIf = Integer.parseInt(scanner.nextLine());

        if ( numeroIf > 0){
            System.out.println("Numero positivo");
        }else if(numeroIf < 0){
            System.out.println("Numero negativo");
        }else {
            System.out.println("Es 0");
        }

        //while
        int numWhile = 4;

        System.out.println("El numero tiene un valor de " + numWhile);

        while(numWhile < 10){
            numWhile++;
            System.out.println("El numero vale ahora " + numWhile);
        }

        //do while
        int numWhile2 = 7;
        do{
            System.out.println("El numero tiene un valor de " + numWhile2);
            numWhile2++;
            System.out.println("El numero vale ahora " + numWhile2);
        }while(numWhile2 < 8);

        //for
        for (int numFor = 0; numFor <=3; numFor++){
            System.out.println("El numero vale " + numFor);
        }

        //switch
        System.out.println("Introduce una estación del año:");
        String estacion = scanner.nextLine();

        switch (estacion){
            case "privamera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No has escrito bien la estacion");
        }
    }
}
