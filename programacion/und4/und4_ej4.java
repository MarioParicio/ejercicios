package und4;
import java.util.Scanner;

public class und4_ej4{

    static Scanner sc = new Scanner(System.in);
    static int num = 0;
    public static void main(String[] args) {
        System.out.println("Introduce un número entero" );
        try{
        num = sc.nextInt();
        System.out.println("Introduce un númer valido");
        System.out.println("\n");
        multiply(num);
        }
        catch(Exception e){
        System.out.println("Introduce un valor válido");
        }
    }
    static void multiply(int num){
        System.out.println("La tabla de multiplicar de " + num + " es:");
        for(int i = 1; i < 10 ; ++i) {
            System.out.println(num + " x " + i + " = " + num*i );
        }

    }
        
}


