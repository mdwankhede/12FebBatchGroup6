package com.Bigbasket.POMClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectDishProgram 
{
                   public static void main(String[] args) throws InterruptedException 
                     {
                	   System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe\\");
                       WebDriver driver=  new ChromeDriver();
                       driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-IND&gclid=EAIaIQobChMI3_2q6s_o9wIVRnZgCh0WcwBrEAAYASAAEgKmJPD_BwE");
                       driver.manage().window().maximize();
                       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                       
                       // Shop By Category  
                       WebElement shopCa = driver.findElement(By.xpath("(//a[contains(@class,'ng-binding active')])[2]"));
                      // shopCa.click();
                       Actions act = new Actions(driver);
                       act.moveToElement(shopCa);
                       Thread.sleep(3000);
                       // Shop By Category
                       WebElement shopCa1 = driver.findElement(By.xpath("(//a[contains(@class,'ng-binding l2select')])[2]"));
                       act.moveToElement(shopCa1);
                       Thread.sleep(3000);
                    // Shop By Category  
                       WebElement shopCa11 = driver.findElement(By.xpath("(//a[contains(@qa,'catL3')])[1]"));
                        act.moveToElement(shopCa11);
                        Thread.sleep(3000);
                       //a[text()='Nan Pro'][2]
                        WebElement shopCa111= driver.findElement(By.xpath("(//a[contains(text(),'Onion')])[2]"));
                         act.moveToElement(shopCa111);
				     }
}
