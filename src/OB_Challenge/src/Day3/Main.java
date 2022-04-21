package Day3;
/*
El reto de hoy consiste en lo siguiente:
- Lenguaje: Java
- IDE recomendado: IntelliJ
- Nivel: Inicial
- Enunciado: Dada una cadena de texto (String) con el nombre completo de una persona, debes crear un método que devuelva 3 campos: nombre,
  apellido1, apellido2. Debes tener en cuenta que hay nombres compuestos y que puedes recibir un nombre completo sin apellido2 o sin ningún apellido.
Ejemplos: José Martínez Pérez -> nombre: José, apellido1: Martínez, apellido2: Pérez.
                   José María Martínez -> nombre: José María, apellido1: Martínez
                   José -> nombre: José
- Consideraciones: Deberías tener los nombres de pila en un array o fichero, para poder diferenciar entre un nombre de pila y un apellido.
 */
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Introduce tu nombre y apellidos");
        String [] words = fullName.split(" ");

        if (words.length == 1){
            System.out.println("Your name it's: " + words[0]);
        }
        else if (words.length == 2){
            System.out.println("Your name: " + words[0] + " and your surname its: " + words[1]);
        }
        else if (isName(words) && words.length == 3){
            System.out.println("Your name: " + words[0] + " " + words[1] +  " and your surnames its: " + words[2]);
        }
        else if (isName(words) && words.length == 4){
            System.out.println("Your name: " + words[0] + " " + words[1] +  " and your surnames its: " + words[2] + " " + words[3]);
        }
        else{
            System.out.println("Your name: " + words[0] + " and your surnames its: " + words[1] + " " + words[2]);
        }
    }

    public static boolean isName(String[] words) {

        //http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java

        try {
            FileReader fr = new FileReader("src\\names.txt");
            BufferedReader br = new BufferedReader(fr);
            String lineName;
            while ((lineName = br.readLine()) != null){
                if (lineName.equalsIgnoreCase(words[1])) {
                    br.close();
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
