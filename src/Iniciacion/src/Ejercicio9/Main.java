package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dale un nombre a tu cliente:");
        cliente1.setNombre(scanner.nextLine());

        System.out.println("Dale una edad a tu cliente:");
        cliente1.setEdad(Integer.parseInt(scanner.nextLine()));

        System.out.println("Dale un telefono a tu cliente:");
        cliente1.setTelefono(Integer.parseInt(scanner.nextLine()));

        System.out.println("Dale credito para gastar!:");
        cliente1.setCredito(Integer.parseInt(scanner.nextLine()));

        System.out.println("Tu cliente se llama " + cliente1.getNombre() + " con una edad de " + cliente1.getEdad() + " un numero de telefono " + cliente1.getTelefono() +
                " y un credito para gastar de " + cliente1.getCredito() + "€");

        Trabajador trabajador1 = new Trabajador();

        System.out.println("Introduce el nombre del trabajador:");
        trabajador1.setNombre(scanner.nextLine());

        System.out.println("Introduce la edad del trabajador:");
        trabajador1.setEdad(Integer.parseInt(scanner.nextLine()));

        System.out.println("Introduce el telefono del trabajador:");
        trabajador1.setTelefono(Integer.parseInt(scanner.nextLine()));

        System.out.println("Introduce el salario del trabajador, por favor se generoso al menos en la ficción, ya es dura la vida real:");
        trabajador1.setSalario(Double.parseDouble(scanner.nextLine()));

        System.out.println("Tu trabajador se llama " + trabajador1.getNombre() + " con una edad de " + trabajador1.getEdad() + " con el telefono " +
                trabajador1.getTelefono() + " y un salario que creo que podria ser decente de " + trabajador1.getSalario() + " €");
    }
}
