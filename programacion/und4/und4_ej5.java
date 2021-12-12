package und4;
import java.util.Scanner;
public class und4_ej5 {
    static String letter = "";
    static int triangleWidth = 0;
    static int aux = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce una letra");
        letter = sc.nextLine();
        System.out.println("Introduce un número");
        triangleWidth = sc.nextInt();
        aux = triangleWidth;
        triangulo(letter, triangleWidth, aux);
    }
    static void triangulo(String letter, int triangleWidth, int aux){
        while (aux > -1) {
            triangleWidth = aux - 1;
            while (triangleWidth > -1) {
                System.out.print(letter);
                --triangleWidth;
            }
            System.out.println();
            --aux;
        }
    }
}


