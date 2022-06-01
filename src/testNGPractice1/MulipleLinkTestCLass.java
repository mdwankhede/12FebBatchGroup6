package testNGPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNgPractice.MultipleLinkPOMClass;

public class MulipleLinkTestCLass
{
	private WebDriver driver;
    @BeforeSuite
 public void MultipleLink()
 {
	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
      driver =  new ChromeDriver();
 }
    @BeforeTest
    public void upcasting()
    {
  	 driver = new ChromeDriver ();
  	 System.out.println("Browser open");
       driver.manage().window().maximize();
    }
    @BeforeClass
    public void urlOpen()
    {
  	  driver.get("https://www.amazon.in");
        System.out.println("URL open");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    
    @Test
    public void multiple_link()
    {
    	MultipleLinkPOMClass mplc = new MultipleLinkPOMClass( driver);
    	   mplc.clickLink();
    	   mplc.findLink();
    }
    
}
