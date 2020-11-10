package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FamiliarDAO {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    public List listarFa() {
        List<Familiar> listafa = new ArrayList<>();
        String sql = "SELECT * FROM FAMILIARES";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Familiar f = new Familiar();
                f.setId_usu(rs.getString(1));
                f.setId_pac(rs.getString(2));
                f.setParentesco(rs.getString(3));
                listafa.add(f);
            }
        } catch (SQLException e) {

        }
        return listafa;
    }

    public int agregarFa(Familiar f) {
        int rfa = 0;
        String sql = "INSERT INTO FAMILIARES (ID_USU, ID_PAC, PARENTESCO) VALUES (?, ?, ?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, f.getId_usu());
            ps.setString(2, f.getId_pac());
            ps.setString(3, f.getParentesco());
            ps.executeUpdate();
            if (rfa == 1) {
                rfa = 1;
            } else {
                rfa = 0;
            }
        } catch (Exception e) {

        }
        return rfa;
    }

    public Familiar listarId(String idfa) {
        String sql = "SELECT * FROM FAMILIARES WHERE ID_USU=" + idfa;
        Familiar fa = new Familiar();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                fa.setId_usu(rs.getString(1));
                fa.setId_pac(rs.getString(2));
                fa.setParentesco(rs.getString(3));
            }
        } catch (Exception e) {
        }
        return fa;
    }

    public List<Familiar> listarFa(String idfam) {
        List<Familiar> listafaid = new ArrayList<>();
        String sql = "SELECT * FROM FAMILIARES WHERE ID_USU=" + idfam;
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Familiar f = new Familiar();
                f.setId_usu(rs.getString(1));
                f.setId_pac(rs.getString(2));
                f.setParentesco(rs.getString(3));
                listafaid.add(f);
            }
        } catch (SQLException e) {

        }
        return listafaid;
    }

}
