package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inicio {
    
    WebDriver driver;
    By btnLogin = By.cssSelector("#barra > div > div > div.col-xs-10.text-right.menu-1 > ul > li:nth-child(2) > a");
    
    public inicio(WebDriver driver){

        this.driver = driver;

    }
    
    public void clickIniciarSesion(){
        driver.findElement(btnLogin).click();
    }
    
}
