import java.util.Scanner;

public class Ejercicio_1 {
    public static void Par_Impar (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprobar");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("El numero es par");
        } else if (num1 % 2 == 1) {
            System.out.println("El numero es impar");
        } else {
            System.out.println("El numero es invalido, ingrese nuevamente");
        }
    }
}
