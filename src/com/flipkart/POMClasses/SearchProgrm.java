package com.flipkart.POMClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchProgrm 
{
   public static void main(String[] args) 
   {
  	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
     WebDriver driver=  new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
      //Handle normal pop-up 
      WebElement cross = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
      cross.click();
  /*    
      // Search mobile in search bar
      WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
      search.sendKeys("DELL Laptop");
      search.sendKeys(Keys.RETURN);
      System.out.println("Entered Item in search option.");
      
      // select any laptop
      driver.findElement(By.xpath("//div[text()='DELL G15 Core i7 11th Gen - (16 GB/512 GB SSD/Windows 10/4 GB Graphics/NVIDIA GeForce RTX 3050Ti/120 H...']")).click();
      System.out.println("DELL G15 Core i7 11th Gen.");
    */  
      
      //clicked on kurti
      driver.findElement(By.xpath("//img[@alt='mokshi Women Printed Flared Kurta']")).click();
     
     WebElement kutri =  driver.findElement(By.xpath("//select[@class='_2YxCDZ'][2]"));
      Select s = new Select(kutri);
    //  s.selectByVisibleText("₹1500");
      System.out.println("Select price.");
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
