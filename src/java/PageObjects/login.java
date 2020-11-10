/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author LAURA HENAO
 */
public class login {
    
    WebDriver driver;
    By ident = By.cssSelector("#inputId");
    By contra = By.cssSelector("#inputContra");
    By cargo = By.cssSelector("#inputCargo");
    Select lista = new Select (driver.findElement(By.cssSelector("#inputCargo")));
    //lista.selectByVisibleText("Enfermera");
    By btnIng = By.cssSelector("#idIngresar");
    
    
    public login(WebDriver driver){

        this.driver = driver;

    }
    
    //Completar campo "Identificacion"

    public void setIdent(String strIdent){

        driver.findElement(ident).sendKeys(strIdent);

    }

    

    //Completar campo "Contraseña"

    public void setContra(String strContra){

         driver.findElement(contra).sendKeys(strContra);

    }
    
    
    
    //Completar campo "Contraseña"

    public void setCargo(String strCargo){

        //Primera opcion
        //driver.findElement(cargo).sendKeys(strCargo);
         
         //Segunda opcion
        lista.selectByVisibleText("Enfermera");

    }

    

    //Click en boton Ingresar

    public void clickIngresar(){

            driver.findElement(btnIng).click();

    }
    
    
    public void loginWeb(String ident, String contra, String cargo){

        //Identificacion

        this.setIdent(ident); // Paso 2

        //Contraseña

        this.setContra(contra); // pase 3
        
        //Cargo
        
        this.setCargo(cargo);

        //Boton

        this.clickIngresar();// paso 4
    }
    
    
}
