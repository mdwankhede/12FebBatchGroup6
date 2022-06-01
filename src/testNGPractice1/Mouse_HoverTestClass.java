package testNGPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;

public class Mouse_HoverTestClass
{
       private WebDriver driver;
	@BeforeMethod
       public void setUp()
       {
    	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
            driver=  new ChromeDriver();
           System.out.println("Browser open");
           driver.manage().window().maximize();
           driver.get("https://www.saucedemo.com/");
           System.out.println("URL open");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//           Mouse_HoverPOMClasses mh = new Mouse_HoverPOMClasses(driver);
//           action1.moveToElement(admin).moveToElement(userManage).moveToElement(user).build().perform();
       }
	
	
           @Test
           public void verifyLoginFunctionality()
           {
         	  String expectedresult = "Swag Labs";
     		String actualresult = driver.getTitle();
               System.out.println("Verify the test cases");   
               if(expectedresult.equals(actualresult))
               {
            	   System.out.println("Test Case is passed.");
               }
               else
               {
            	   System.out.println("Test Case is failed.");
               }
           }
           @AfterMethod
           public void tearDown()
           {
         	// log out
               HomePagePOMClass hp = new HomePagePOMClass(driver);
               hp.clickMenuButtion();
               System.out.println("Clicked on Menu Button");
               hp.clicklogoutButtion();
               System.out.println("Clicked on Logout Button");
              driver.close();
           }
}
