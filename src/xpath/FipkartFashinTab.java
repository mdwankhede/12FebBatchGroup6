package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FipkartFashinTab 
{
         public static void main(String[] args)  
          {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             WebDriver driver=  new ChromeDriver();
             driver.get("https://www.flipkart.com/");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             //cross
             WebElement cross = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
             cross.click();
             
          // Locating the Main Menu (Parent element)
             WebElement mainMenu = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]"));

             //Instantiating Actions class
             Actions actions = new Actions(driver);

             //Hovering on main menu
             actions.moveToElement(mainMenu);

             // Locating the element from Sub Menu
             WebElement subMenu = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));

             //To mouseover on sub menu
             actions.moveToElement(subMenu);

             //build()- used to compile all the actions into a single step 
             actions.click().build().perform();
             
             
             
             
      
          
          }
}
