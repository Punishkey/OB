package JavaBasico.Ejercicios7_8_9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(sc.nextInt());
        }
        for(int i = 0; i < arrayList.size();i++) {
            if(arrayList.get(i) % 2 == 0){
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
    }
}
