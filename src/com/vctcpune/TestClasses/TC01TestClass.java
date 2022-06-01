package com.vctcpune.TestClasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vctcpune.POMClasses.VelocityPOMClasse1;

public class TC01TestClass 
{
         @Test
         public void SeleniumPracticeTest()
         {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             WebDriver driver=  new ChromeDriver();
             System.out.println("Browser open");
             driver.manage().window().maximize();
             driver.get("https://vctcpune.com/");
             System.out.println("URL open");
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             
             //move on selenium practice page
             String mainpageaddress = driver.getWindowHandle();
             System.out.println("Main Page Address - "+mainpageaddress);
             VelocityPOMClasse1 vp = new VelocityPOMClasse1(driver);
             vp.clickseleniumpractice();
             System.out.println("Moved from main page to child page.");
             List<String> allpageaddress = new ArrayList<String>(driver.getWindowHandles());
             System.out.println(allpageaddress);
             
             //Scrolling
             JavascriptExecutor js = (JavascriptExecutor)driver;
             js.executeScript("window.scrollBy(0,500)");
             //switch selenium focus 
             driver.switchTo().window(allpageaddress.get(1)); // provide index
             vp.clickradiobutton();
             System.out.println("Clicked on Radio Button.");
              vp.sendcountryname();
              System.out.println("entered country name.");
             vp.clickdropdrown();
             System.out.println("Clicked on drop down.");
             vp.clickckheckbox1();
             System.out.println("Clicked CheckedBox 1");
             vp.clickckheckbox2();
             System.out.println("Clicked CheckedBox 2");
             vp.clickckheckbox3();
             System.out.println("Clicked CheckedBox 3");
            // vp.clickSwitchTab();
             System.out.println("Switch the tab.");
             vp.clickswitchtoAlert();
             System.out.println("Switch to Alert.");
        	 vp.getWebTable();
        	 System.out.println("Get the data from Web Table.");
        	 vp.clickElementDisplayed();
        	 System.out.println("Clicked on Hide Button");
        	 vp.clickElementHide();
        	  System.out.println("Clicked on Show Button"); 
        	vp.mouseHover();
        	System.out.println("Perform mouse action.");
        	vp.mouseHoverTop();
        	System.out.println("Clicked on Top");
        	vp.clickpopup();
        	System.out.println("Show popUp");
        	vp.clicksuggestivedropdown();
        	System.out.println("Clicked on Suggestive Drop Down");
        	vp.clickdropdownAkola();
        	System.out.println("Clicked on Akola.");
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	 
         }
}
