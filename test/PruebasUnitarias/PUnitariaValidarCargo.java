package PruebasUnitarias;

import Modelo.Persona;
import Modelo.PersonaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PUnitariaValidarCargo {

    public PUnitariaValidarCargo() {
    }

    @After
    public void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @BeforeClass
    public static void tearDown() {
    }
@Test
    public void cargo() {

        PersonaDAO xdao = new PersonaDAO();
        Persona uPrueba = new Persona();

        uPrueba.setId("idPrueba");
        uPrueba.setNom("nomPrueba");
        uPrueba.setPri_ape("priapePrueba");
        uPrueba.setSeg_ape("segapePrueba");
        uPrueba.setCorreo("correoPrueba");
        uPrueba.setCargo("1");
        uPrueba.setContra("contraPrueba");
        uPrueba.setDir("dirPrueba");

        String esperado = "Enfermera";
        System.err.println("hola");
        String resultado = Modelo.PersonaDAO.validarCargoPrueba(uPrueba);

        System.out.println("" + resultado);

        Assert.assertEquals(esperado, resultado);

    }

}
