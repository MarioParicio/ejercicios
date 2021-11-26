package und5;

import java.util.Random;
import java.util.Scanner;

public class und5_ej5 {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static int array[];
    static int comparison = 1;
    public static void main(String[] args) {
        array= new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        insertNum();
           
        
        
    }
    private static void insertNum() {
        while (true) {
            System.out.println("\n" + "Introduce un número");
            comparison = sc.nextInt();
            if (comparison >= 0) {
                compareNum();
            }
            
        }
    }
    private static void compareNum() {
        for(int j = 0; j < array.length; j++){
            if (array[j] == comparison) {
                System.out.println("número repetido" + "\n");
                j += 10;
            } else{
                System.out.println("no esta en el array" + "\n");
                insertNum();
            }

        }
    }
}
