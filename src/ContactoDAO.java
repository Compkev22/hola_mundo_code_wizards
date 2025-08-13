import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ContactoDAO {




    public void insertar(Agenda_contactos agenda) {
        String sql = "INSERT INTO Contacto (nombreContacto, apellidoContacto, empresaContacto, telefonoContacto, descripcionContacto) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexion = Conexion.getInstancia().getConexion();
             PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, agenda.getNombreContacto());
            preparedStatement.setString(2, agenda.getApellidoContacto());
            preparedStatement.setString(3, agenda.getEmpresaContacto());
            preparedStatement.setString(4, agenda.getTelefonoContacto());
            preparedStatement.setString(5, agenda.getDescripcionContacto());
            preparedStatement.executeUpdate();
            System.out.println("Se registro al Contacto Correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Agenda_contactos> listar() {
        List<Agenda_contactos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Contacto";
        try (Connection conexion = Conexion.getInstancia().getConexion();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Agenda_contactos(
                        rs.getInt("codigoContacto"),
                        rs.getString("nombreContacto"),
                        rs.getString("apellidoContacto"),
                        rs.getString("empresaContacto"),
                        rs.getString("telefonoContacto"),
                        rs.getString("descripcionContacto")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void buscar(int codigo) {
        String sql = "SELECT * FROM Contacto WHERE codigoContacto=?";
        try (Connection conn = Conexion.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Código: " + rs.getInt("codigoContacto"));
                System.out.println("Nombre: " + rs.getString("nombreContacto"));
                System.out.println("Apellido: " + rs.getString("apellidoContacto"));
                System.out.println("Empresa: " + rs.getString("empresaContacto"));
                System.out.println("Telefono: " + rs.getString("telefonoContacto"));
                System.out.println("Descripción: " + rs.getString("descripcionContacto"));



            } else {
                System.out.println(" No se encontró el contacto.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Agenda_contactos agenda) {
        String sql = "UPDATE Contacto SET nombreContacto=?, apellidoContacto=?, empresaContacto=?, telefonoContacto=?, descripcionContacto=? WHERE codigoContacto=?";
        try (Connection conexion = Conexion.getInstancia().getConexion();
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, agenda.getNombreContacto());
            statement.setString(2, agenda.getApellidoContacto());
            statement.setString(3, agenda.getEmpresaContacto());
            statement.setString(4, agenda.getTelefonoContacto());
            statement.setString(5, agenda.getDescripcionContacto());
            statement.setInt(6, agenda.getCodigoContacto());
            statement.executeUpdate();
            System.out.println("Se actualizo Correctamente al Contacto.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int codigo) {
        String sql = "DELETE FROM Contacto WHERE codigoContacto=?";
        try (Connection conn = Conexion.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
            System.out.println("Contacto Eliminado Correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}




