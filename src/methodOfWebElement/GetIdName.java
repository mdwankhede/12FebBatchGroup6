package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetIdName 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
     WebDriver driver=  new ChromeDriver();
    Thread.sleep(2000);
     
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/");	
    
     WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
     // get id
     String idAttribute = username.getAttribute("id");
     System.out.println(idAttribute);
     // get text
     String text = username.getText();
     System.out.println(text);
     //get tagname
     String tagname  = username.getTagName();
     System.out.println(tagname);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
}
