package und5;
import java.util.Scanner;
public class und5_ej21 {

        static Scanner sc = new Scanner(System.in);
        static String sentence = "";
        
        public static void main(String[] args) {

            System.out.println("Escribe una frase");
            sentence = sc.nextLine().trim();

            System.out.println(sentence.toUpperCase());

            System.out.println(sentence.toLowerCase());

            System.out.print(Character.toUpperCase(sentence.charAt(0)));
            for ( int i = 1; i < sentence.length(); i++){

                System.out.print(Character.toLowerCase(sentence.charAt(i)));
                if (sentence.charAt(i) ==  ' ') {
                    int x = i + 1;
                    System.out.print(Character.toUpperCase(sentence.charAt(x)));
                    i++;
                }

                
            }
    }
}
