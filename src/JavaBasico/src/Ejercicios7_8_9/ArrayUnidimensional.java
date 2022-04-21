package Ejercicios7_8_9;

import java.util.Scanner;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] Array = new String[2];

        for (int i = 0; i < 2; i++) {
            Array[i] = sc.nextLine();
        }
        for(int i = 0; i <2; i++) {
            System.out.println(Array[i]);

        }
    }
}
