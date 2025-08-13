public class Agenda_contactos {

    private int codigoContacto;
    private String nombreContacto;
    private String apellidoContacto;
    private String empresaContacto;
    private String telefonoContacto;
    private String descripcionContacto;

    public Agenda_contactos() {
    }

    public Agenda_contactos(int codigoContacto, String nombreContacto, String apellidoContacto, String empresaContacto, String telefonoContacto, String descripcionContacto) {
        this.codigoContacto = codigoContacto;
        this.nombreContacto = nombreContacto;
        this.apellidoContacto = apellidoContacto;
        this.empresaContacto = empresaContacto;
        this.telefonoContacto = telefonoContacto;
        this.descripcionContacto = descripcionContacto;
    }

    public Agenda_contactos(String nombreContacto, String apellidoContacto, String empresaContacto, String telefonoContacto, String descripcionContacto) {
        this.nombreContacto = nombreContacto;
        this.apellidoContacto = apellidoContacto;
        this.empresaContacto = empresaContacto;
        this.telefonoContacto = telefonoContacto;
        this.descripcionContacto = descripcionContacto;
    }

    public int getCodigoContacto() {
        return codigoContacto;
    }

    public void setCodigoContacto(int codigoContacto) {
        this.codigoContacto = codigoContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getApellidoContacto() {
        return apellidoContacto;
    }

    public void setApellidoContacto(String apellidoContacto) {
        this.apellidoContacto = apellidoContacto;
    }

    public String getEmpresaContacto() {
        return empresaContacto;
    }

    public void setEmpresaContacto(String empresaContacto) {
        this.empresaContacto = empresaContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDescripcionContacto() {
        return descripcionContacto;
    }

    public void setDescripcionContacto(String descripcionContacto) {
        this.descripcionContacto = descripcionContacto;
    }
}
