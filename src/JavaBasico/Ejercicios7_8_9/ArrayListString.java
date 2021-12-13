package JavaBasico.Ejercicios7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Carlos");
        arrayList.add("Fany");
        arrayList.add("Dante");
        arrayList.add("Yaira");

        System.out.println("Valores del arrayList: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println("Valores del Linkedlist");
        linkedList.forEach(System.out::println);
    }
}
