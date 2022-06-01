package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupPage 
{
              public static void main(String[] args) 
              {
            	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                  WebDriver driver=  new ChromeDriver();
                  driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Ce%7Ccreate%20facebook%20account%7C&placement=&creative=589460569870&keyword=create%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-15289672663%26loc_physical_ms%3D1007796%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIr5uJ_Pyz9wIVjTMqCh3SyQn-EAAYASAAEgI2YfD_BwE");
                driver.manage().window().maximize();
                
              //  fname
                WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));  
                fname.sendKeys("Riya");
                
            //  lname
                WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));  
                lname.sendKeys("Thakur");
                
                //email
                WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));  
                email.sendKeys("riyathakur2025@gmail.com");
                  
                //password
                WebElement password = driver.findElement(By.xpath("//input[@type='password']"));  
                password.sendKeys("riyathakur20");
                //date
                WebElement date = driver.findElement(By.xpath("//select[@id='day']")); 
                date.click();
                
                Select sop = new Select(date);
                  sop.selectByValue("2");
                
                //month
                  WebElement month = driver.findElement(By.xpath("//select[@id='month']")); 
                  month.click();
                  
                  Select sop1 = new Select(month);
                    sop1.selectByValue("5");
                
                    //year
                    WebElement year = driver.findElement(By.xpath("//select[@id='year']")); 
                    year.click();
                    
                    Select sop2 = new Select(year);
                      sop2.selectByValue("1995");
                      
                   //female
                      WebElement female = driver.findElement(By.xpath("//input[@type='radio'][1]")); 
                      female.click();  
                      
                         //signup
//                      WebElement signup = driver.findElement(By.xpath("//button[@type='signup']")); 
//                      signup.click();  
                      
                
			 }
}
