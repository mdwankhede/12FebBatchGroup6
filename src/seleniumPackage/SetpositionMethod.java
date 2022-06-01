package seleniumPackage;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetpositionMethod 

{
           public static void main(String[] args) throws InterruptedException
           {
        	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
               WebDriver driver=  new ChromeDriver();
               driver.get("https://www.facebook.com/");
               String title= driver.getTitle();
               System.out.println(title);
               Thread.sleep(3000);
             
               
               //set size for browser
 /*              Dimension d = new Dimension(300,500);
                   driver.manage().window().setSize(d);
  */           
               
               
               // set position o browser
               
               Point p = new Point(100,100);
               driver.manage().window().setPosition(p);
               
               
               
               
	    	}
}
