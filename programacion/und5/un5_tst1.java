package und5;

import java.util.Scanner;

/**
 * un5_ej1
 */
public class un5_tst1 {
    static Scanner sc = new Scanner(System.in);

    static int intArray[];
    public static void main(String[] args) {
        String [] apellidos = new String [5];

        int [] precios = new int [3];

System.out.println(apellidos);

        for (int i = 0; i<precios.length; i++){
            
            System.out.println("Introduce un número");
            precios[i] = sc.nextInt();

        }
        for (int i = 0; i<precios.length; i++){
            System.out.println("número" + (i +1));
            System.out.println(precios[i]);

        }
    }
}