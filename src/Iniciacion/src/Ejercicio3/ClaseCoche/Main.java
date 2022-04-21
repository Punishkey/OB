package Ejercicio3.ClaseCoche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        miCoche coche1 = new miCoche();

        coche1.setDoors(3);

        System.out.println("El coche tiene " + coche1.getDoors() + " puertas");

        System.out.println("añade el numero de puertas que quieres que tenga tu coche:");

        int moreDoors = Integer.parseInt(scanner.nextLine());

        coche1.addDoors(moreDoors);

        System.out.println("El coche ahora con el añadido tiene " + coche1.getDoors() + " puertas");


    }
}

class miCoche {
    int doors;

    public miCoche() {}

    public miCoche(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {

        this.doors = doors;
    }

    public int addDoors(int doors) {
        this.doors += doors;
        return doors;
    }
}
