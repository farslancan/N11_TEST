package com.mycompany.testiniumtask;
/**
 *
 * @author Fatih
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage extends BasePage{

     // Consturctor
     public HomePage(WebDriver driver, WebDriverWait wait) {
           super(driver,   wait);
        driver.get("https://n11.com/");
     }
     
     public String btnAnaSayfa = "https://www.n11.com/";
     public String btnLogIn = "loginButton";
    
     // HomeTest
     public String checkMenuLinks(String button){
        click(By.id(button));
        return driver.getCurrentUrl();
     }
}
