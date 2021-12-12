package und4;

import java.util.Scanner;

public class ej1 {

    static int num = 0;
    public static void main(String[] args) {
        signo();
        
    }
    static void signo(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("1");
        } else if (num < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }





        sc.close();
    }
}
