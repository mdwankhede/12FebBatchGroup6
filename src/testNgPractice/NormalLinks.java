package testNgPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLinks 
{
       public static void main(String[] args) 
        {
    	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
           WebDriver driver=  new ChromeDriver();
           System.out.println("Browser open");
           driver.manage().window().maximize();
           driver.get("https://www.amazon.in/");
           System.out.println("URL open");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           
         //driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
			
			//How many links are present on the webpage
			
		List <WebElement>links=	driver.findElements(By.tagName("a"));	
		System.out.println("Numbers of links present on webpage :"+links.size() );
		
		//3. Print all the links 
		
//		for(int i=0;i<links.size();i++) 
//		{
//			System.out.println(links.get(i).getAttribute("href"));
//		}
		
//	    	for(WebElement link:links) 
//	    	{
//	    		System.out.println(link.getText());
//	    		System.out.println(link.getAttribute("href"));
//	    	}
           
	  }
}
