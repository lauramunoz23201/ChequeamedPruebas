package Modelo;

/**
 *
 * @author valen
 */
public class Medicamento {
    String id_m;
    String nom_m;
    String v_admin;

    public Medicamento() {
    }

    public Medicamento(String id_m, String nom_m, String v_admin) {
        this.id_m = id_m;
        this.nom_m = nom_m;
        this.v_admin = v_admin;
    }

    public String getId_m() {
        return id_m;
    }

    public void setId_m(String id_m) {
        this.id_m = id_m;
    }

    public String getNom_m() {
        return nom_m;
    }

    public void setNom_m(String nom_m) {
        this.nom_m = nom_m;
    }

    public String getV_admin() {
        return v_admin;
    }

    public void setV_admin(String v_admin) {
        this.v_admin = v_admin;
    }
    
}
