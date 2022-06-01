package seleniumPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
	           WebDriver driver=  new ChromeDriver();
	           driver.get("https://www.instagram.com");
	           driver.manage().window().maximize();
               driver.navigate().to("https://www.google.com/");
               driver.getTitle(); // Get title of url
               driver.manage().window().minimize();
               driver.navigate().back();   
               driver.getTitle(); // Get title of url
               // driver.close(); // close the current tab
               
	}

}
