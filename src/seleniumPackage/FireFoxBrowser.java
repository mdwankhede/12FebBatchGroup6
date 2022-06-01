package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser 
{
      public static void main(String[] args)
      {
    	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    		WebDriver driver=  new FirefoxDriver();
    		driver.get("https://www.google.com/");
    		driver.manage().window().minimize();
    		driver.get("https://www.instagram.com/");
    		driver.getTitle();
	}
}
