package und5;

import java.util.Random;
import java.util.Scanner;

public class und5_ej5 {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static int array[];
    static int comparison = 1;
    static boolean comparisonBoleean = false;
    public static void main(String[] args) {
        array= new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        insertNum();
           
        
        
    }
    private static void insertNum() {
        while (comparison >= 0) {
            System.out.println("\n" + "Introduce a number");
            try {
            comparison = sc.nextInt();
            sc.nextLine();
            if (comparison >= 0  && comparison <= 100) {
                compareNum();
            }
            } catch (Exception e)  {
                System.out.println("Stoping program, invalid data");
                break;
            }


            
            
        }
    }
    private static void compareNum() {
        comparisonBoleean = false;
        for(int j = 0; j < array.length; j++){
            if(array[j] == comparison){
                comparisonBoleean = true;
            }

            

        }
        if (comparisonBoleean){
            System.out.println("Number repeated");
        } else {
            System.out.println("Number not repeated");
        }
    }
}
