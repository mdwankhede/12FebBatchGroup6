package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 
{
         public static void main(String[] args) 
         {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
     		WebDriver driver=  new ChromeDriver();
     		driver.get("https://www.google.com/");
     		String expectedurl = "https://www.google.com/";
          //  String expectedurl = "https://www.instagram.com/";|| when enter wrong url(Test case is failed)
    		String actualurl = driver.getCurrentUrl();
    		if(expectedurl.equals(actualurl))
    		{
    			System.out.println("Test Case is passed.");
    		}
    		else 
    		{
    			System.out.println("Test Case is failed.");
    		}
     		
		 }
}
