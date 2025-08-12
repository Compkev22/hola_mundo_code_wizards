import java.util.Scanner;

public class Ejercicio_5 {
    public void Conversor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar los grados F que desea convertir");
        int temp = sc.nextInt();
        int ntemp = (temp - 32)*5/9;
        System.out.println("La temperatura es de: " + ntemp + "℃");
    }
}
