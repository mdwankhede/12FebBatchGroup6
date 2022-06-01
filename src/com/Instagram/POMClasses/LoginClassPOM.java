package com.Instagram.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClassPOM 
{
               public static void main(String[] args) throws InterruptedException
               {
            	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                   WebDriver driver=  new ChromeDriver();
                  Thread.sleep(2000);
                   
                   driver.manage().window().maximize();
                   driver.get("https://www.instagram.com/");
                   
                   //username
                WebElement username  =  driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
                username.sendKeys("mayuri_d55");
                
                //password
                WebElement password  =  driver.findElement(By.xpath("//input[@name='password']"));
                password.sendKeys("#mayu55");
                
                //login
                WebElement loginbutton  =  driver.findElement(By.xpath("//div[text()='Log In']"));
                loginbutton.click();
			  }
} 
