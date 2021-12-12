package und5;

import java.util.Scanner;

/**
 * und5_ej4
 */
public class und5_tst4 {
    static String var[];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        var = new String[10];
        for(int i = 0; i < var.length; i++){
            System.out.println("Introduce un número");
            var[i] = sc.nextLine();
        }
        for(int j = 0; j < var.length; j++)
        System.out.print(var[j] + " ");
        System.out.println();
        
        for (String o : var) 
            System.out.print(o + " ");
        
    }
}