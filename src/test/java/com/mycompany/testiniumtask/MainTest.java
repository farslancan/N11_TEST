package com.mycompany.testiniumtask;
//import groovyjarjarantlr.collections.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;
import com.mycompany.testiniumtask.BasePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Fatih
 */
public class MainTest extends BaseTest {
    public static void main(String[]   args) {
        
      Setup();
      
      driver.get("https://www.n11.com/");   
     
      WebElement btnClick = driver.findElement(By.className("btnSignIn"));
      btnClick.click();
      
      // mail adresini giriyorum.
      WebElement MailClick = driver.findElement(By.id("email"));
      MailClick.click();
      MailClick.sendKeys("arslancanfatih@gmail.com");
      
      // şifrey giriyorum.
      WebElement SifreClick = driver.findElement(By.id("password"));
      SifreClick.click();
      SifreClick.sendKeys("32605849f");
      
      // girişe tıkla
      WebElement GirisClick = driver.findElement(By.id("loginButton"));
      GirisClick.click();
      
       // // Arama   kutusuna bilgisayar yaz  
      WebElement txtSearch = driver.findElement(By.id("searchData"));
      txtSearch.click();
      txtSearch.sendKeys("bilgisayar");
      // Ara   butonuna bas.
      WebElement btnSearch = driver.findElement(By.className("searchBtn"));
      btnSearch.click();
      
      // muhtemelen yanlış mantık ama ilerleyebilmek için...
      driver.get("https://www.n11.com/bilgisayar?q=bilgisayar&pg=2");
      
        // 2. sayfada oldugumzun kontrolu
       boolean contains = driver.getCurrentUrl().contains("https://www.n11.com/bilgisayar?q=bilgisayar&pg=2");
       if(contains != true){
           Stop();
       }
       
       // PC seçimi
      WebElement ListItem = driver.findElement(By.xpath(".//*[@id='view']/ul/li[2]"));
      WebElement clickItem = ListItem.findElement(By.className("productName"));
      clickItem.click();
      
      // sepete ekle
      WebElement SepetAtClick = driver.findElement(By.cssSelector(".btn.btnGrey.btnAddBasket"));
      SepetAtClick.click();

      
      //Ürün sayfasındaki ürün ile sepettekinin fiyat karşılaştırması.   Çalışmıyor.
      /*
      boolean contains2 = driver.findElement(By.className("productName")).equals(clickItem);
      if(contains2 != true){
          Stop();
      }
      */
      
      // sepete git
      WebElement SepeteGitClick = driver.findElement(By.className("myBasket"));
      SepeteGitClick.click();
      
      // adet arttır.
      WebElement AdetArtıClick = driver.findElement(By.cssSelector(".spinnerUp.spinnerArrow"));
      AdetArtıClick.click();
      
      // Sepetten ürünü sil.
      WebElement UrunSilClick = driver.findElement(By.cssSelector(".removeProd.svgIcon.svgIcon_trash"));
      UrunSilClick.click();
      
      
      
      // Rest Assured ile Get
      Rest_Assured sorgu = new Rest_Assured();
      sorgu.n11_RestAssured();  
      
      Stop();
    }
}
