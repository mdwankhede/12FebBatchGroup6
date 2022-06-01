package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod 
{
           public static void main(String[] args) 
           {
        	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
               WebDriver driver=  new ChromeDriver();
               driver.get("https://vctcpune.com/selenium/practice.html");
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
               driver.manage().window().maximize();
             
             WebElement radiobutton = driver.findElement(By.xpath("//input[@value ='Radio1']"));
             
             boolean result = radiobutton.isSelected();
             System.out.println(result);   // false
             
             if(result == false)
             {
            	 radiobutton.click();
             }
             else
             {
            	 System.out.println("Button is already selected");
             }
             boolean result1 = radiobutton.isSelected();
             System.out.println("After Clicking "+result1); 
		  }
}
