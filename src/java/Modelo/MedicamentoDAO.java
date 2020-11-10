package Modelo;

import Modelo.Conexion;
import Modelo.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoDAO {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    public List listar() {
        List<Medicamento> lista = new ArrayList<>();
        String sql = "SELECT * FROM MEDICAMENTOS";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Medicamento m = new Medicamento();
                m.setId_m(rs.getString(1));
                m.setNom_m(rs.getString(2));
                m.setV_admin(rs.getString(3));
                lista.add(m);
            }
        } catch (SQLException e) {

        }
        return lista;
    }

    public int agregar(Medicamento m) {
        int r = 0;
        String sql = "INSERT INTO MEDICAMENTOS (ID_M, NOMBRE_M, VIA_ADMIN_M) VALUES (?, ?, ?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getId_m());
            ps.setString(2, m.getNom_m());
            ps.setString(3, m.getV_admin());
            ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (Exception e) {

        }
        return r;
    }

    public Medicamento listarId(String id) {
        String sql = "SELECT * FROM MEDICAMENTOS WHERE ID_M=" + id;
        Medicamento me = new Medicamento();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                me.setId_m(rs.getString(1));
                me.setNom_m(rs.getString(2));
                me.setV_admin(rs.getString(3));

            }
        } catch (Exception e) {
        }
        return me;
    }

    public void actualizar(Medicamento m) {
        String sql = "UPDATE MEDICAMENTOS SET ID_M =?, NOMBRE_M =?, VIA_ADMIN_M=? WHERE ID_M=?";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getId_m());
            ps.setString(2, m.getNom_m());
            ps.setString(3, m.getV_admin());
          ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }

    public void eliminar(String id) {
        String sql = "DELETE FROM MEDICAMENTOS WHERE ID_M=" + id;
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

}
