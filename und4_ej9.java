package und4;
import java.util.Scanner;

public class und4_ej9 {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            try {
                System.out.println("Introduce un número positivo");
                num = sc.nextInt();
                sc.nextLine();
    
            } catch (Exception e) {
                System.out.println("Introduce un número");
                num = 0;
            }
        }while (num < 0);
        if (num > 0) {
            
            countdown(num);
        }


        }
        static void countdown(int num){
                
            if (num > 0) {
                System.out.println(num);
                num = num - 1;
                countdown(num);
            }
       
            
            
        
    }
    
}
