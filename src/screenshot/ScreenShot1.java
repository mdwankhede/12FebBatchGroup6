package screenshot;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 
{
       public static void main(String args[])
       {
    	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
           WebDriver driver=  new ChromeDriver();  // ope nthe url but not screenshot
           driver.manage().window().maximize();
           driver.get("https://www.saucedemo.com/");
           
               // How type of upcasting done
   /*        
           WebDriver driver=  new ChromeDriver();
           TakeScreenshot is = new chromeDriver(); // It take screenshot and open URL
            || casting  
                       int                 a            =           200;
                      double           b     = (double)a;
                   WebDriver driver = new ChromeDriver();  
               ||  upcasting of driver refvar from webdriver interface to takesscreenshot interface
                                   
  */     
           TakesScreenshot ts = (TakesScreenshot)driver;
           ts.getScreenshotAs(null);
           
       }
}
