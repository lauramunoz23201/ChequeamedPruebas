/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;

import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author LAURA HENAO
 */
public class menu {

    WebDriver driver;
    By mensaje = By.cssSelector("#gtco-header > div > div > div > div > div > div > div > h1 > strong");

    public menu(WebDriver driver) {

        this.driver = driver;

    }

    public void clickMensaje() {
        driver.findElement(mensaje).click();
    }

    public String getValueMensaje() {
        return driver.findElement(mensaje).getAttribute("value");
    }

}
