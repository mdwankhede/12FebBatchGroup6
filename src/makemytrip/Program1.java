package makemytrip;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 
{        
	  //static WebDriver driver;
         public static void main(String[] args) throws InterruptedException 
            {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
        	 WebDriver driver= new ChromeDriver(); 	
       		System.out.println("Browser open.");
       		driver.manage().window().maximize();
     		driver.get("https://www.makemytrip.com");
     		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			
			driver.findElement(By.xpath("//label[@for='fromCity']")).click();
			Thread.sleep(2000);   //
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi"); 
			List<WebElement> From_list=driver.findElements(By.xpath("//div[@class='calc60']/p[@class='font14 appendBottom5 blackText']"));
			System.out.println(From_list.size());    // 20
			for(int i=0;i<From_list.size();i++) 
			{
				Thread.sleep(2000);
				if(From_list.get(i).getText().equals("New Delhi, India")) 
				{
					From_list.get(i).click();
					break;
				}
			}
			Thread.sleep(5000);
			
			Actions A= new Actions(driver);
			WebElement TO_=driver.findElement(By.xpath("//input[@placeholder=\"To\"]"));
			A.moveToElement(TO_).click().sendKeys("Mumbai").build().perform();
			Thread.sleep(2000);
			
			List<WebElement>To_list=driver.findElements(By.xpath("//div[@class='calc60']//p[@class='font14 appendBottom5 blackText']"));
			for(int i=0;i<To_list.size();i++)
			{
				if(To_list.get(i).getText().equals("Mumbai, India")) 
				{
					To_list.get(i).click();
					break;
				}
			}
		  }
}
