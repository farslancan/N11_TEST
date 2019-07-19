package com.mycompany.testiniumtask;

/**
 *
 * @author Fatih
 */
import static org.junit.Assert.*;
import org.junit.Test;
import com.mycompany.testiniumtask.HomePage;

public class HomeTest extends BaseTest{
      @Test
      public void   valid_checkMenuLinks() throws   InterruptedException{
          
          HomePage home = new HomePage(driver,wait);
          // 1. parametre ile 2. değer konrolü
          assertEquals(home.checkMenuLinks(home.btnAnaSayfa),
                                   "https://www.n11.com/");
           
       }
@Test
       public void   invalid_checkMenuLinks() throws   InterruptedException {
          
          HomePage home = new HomePage(driver,wait);
          //1. parametre ile 2. değer aynı olmaması konrolü
          assertNotEquals(home.checkMenuLinks(home.btnAnaSayfa),
                                   "https://www.mackolik.com/");
          assertNotEquals(home.checkMenuLinks(home.btnLogIn),
                                               "https://www.youtube.com/");
          
        }
}
