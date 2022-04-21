package Ejercicio4;
/*
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main {
    public static void main(String[] args) {

        SmartWatch apple = new SmartWatch(false);
        apple.setMaker("Apple");
        apple.setModel("Serie 6");
        apple.setRam(1);
        apple.setSystem("watchOS 7 ");

        System.out.println(apple);

        SmarthPhone xiaomi = new SmarthPhone(7.1);
        xiaomi.setMaker("Xiaomi");
        xiaomi.setModel("MI 11");
        xiaomi.setRam(8);
        xiaomi.setSystem("MIUOUI 12.5");

        System.out.println(xiaomi);
    }
}
