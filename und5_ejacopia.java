package und5;

import java.util.Scanner;

public class und5_ejacopia {
    static int max = 100;
    static int min = 0;
    static int val = 0;
    static int akinator = 0;
    static int intentos = 1;
    static int a = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
        System.out.println("Jugar contra la maquina(0) o que la maquina juegue sola(1)");
        a = sc.nextInt();
        sc.nextLine();

            if (a == 0) {
                System.out.println("Introduce un número entre 0 y 100");
                val = sc.nextInt();
                sc.nextLine();
            }
                while (akinator != val){
                    akinator = (max - min)/2 + min;
                    if (akinator == val) {
                        System.out.println("El número es " + akinator + " se ha conseguido en " + intentos);
                        break;
                    } else if (akinator > val) {
                        System.out.println("El número es:" + akinator);
                        System.out.println("No, es menor");
                        max = akinator -1;
                        intentos = intentos + 1;
                    } else {
                        System.out.println("El número es:" + akinator);
                        System.out.println("No es mayor");
                        min = akinator + 1;
                        intentos = intentos + 1;
                    }
                }
                 
                if (a == 1){
                System.out.println("Introduce un número entre 0 y 100");
                val = (int) (Math.random() * 100);
                System.out.println("El valor es " + val);
                }
        
                while (akinator != val){
                    akinator = (max - min)/2 + min;
                    if (akinator == val) {
                        System.out.println("El número es " + akinator + " se ha conseguido en " + intentos);
                        break;
                    } else if (akinator > val) {
                        System.out.println("El número es:" + akinator);
                        System.out.println("No, es menor");
                        max = akinator -1;
                        intentos = intentos + 1;
                    } else {
                        System.out.println("El número es:" + akinator);
                        System.out.println("No es mayor");
                        min = akinator + 1;
                        intentos = intentos + 1;
                    }
                }

            }catch (Exception e) {
                System.out.println("Introduce un valor valido");



        } 
    } 

    }


    