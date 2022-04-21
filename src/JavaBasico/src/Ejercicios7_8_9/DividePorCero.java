package Ejercicios7_8_9;

import java.util.Scanner;

public class DividePorCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduce 2 números");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        try{
            MetodoDividePorCero(number1, number2);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse.");
        }finally{
            System.out.println("Demo de código.");
        }
    }
    public static void MetodoDividePorCero(int number1, int number2) throws ArithmeticException {
        int result = number1 / number2;
        if (result == 0) {
            throw new ArithmeticException();
        }
    }
}
