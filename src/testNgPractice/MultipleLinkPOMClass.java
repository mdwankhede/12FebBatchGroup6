package testNgPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleLinkPOMClass 
{
      private WebDriver driver;
      
      @FindBy(xpath="//a[contains(text(),'Mobiles')]")
      private List<WebElement>  mobileLink;
      public void findLink()
      {
    	 // mobileLink.size();
    	  System.out.println("Total number of link - "+mobileLink.size());
      }
      
      @FindBy(xpath="//a")
      private List<WebElement>  Links;
      public void clickLink()
      {
    	  //Links.size();
    	  System.out.println("Link - "+Links.size());
    	 
    	  }
      //constructor 
      public MultipleLinkPOMClass(WebDriver driver)
      {
    	     this.driver = driver;
    	     PageFactory.initElements(driver, this);
      }
      
}
