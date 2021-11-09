package und4;
import java.util.Scanner;

/**
 * und4_ej2
 * Crea una función que calcule un número elevado a otro, usando 
 *multiplicaciones sucesivas. 
 */
public class und4_ej2 {

    static Scanner sc = new Scanner(System.in);
    static int num = 0;
    static int exp = 0;
    public static void main(String[] args) {
         do {
                System.out.println("Introduce un número");
                try {
                    num = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce un exponente positivo");
                    exp = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Error introduzca un número valido");
                    exp = 0;
                            }
            } while (exp < 0);
            exponente(num, exp);

    }
    static void exponente(int num, int exp){
        int aux = num;
        for (int i = 1; i < exp; i++) {
            num =  num * aux;
            
        }
        System.out.println(num);

  
    }
}