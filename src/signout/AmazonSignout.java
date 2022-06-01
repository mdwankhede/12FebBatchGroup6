package signout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignout 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
         WebDriver driver=  new ChromeDriver();
         driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        Thread.sleep(2000);
        
        // Email
        WebElement emailID = driver.findElement(By.xpath("//input[@id='ap_email']"));
        emailID.sendKeys("wankhedemayuri22@gmail.com");
        System.out.println("Email is entered.");
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        // password
        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("#mayu555");
        System.out.println("Passsword is entered.");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        WebElement accountList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	     Actions act = new Actions(driver);
	     act.moveToElement(accountList);
	     
	     WebElement signout = driver.findElement(By.xpath("//span[text()='Sign Out']"));
	     act.moveToElement(signout);
	     act.click().build().perform();
	     
	     String actualresult = "Amazon Sign In";
	     String expectedresult = driver.getTitle();
	     if(expectedresult.equals(actualresult))
	     {
	    	System.out.println("Test case is passed."); 
	     }
	     else
	     {
	    	System.out.println("Test case is failed."); 
	     }
	     System.out.println("emd of program.");
    }
}
