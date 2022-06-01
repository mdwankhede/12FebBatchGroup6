package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPractice 
{
       public static void main(String[] args) 
       {
    	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
           WebDriver driver=  new ChromeDriver();
           driver.get("https://www.instagram.com");
          driver.getTitle(); // Get title of url
          driver.navigate();
          driver.get("https://www.facebook.com");
           // multiple instance of chrome  driver
         // WebDriver driver1 = new ChromeDriver();
      //    WebDriver driver2 = new ChromeDriver();
          
	   }
}
