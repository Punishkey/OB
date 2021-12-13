package Ejercicio3;
/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String.

Por ejemplo: String[] nombres = {"", "", "", ""}
 */
public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Carlos", "Fany", "Gema", "Jose"};
        StringBuilder salida = new StringBuilder();

        for (String nombre : nombres){
            salida.append(nombre).append(" ");
        }
        System.out.println(salida);
    }
}
