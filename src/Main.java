import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_1 ejercicio1 = new Ejercicio_1();
        Ejercicio_2 ejercicio2 = new Ejercicio_2();
        Ejercicio_3 ejercicio3 = new Ejercicio_3();
        Ejercicio_4 ejercicio4 = new Ejercicio_4();
        Ejercicio_5 ejercicio5 = new Ejercicio_5();
        Ejercicio_6 ejercicio6 = new Ejercicio_6();

        System.out.println("\nMenu Ejercicios:");
        System.out.println("1. Verificar Numero Par o Impar");
        System.out.println("2. Verificar Numero Primo");
        System.out.println("3, Adivinanza de Numeros");
        System.out.println("4. Lista de Tareas");
        System.out.println("5. Conversor de Temperatura");
        System.out.println("6. Conexion Agenda de Contactos");
        System.out.println("7. Salir");
        System.out.println("Escoga una opcion");

        int opcion;
        do {
            System.out.println("\n--- Menu Ejercicios ---");
            System.out.println("1. Verificar Numero Par o Impar");
            System.out.println("2. Verificar Numero Primo");
            System.out.println("3, Adivinanza de Numeros");
            System.out.println("4. Lista de Tareas");
            System.out.println("5. Conversor de Temperatura");
            System.out.println("6. Conexion Agenda de Contactos");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ejercicio1.Par_Impar();
                    break;
                case 2:
                    ejercicio2.Primo();
                    break;
                case 3:
                    ejercicio3.Adivinanza();
                    break;
                case 4:
                    ejercicio4.ListarTareas();
                    break;
                case 5:
                    ejercicio5.Conversor();
                    break;
                case 6:
                    ejercicio6.menuAgenda();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion Invalida. Intente de nuevo");
            }
        } while (opcion != 6);
    }



}


















