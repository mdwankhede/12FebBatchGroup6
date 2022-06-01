package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 
{
          public static void main(String[] args) throws InterruptedException 
          {
        	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
        		WebDriver driver=  new ChromeDriver();
        		driver.get("https://www.google.com/");
        		driver.manage().window().maximize();
        		driver.get("https://www.facebook.com/");
        		Thread.sleep(10000);
        		driver.navigate().refresh();
		  }
}
