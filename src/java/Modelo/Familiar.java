
package Modelo;

public class Familiar {
    String id_usu;
    String id_pac;
    String parentesco;

    public Familiar() {
    }

    public Familiar(String id_usu, String id_pac, String parentesco) {
        this.id_usu = id_usu;
        this.id_pac = id_pac;
        this.parentesco = parentesco;
    }

    public String getId_usu() {
        return id_usu;
    }

    public void setId_usu(String id_usu) {
        this.id_usu = id_usu;
    }

    public String getId_pac() {
        return id_pac;
    }

    public void setId_pac(String id_pac) {
        this.id_pac = id_pac;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    
}
