package und5;
import java.util.Scanner;
/**
 * und5_ej1
 */
public class und5_tst2 {

static double var[];
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

var = new double[10];

        for(int i = 0; i < var.length; i++){
            System.out.println("Introduce un dato");
            var[i] = sc.nextDouble();
            System.out.println(var[i]);
        }
        for(int j = 0; j < var.length; j++){
            System.out.println("Valor " + j + " = " + var[j] + " ");
        }


    }
}