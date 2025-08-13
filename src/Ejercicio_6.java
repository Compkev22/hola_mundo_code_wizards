import java.util.List;
import java.util.Scanner;


public class Ejercicio_6 {
    private static Scanner sc = new Scanner(System.in);
    private static ContactoDAO contactoDAO = new ContactoDAO();
    public static void menuAgenda() {
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD AGENDA ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar por código");
            System.out.println("4. Modificar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    listarContactos();
                    break;
                case 3:
                    buscarContacto();
                    break;
                case 4:
                    modificarContacto();
                    break;
                case 5:
                    eliminarContacto();
                    break;
                case 6:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    private static void agregarContacto() {
        System.out.print("Nombre: ");
        String nombreContacto = sc.nextLine();
        System.out.print("Apellido: ");
        String apellidoContacto = sc.nextLine();
        System.out.print("Empresa: ");
        String empresaContacto = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefonoContacto = sc.nextLine();
        System.out.print("Descripción: ");
        String descripcionContacto = sc.nextLine();
        contactoDAO.insertar(new Agenda_contactos(nombreContacto, apellidoContacto, empresaContacto, telefonoContacto, descripcionContacto));
    }

    private static void listarContactos() {
        List<Agenda_contactos> lista = contactoDAO.listar();
        if (lista.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (Agenda_contactos a : lista) {
                System.out.println(a.getCodigoContacto() + " - " + a.getNombreContacto() + " " + a.getApellidoContacto() + " - " + a.getTelefonoContacto());
            }
        }
    }

    private static void buscarContacto() {
        System.out.print("Código a buscar: ");
        int codigo = sc.nextInt();
        contactoDAO.buscar(codigo);
    }

    private static void modificarContacto() {
        System.out.print("Código a modificar: ");
        int codigoContacto = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombreContacto = sc.nextLine();
        System.out.print("Nuevo apellido: ");
        String apellidoContacto = sc.nextLine();
        System.out.print("Nueva Empresa: ");
        String empresaContacto = sc.nextLine();
        System.out.print("Nuevo teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Nueva descripción: ");
        String descripcion = sc.nextLine();
        contactoDAO.actualizar(new Agenda_contactos(codigoContacto, nombreContacto, apellidoContacto, empresaContacto, telefono, descripcion));
    }

    private static void eliminarContacto() {
        System.out.print("Código a eliminar: ");
        int codigo = sc.nextInt();
        contactoDAO.eliminar(codigo);
    }
}
