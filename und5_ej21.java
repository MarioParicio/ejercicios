package und5;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class und5_ej21 {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Escribe una frase");
            String sentence = sc.nextLine().trim();

            System.out.println(sentence.toUpperCase());

            System.out.println(sentence.toLowerCase());

            System.out.print(Character.toUpperCase(sentence.charAt(0)));
            for ( int i = 1; i < sentence.length(); i++){

                System.out.print(sentence.charAt(i));
                if (sentence.charAt(i) ==  ' ') {
                    int x = i + 1;
                    System.out.print(Character.toUpperCase(sentence.charAt(x)));
                    i++;
                }

                
            }
    }
}
