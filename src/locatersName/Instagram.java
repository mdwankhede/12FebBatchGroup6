package locatersName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver=  new ChromeDriver();
       driver.get("https://www.instagram.com/");
       Thread.sleep(2000);
       
       WebElement username = driver.findElement(By.name("username"));
       username.sendKeys("mayuri_d55");
       
       
       WebElement password = driver.findElement(By.name("password"));
       password.sendKeys("#mayu55");
       
       WebElement login = driver.findElement(By.className("sqdOP  L3NKy   y3zKF     "));
       login.click();
       
    
       
       
	}
}
