package com.mycompany.testiniumtask;
/**
 *
 * @author Fatih
 */
import java.io.File;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {
      protected static String ChromePath = "C:\\driver\\chromedriver.exe";
      
      protected static ChromeDriverService service;
      
      protected static WebDriver driver;
      
      protected static WebDriverWait wait;
      // Main 
      public void BaseTest(){
          
          
      }
      @BeforeClass
      public static void Setup(){
          //  başlat
          service = new ChromeDriverService.Builder().
                 usingDriverExecutable(new File(ChromePath)).
                 usingAnyFreePort().
                 build();
          try {
             service.start();
          } catch (Exception e) {
             e.printStackTrace();
          }
          System.setProperty("webdriver.chrome.driver", ChromePath);
          
          driver = new  RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
          // Penceri Büyüt
          driver.manage().window().maximize();
       }
      
      
@AfterClass
       public static void Stop(){
          
           driver.quit();
           service.stop();
       }    
}
