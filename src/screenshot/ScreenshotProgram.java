package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotProgram 
{
                    public static void main(String[] args) throws IOException 
                    {
                    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                        WebDriver driver=  new ChromeDriver();  // open the url but not screenshot
                        driver.manage().window().maximize();
                        driver.get("https://www.saucedemo.com/");
                        //Screenshot
                        TakesScreenshot ts = (TakesScreenshot)driver;
                     File sourcefile =  ts.getScreenshotAs(OutputType.FILE);
                     File destfile   =    new File("D:\\screenshot\\SauceDemoLogin.jpg");
                     FileHandler.copy(sourcefile, destfile);
                     System.out.println("Screenshot is taken.");
                     
                  // username
                     WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
                     username.clear();
                     username.sendKeys("standard_user");
                
                     
                     // password
                     WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
                     password.clear();
                     password.sendKeys("secret_sauce");
                 
                     
                     // Log In
                     WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
                     loginbutton.click();
                     
                     File sourcefile1 =  ts.getScreenshotAs(OutputType.FILE);
                     File destfile1   =    new File("D:\\screenshot\\SauceDemoHome.jpg");
                     FileHandler.copy(sourcefile1, destfile1);
                     System.out.println("Screenshot is taken.");
                     
                     // select product
                     WebElement productutton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
                     productutton.click();
                     
                     File sourcefile2 =  ts.getScreenshotAs(OutputType.FILE);
                     File destfile2   =    new File("D:\\screenshot\\SauceDemoproduct.jpg");
                     FileHandler.copy(sourcefile2, destfile2);
                     System.out.println("Screenshot is taken.");
					}
}
