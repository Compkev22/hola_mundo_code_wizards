import java.util.Scanner;

public class Ejercicio_2 {
    public static void Primo (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprobar");
        int num2 = sc.nextInt();;
        boolean Primo = true;

        if (num2 <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num2); i++) {
                if (num2 % i == 0) {
                    Primo = false;
                    break;
                }
            }
        }

        if (Primo) {
            System.out.println("El numero " + num2 + " es primo");
        } else {
            System.out.println("El numero " + num2 + " no es primo");
        }
    }
}



