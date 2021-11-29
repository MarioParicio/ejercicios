package und5;
import java.util.Scanner;
public class und5_ej20 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String aes = "aAáÁ";
        System.out.println("Escribe una frase");
        String sentence = sc.nextLine();

        int count = 0;
        for ( int i = 0; i < sentence.length(); i++){
            Character c = sentence.charAt(i);
            if(aes.contains(c.toString())){
                System.out.println("Encontrado " + c + " en la posición " + i);
                count++;
            }
            
        }
        System.out.println( "a " + "aparece " + count + " veces"); 
    }
}
