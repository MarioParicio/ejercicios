package entornos;
import java.util.Scanner;
public class entrosnos_pract {
    static Scanner sc = new Scanner(System.in);
    static String option = "";
    static double value = 0;
    static double value1 = 0;
    public static void main(String[] args) {
        do {
        System.out.println("Circulo c, cuadrado x, rectangulo r, poligono regular p, salir s");
        option = sc.nextLine();
            if (option.equals("c")) {
                System.out.println("Introduce el radio del circulo en cm");
                value = sc.nextInt();
                areaCircle();
                
            } else if (option.equals("x")){
                System.out.println("Introduce un lado del cuadrado");
                value = sc.nextInt();
                areaSquare();
            } else if (option.equals("p")){
                System.out.println("Introduce el perímetro");
                value = sc.nextDouble();
                System.out.println("Introduce el apotema");
                value1 = sc.nextDouble();
                areaRegularPolygon();

            } else if (option.equals("s")){
            System.out.println("saliendo del programa");
            } else  if (option.equals("r")){
                System.out.println("Introduce un lado");
                value = sc.nextDouble();
                System.out.println("Introduce el otro lado");
                value1 = sc.nextDouble();
                areaRectangle();
                
            } else {
                System.out.println("Introduce un valor válido");
            }
            } while (!option.equals("s"));
    }
    public static void areaCircle(){
        System.out.println("El area del circulo es " + value*value*Math.PI);
    }
    public static void areaSquare(){
        System.out.println("El area del cuadrado es " + value*value);
        sc.nextLine();
    }
    public static void areaRegularPolygon() {
        System.out.println("El area del polígono regular es " + value * value1);
    }
    //innecesary code function, the rest of the code stop himself
    public static void exit() {
        System.exit(0);
    }
    public static void areaRectangle() {
        System.out.println(value * value1);
    }

}
