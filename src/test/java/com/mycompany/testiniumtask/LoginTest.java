package com.mycompany.testiniumtask;

/**
 *
 * @author Fatih
 */
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import com.mycompany.testiniumtask.HomePage;
import com.mycompany.testiniumtask.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void valid_UsernameAndPassword() throws InterruptedException {

        HomePage home = new HomePage(driver, wait);
        LoginPage login = new LoginPage(driver, wait);
        // AnaSayfadaki Giriş Yap butonuna tıklanır 
        home.click(By.id(home.btnLogIn));
        // Login işlminin kontrolü

        assertEquals(
                login.UsernameAndPassword("arslancanfatih@gmail.com",
                        "32605849f"), true);
    }

    @Test
    public void invalid_UsernameAndPassword() throws InterruptedException {

        HomePage home = new HomePage(driver, wait);
        LoginPage login = new LoginPage(driver, wait);
        // AnaSayfadaki Giriş Yap butonuna tıklanır    
        home.click(By.id(home.btnLogIn));
        // Login hatalı durumu

        assertEquals(
                login.UsernameAndPassword("arslancan@gmail.com",
                        "00000000"), false);
    }

    @Test
    public void empty_UsernameAndPassword() throws InterruptedException {

        HomePage home = new HomePage(driver, wait);
        LoginPage login = new LoginPage(driver, wait);
        home.click(By.id(home.btnLogIn));
        // boş girdi durumu
        assertEquals(login.UsernameAndPassword("", ""),
                false);
    }
}
