
package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 
{
     public static void main(String[] args) 
     {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
         WebDriver driver=  new ChromeDriver();
         driver.get("https://vctcpune.com/selenium/practice.html");
       driver.manage().window().maximize();
       
       WebElement dropdown = driver.findElement(By.xpath("//select[@id ='dropdown-class-example']"));
       dropdown.click();
       
      Select sop = new Select(dropdown);
       // use any method from these 3 method
       //sop.selectByIndex(0); // pass 1, 2, 3, 4, 5
      sop.selectByValue("option2"); 
      // sop.selectByVisibleText("//option[text() ='Option2']");
	}
}
