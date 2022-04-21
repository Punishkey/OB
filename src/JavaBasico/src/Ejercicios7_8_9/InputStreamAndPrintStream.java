package Ejercicios7_8_9;

import java.io.*;

public class InputStreamAndPrintStream {
    public static void main(String[] args) {
        try {
            InputStream fileIn = new FileInputStream("src//Discord/EjercicioSesiones7_8_9//fileIn.txt");
            PrintStream fileOut = new PrintStream("src//Discord/EjercicioSesiones7_8_9//fileOut.txt");


            inputStreamAndPrintStream(fileIn, fileOut);

            fileIn.close();
            fileOut.close();

        }catch (FileNotFoundException e){
            System.out.println("No existe tal archivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void inputStreamAndPrintStream(InputStream fileIn, PrintStream fileOut) throws IOException {
        byte[] dato = fileIn.readAllBytes();
        fileOut.write(dato);
    }
}
