import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio_4 {
    private static ArrayList<Tareas> tareas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void ListarTareas () {
            int opcion = 0;

            do{
                System.out.println("\nMenu:");
                System.out.println("1. Ingresar Tareas");
                System.out.println("2. Buscar Tareas");
                System.out.println("3, Modificar Tareas");
                System.out.println("4. Listar Tareas");
                System.out.println("5. Salir");
                System.out.println("Escoga una opcion");

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
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion Invalida. Intente de nuevo");
                }
            }while (opcion != 5);
        }

        private static void ingresarTarea() {
            System.out.print("Ingrese el nombre de la Tarea: ");
            String nombreTarea = sc.next();
            System.out.print("Ingrese la descripcion de la Tarea: ");
            String descripcion = sc.next();

            Tareas nuevaTarea = new Tareas(nombreTarea, descripcion);
            tareas.add(nuevaTarea);
            System.out.println("Tarea agregado con éxito. Código: " + nuevaTarea.getCodigoTarea());
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

            for (Tareas tareita : tareas) {
                if (tareita.getCodigoTarea() == codigo) {
                    System.out.print("Ingrese el nuevo nombre de la Tarea: ");
                    tareita.setNombreTarea(sc.next());
                    System.out.print("Ingrese la nueva descripcion de la Tarea: ");
                    tareita.setDescripcion(sc.next());
                    System.out.println("Datos de la Tarea modificados con éxito.");
                    return;
                }
            }
            System.out.println("Tarea no encontrada.");
        }

        private static void listarTareas() {
            if (tareas.isEmpty()) {
                System.out.println("No hay empleados registrados.");
                return;
            }

            for (Tareas tareita : tareas) {
                System.out.println(tareita);
            }
        }
    }

