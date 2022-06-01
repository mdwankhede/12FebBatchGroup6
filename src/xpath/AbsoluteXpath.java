package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                 // Do not follow in daily practice.
public class AbsoluteXpath 
{
                        public static void main(String[] args) throws InterruptedException 
                        {
                        	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                            WebDriver driver=  new ChromeDriver();
                           driver.get("https://accounts.google.com/");
                           Thread.sleep(2000);
                           
                           // emailid
                          WebElement emailId =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
                          emailId.sendKeys("wankhedemayuri22@gmail.com");
                          
                          //nextbutton
                          WebElement nextbutton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
                          nextbutton.click();
                          
                         // forgotpassword
//                          WebElement forgotpassword = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]"));
//                          forgotpassword.click();
                        }
}
