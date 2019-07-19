package com.mycompany.testiniumtask;
/**
 *
 * @author Fatih
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
    // Kullanlacak metodlar
public abstract class BasePage {
     public WebDriver driver;
     public WebDriverWait wait;
     public static WebElement element = null;
     //Constructor
     public BasePage (WebDriver driver, WebDriverWait wait){
         this.driver = driver;
         this.wait = wait;
     }
     //Click Metod
     public void click (By elementLocation) {
         driver.findElement(elementLocation).click();
     }
     //Text yazma
     public void writeText (By elementLocation, String text) {
         driver.findElement(elementLocation).clear();
         driver.findElement(elementLocation).sendKeys(text);
     }
     //Text okuma
     public String readText (By elementLocation) {
         return driver.findElement(elementLocation).getText();
     }
     //Eleman Listesi
     public List<WebElement> getElements(By elementLocation){
         return driver.findElements(elementLocation);
     }  
     //Eleman çek
     public WebElement getElement(By elementLocation){
         return driver.findElement(elementLocation);
     }
}
