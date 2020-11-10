package Modelo;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    public List listarPa() {
        List<Paciente> listap = new ArrayList<>();
        String sql = "SELECT * FROM PACIENTES";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Paciente pa = new Paciente();
                pa.setId_p(rs.getString(1));
                pa.setNom_p(rs.getString(2));
                pa.setPri_ape_p(rs.getString(3));
                pa.setSeg_ape_p(rs.getString(4));
                pa.setSexo(rs.getString(5));
                listap.add(pa);
            }
        } catch (SQLException e) {

        }
        return listap;
    }

    public int agregarPa(Paciente pa) {
        int rp = 0;
        String sql = "INSERT INTO PACIENTES (ID_P, NOMBRE_P, APELLIDO_P, APELLIDO2_P, SEXO_P) VALUES (?, ?, ?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pa.getId_p());
            ps.setString(2, pa.getNom_p());
            ps.setString(3, pa.getPri_ape_p());
            ps.setString(4, pa.getSeg_ape_p());
            ps.setString(5, pa.getSexo());
            ps.executeUpdate();
            if (rp == 1) {
                rp = 1;
            } else {
                rp = 0;
            }
        } catch (Exception e) {

        }
        return rp;
    }

    public Paciente listarIdPa(String idp) {
        String sql = "SELECT IID_P, NOMBRE_P, APELLIDO_P, APELLIDO2_P, SEXO_P FROM PACIENTES WHERE ID_P=" + idp;
        Paciente pa = new Paciente();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pa.setId_p(rs.getString(1));
                pa.setNom_p(rs.getString(2));
                pa.setPri_ape_p(rs.getString(3));
                pa.setSeg_ape_p(rs.getString(4));
                pa.setSexo(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return pa;
    }

    public int actualizarPa(Paciente pa) {
        int rp = 0;
        String sql = "UPDATE PACIENTES SET ID_P = ?, NOMBRE_P = ?, APELLIDO_P = ?, APELLIDO2_P = ?, SEXO_P =? WHERE ID_P =?";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pa.getId_p());
            ps.setString(2, pa.getNom_p());
            ps.setString(3, pa.getPri_ape_p());
            ps.setString(4, pa.getSeg_ape_p());
            ps.setString(5, pa.getSexo());
            rp = ps.executeUpdate();
            if (rp == 1) {
                rp = 1;
            } else {
                rp = 0;
            }
        } catch (Exception e) {
        }
        return rp;
    }

    public void eliminarPa(String idp) {
        String sql = "DELETE FROM PACIENTES WHERE ID_P=" + idp;
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
}
