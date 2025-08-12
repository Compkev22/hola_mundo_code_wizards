import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void Adivinanza (){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int num1 = rn.nextInt(10+1);
        System.out.println("Elije un numero entre el 1 al 10, para adivinar el numero en el que estoy pensando");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Lograste adivinar el numero en el que estaba pensando que era el " + num1 );
        } else {
            System.out.println("Ese no era el numero que estaba pensando, era el " +num1 + " Tu pensaste en el " + num2);
        }
    }


}
