package und4;
import java.util.Scanner;
/**
 * und4_ej10
 */
public class und4_ej10 {
    static Scanner sc = new Scanner(System.in);
    static int num = 0;

    public static void main(String[] args) {
        System.out.println("Introduce un número");
        num = sc.nextInt();
        sc.nextLine();
        factorial(num);
    }
    static void factorial(int num){
        int aux = num;
        while (aux > 1) {
            num *= aux -1;
            aux -= 1;
        }
        System.out.println(num);
    }
}