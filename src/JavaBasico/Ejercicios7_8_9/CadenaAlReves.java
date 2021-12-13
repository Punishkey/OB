package JavaBasico.Ejercicios7_8_9;

public class CadenaAlReves {
    public static void main(String[] args) {

        String text = "Hola mundo";
        String resultado = reverse(text);
        System.out.println(resultado);
    }
    public static String reverse(String text){
        StringBuilder textReverse = new StringBuilder();
        for(int i= text.length() -1; i>= 0; i--){
            textReverse.append(text.charAt(i));
        }
        return textReverse.toString();
    }
}
