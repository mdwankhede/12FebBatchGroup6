package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus 

{
      public static void main(String[] args) throws InterruptedException
      {
    	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
          WebDriver driver=  new ChromeDriver();
          driver.get("https://www.redbus.in/");
          String title= driver.getTitle();
          System.out.println(title);
          //Thread.sleep(3000);
          driver.manage().window().maximize();
          
          //from
         WebElement frombutton= driver.findElement(By.xpath("//input[@id='src']"));
         frombutton.sendKeys("Nanded");
         frombutton.click();
         
         //To
         WebElement tobutton= driver.findElement(By.xpath("//input[@id='dest']"));
         tobutton.sendKeys("Muktainagar");
         tobutton.click();
       //date
         WebElement date= driver.findElement(By.xpath("//input[@id='onward_cal']"));
         date.click();
         
         //select current date
         WebElement currentdate= driver.findElement(By.xpath("//td[@class='current day']"));
         currentdate.click();
         
         
       //search butten
         WebElement searchnutton= driver.findElement(By.xpath("//button[text()='Search Buses']"));
         searchnutton.click();
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	 }
}
