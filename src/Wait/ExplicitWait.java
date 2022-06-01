package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
 {
                       public static void main(String[] args) 
                        {
                    	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                           WebDriver driver=  new ChromeDriver();
                           driver.get("https://www.saucedemo.com/");
                   
                           // username
                           WebElement username = driver.findElement(By.id("user-name"));
                           username.clear();
                           username.sendKeys("standard_user");
                                                   
                          // password-- facing issue at password element
                         //explicit wait - for single element
                             WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                             WebElement password = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
                            password.sendKeys("secret_sauce");
                                              
                           // Log In
                           WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
                           loginbutton.click();
					   }
 }
