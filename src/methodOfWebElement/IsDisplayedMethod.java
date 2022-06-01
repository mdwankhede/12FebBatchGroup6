package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod 
{
         public static void main(String[] args)
         {
        	 
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             WebDriver driver=  new ChromeDriver();
             driver.get("https://vctcpune.com/selenium/practice.html");
           driver.manage().window().maximize();
               
             //Is diaplayed method
            // hideButton
           //showButton
           // textBox
           
//           WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//           hideButton.click();
//           
//           WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//           boolean result = textBox.isDisplayed();
//           System.out.println("After clicking on hide button"+result); // false
//           
//           WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
//           showButton.click();
//           
//           boolean result2 = textBox.isDisplayed();
//           System.out.println("After clicking on hide button"+result2);   // true
//           
//           if(result2 ==true)
//           {
//        	   textBox.sendKeys("India");
//           }   
//           else
//           {
//        	   showButton.click();
//        	   textBox.sendKeys("India");
//           }
        	
           //is enabled
           
           WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']s"));
          boolean result = textBox.isEnabled();
          System.out.println(result);
          if(result==true)
          {
       	   textBox.sendKeys("India");
          }   
          else
          {
       	   textBox.sendKeys("We can not pass the value.");
          }
           
           
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
           
            
         }
}
