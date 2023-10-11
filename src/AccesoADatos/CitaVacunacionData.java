package AccesoADatos;


import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Vacuna;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CitaVacunacionData {
    Conexion conex = new Conexion();

    public CitaVacunacionData() {
        conex = new Conexion();
    }

    public void guardarCitaVacunacion(CitaVacunacion citaVacunacion) {
        String sql = "INSERT INTO turnovacunacion (`codCita`, `dniCiudadano`, `codRefuerzo`, `centroVacunacion`, `fechaHoraColoca`, `nroSerieDosis`) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, citaVacunacion.getCodCita());
            ps.setInt(2, citaVacunacion.getCiudadano().getDni());
            ps.setInt(3, citaVacunacion.getCodRefuerzo());
            ps.setString(4, citaVacunacion.getCentroVacunacion());
            ps.setString(5, citaVacunacion.getFechaHoraColoca().toString());
            ps.setInt(6, citaVacunacion.getNroSerieDosis().getNroSerieDosis());

            int filaCreada = ps.executeUpdate();

            if (filaCreada > 0) {
                JOptionPane.showMessageDialog(null, "!Excelente¡ Su cita de vacunación fue añadida con éxito.");
                System.out.println("!Excelente¡ Su cita de vacunación fue añadida con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "!Error¡ No se pudo añadir la cita de vacunación.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita de vacunación: " + e.getMessage());
            System.out.println("Error al guardar la cita de vacunación: " + e.getMessage());
        }
    }

    public CitaVacunacion buscarTurnoPorDniCiudadano(int dniCiudadano) {
        CitaVacunacion turno = null;
        String sql = "SELECT * FROM turnovacunacion " +
                     "JOIN ciudadano ON turnovacunacion.dniCiudadano = ciudadano.dni " +
                     "JOIN vacuna ON turnovacunacion.nroSerieDosis = vacuna.nroSerieDosis " +
                     "WHERE turnovacunacion.dniCiudadano = ?";
        PreparedStatement ps = null;

        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1, dniCiudadano);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                turno = new CitaVacunacion();
                turno.setCodCita(rs.getInt("codCita"));
                turno.setCodRefuerzo(rs.getInt("codRefuerzo"));
                turno.setCentroVacunacion(rs.getString("centroVacunacion"));
                turno.setFechaHoraColoca(rs.getTimestamp("fechaHoraColoca").toLocalDateTime().toLocalDate());

                Ciudadano ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setNombre(rs.getString("nombre"));
                ciudadano.setApellido(rs.getString("apellido"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getString("celular"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setOcupacion(rs.getString("ocupacion"));
                ciudadano.setEdad(rs.getInt("edad"));
                ciudadano.setResponsableLegal(rs.getString("responsableLegal"));

                turno.setCiudadano(ciudadano);

                Vacuna vacuna = new Vacuna();
                vacuna.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                // Establece otros atributos de la Vacuna según la estructura de tu base de datos

                turno.setNroSerieDosis(vacuna);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turnovacunacion " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(turno);
        return turno;
    }

    public List<CitaVacunacion> listarCitasVacunacion() {
        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * FROM turnovacunacion " +
                     "JOIN ciudadano ON turnovacunacion.dniCiudadano = ciudadano.dni " +
                     "JOIN vacuna ON turnovacunacion.nroSerieDosis = vacuna.nroSerieDosis";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CitaVacunacion turno = new CitaVacunacion();
                turno.setCodCita(rs.getInt("codCita"));
                turno.setCodRefuerzo(rs.getInt("codRefuerzo"));
                turno.setCentroVacunacion(rs.getString("centroVacunacion"));
                turno.setFechaHoraColoca(rs.getTimestamp("fechaHoraColoca").toLocalDateTime().toLocalDate());

                Ciudadano ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setNombre(rs.getString("nombre"));
                ciudadano.setApellido(rs.getString("apellido"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getString("celular"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setOcupacion(rs.getString("ocupacion"));
                ciudadano.setEdad(rs.getInt("edad"));
                ciudadano.setResponsableLegal(rs.getString("responsableLegal"));

                turno.setCiudadano(ciudadano);

                Vacuna vacuna = new Vacuna();
                vacuna.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                // Establece otros atributos de la Vacuna según la estructura de tu base de datos

                turno.setNroSerieDosis(vacuna);

                citas.add(turno);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turnovacunacion " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(citas);
        return citas;
    }

    public void eliminarCitaVacunacion(int codCita) {
        String sql = "DELETE FROM turnovacunacion WHERE codCita = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, codCita);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita de vacunación eliminada exitosamente.");
                System.out.println("Cita de vacunación eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La cita de vacunación no pudo ser eliminada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la cita de vacunación: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    public void actualizarEstadoCitasVacunacion() {
        String sql = "UPDATE turnovacunacion SET aplicacion = false WHERE aplicacion = true";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Estado de las citas de vacunación actualizado exitosamente.");
                System.out.println("Estado de las citas de vacunación actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron citas de vacunación para actualizar.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de las citas de vacunación: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }
    
    public void modificarCitasVacunacion(CitaVacunacion citaModificada) {
        String sql = "UPDATE turnovacunacion " +
                     "SET codRefuerzo = ?, centroVacunacion = ?, fechaHoraColoca = ?, nroSerieDosis = ? " +
                     "WHERE codCita = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, citaModificada.getCodRefuerzo());            
            ps.setString(2, citaModificada.getCentroVacunacion());
            ps.setTimestamp(3, Timestamp.valueOf(citaModificada.getFechaHoraColoca().atStartOfDay()));
            ps.setInt(4, citaModificada.getNroSerieDosis().getNroSerieDosis());
            ps.setInt(5, citaModificada.getCodCita());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita de vacunación modificada exitosamente.");
                System.out.println("Cita de vacunación modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La cita de vacunación no pudo ser modificada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la cita de vacunación: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    public void eliminarCitasVacunacion(int codCita) {
        String sql = "DELETE FROM turnovacunacion WHERE codCita = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, codCita);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita de vacunación eliminada exitosamente.");
                System.out.println("Cita de vacunación eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La cita de vacunación no pudo ser eliminada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la cita de vacunación: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    
}
