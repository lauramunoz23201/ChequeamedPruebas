
package PruebasAutomatizadas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.inicio;
import PageObjects.login;
import PageObjects.menu;
import PageObjects.p1;

public class PAutom1 {
    
    private static WebDriver driver = null;
    inicio ini;
    login log;
    menu menu;
    p1 pruebalogin;
    
    public PAutom1(){
    }
    
    @BeforeClass
    public static void serUpClass(){
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
        driver.get("http://localhost:8070/Chequeamed/");
    }
    
    @After
    public void tearDown(){
        //driver.quit();
    }
    
    
    @Test
    public void testLoginEnfermera(){
        String ident = "pepegarantizar";
        String contra = "pepegarantizar123";
        String cargo = "Enfermera";
        ini = new inicio(driver);
        log = new login(driver);
        menu = new menu(driver);
        ini.clickIniciarSesion();
        log.loginWeb(ident, contra, cargo);
        assertEquals("Validar Enfermera", "Enfermera", menu.getValueMensaje());
    }
    
}
