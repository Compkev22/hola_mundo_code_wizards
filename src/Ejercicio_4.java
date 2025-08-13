import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio_4 {
    private static ArrayList<Tareas> tareas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void ListarTareas() {


        int opcion;
        do {
            System.out.println("\n--- MENU DE TAREAS ---");
            System.out.println("1. Ingresar Tarea");
            System.out.println("2. Buscar Tarea");
            System.out.println("3. Modificar Tarea");
            System.out.println("4. Listar Tareas");
            System.out.println("5. Salir");
            System.out.print("Escoga una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ingresarTarea();
                    break;
                case 2:
                    buscarTarea();
                    break;
                case 3:
                    modificarTarea();
                    break;
                case 4:
                    listarTareas();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion Invalida. Intente de nuevo");
            }
        } while (opcion != 5);
    }

    private static void ingresarTarea() {
        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese el nombre de la Tarea: ");
        String nombreTarea = sc.nextLine();
        System.out.print("Ingrese la descripcion de la Tarea: ");
        String descripcion = sc.nextLine();

        Tareas nuevaTarea = new Tareas(nombreTarea, descripcion);
        tareas.add(nuevaTarea);
        System.out.println("Tarea agregada con éxito. Código: " + nuevaTarea.getCodigoTarea());
    }

    private static void buscarTarea() {
        System.out.print("Ingrese el código de la tarea: ");
        int codigo = sc.nextInt();

        for (Tareas tareita : tareas) {
            if (tareita.getCodigoTarea() == codigo) {
                System.out.println(tareita);
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }

    private static void modificarTarea() {
        System.out.print("Ingrese el código de la tarea a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        for (Tareas tareita : tareas) {
            if (tareita.getCodigoTarea() == codigo) {
                System.out.print("Ingrese el nuevo nombre de la Tarea: ");
                tareita.setNombreTarea(sc.nextLine());
                System.out.print("Ingrese la nueva descripcion de la Tarea: ");
                tareita.setDescripcion(sc.nextLine());
                System.out.println("Datos de la Tarea modificados con éxito.");
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }

    private static void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Tareas tareita : tareas) {
            System.out.println(tareita);
        }
    }
}


