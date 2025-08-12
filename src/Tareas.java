public class Tareas {

    private int codigoTarea;
    private String nombreTarea;
    private String descripcion;


    public Tareas() {
    }

    public Tareas(int codigoTarea, String nombreTarea, String descripcion) {
        this.codigoTarea = codigoTarea;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
    }

    public Tareas(String nombreTarea, String descripcion) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
    }

    public int getCodigoTarea() {
        return codigoTarea;
    }

    public void setCodigoTarea(int codigoTarea) {
        this.codigoTarea = codigoTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tareas{" +
                "codigoTarea=" + codigoTarea +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
