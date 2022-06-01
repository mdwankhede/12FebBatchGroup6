package com.vctcpune.POMClasses;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VelocityPOMClasse1 
{
	 private WebDriver driver;
	 
              @FindBy (xpath ="(//a[contains(text(),'Start Selenium Practice')])[1]")
              private WebElement statseleniumpracticelink;
              
              public void clickseleniumpractice()
              {
            	  statseleniumpracticelink.click();
              }
              
              // Radio button example
              @FindBy(xpath="//input[@value='Radio1']")
              private WebElement radiobutton;
              public void clickradiobutton() 
              {
            	  radiobutton.click();
              }
              // Suggession Class Example
              @FindBy(xpath="//input[@id='autocomplete']")
              private WebElement countryname;
              public void sendcountryname()
              {
            	  countryname.sendKeys("India");
              }
              
              // Dropdown Example
              private Select s;
           @FindBy(xpath="//select[@id='dropdown-class-example']")
           private WebElement dropdown;
           public void clickdropdrown()
           {
        	   dropdown.click(); 
        	   s = new Select(dropdown);
        	  // s.selectByIndex(0);
              s.selectByValue("option1");
        	 //  s.selectByVisibleText("Option3");
           }
           
           //Checkbox Example(1)
           @FindBy(xpath="//input[@id='checkBoxOption1']")
           private WebElement checkbox1;
           public void clickckheckbox1()
           {
        	   checkbox1.click();
           }
           //Checkbox Example(2)
           @FindBy(xpath="//input[@id='checkBoxOption2']")
           private WebElement checkbox2;
           public void clickckheckbox2()
           {
        	   checkbox2.click();
           }
           //Checkbox Example(3)
           @FindBy(xpath="//input[@id='checkBoxOption3']")
           private WebElement checkbox3;
           public void clickckheckbox3()
           {
        	   checkbox3.click();
           }
           
           //Switch Tab Example
           @FindBy(xpath="//a[@id='opentab']")
           private WebElement switchtab;
           public void clickSwitchTab()
           {
        	   switchtab.click();
           }
           
           // Switch To Alert Example
           Alert alert ;
           @FindBy(xpath="//input[@id='name']") 
           private WebElement switchtoAlertname;
           public void clickswitchtoAlertname()
           {
        	   switchtoAlertname.sendKeys("Mayuri.");
           }
           @FindBy(xpath="//input[@id='confirmbtn']") 
           private WebElement switchtoAlert;
           public void clickswitchtoAlert()
           {
        	   switchtoAlert.click();
        	   alert = driver.switchTo().alert();
        	   alert.accept();
           }
           
           //Web Table Example
           @FindBy(xpath="//table//tbody//tr//td")
           private List<WebElement> WebTable;
           public void getWebTable()
           {
        	int allcell  = WebTable.size();
        	  for(int i =0; i<allcell; i++)
        	  {
        		  System.out.println(WebTable.get(i).getText());
        	  }
           }
           /*
           // another way to get the data from web table
           @FindBy(xpath="//table//tbody//tr//td")
         private List<WebElement> WebTable;
         public void getWebTable()
         {
      	int allcell  = WebTable.size();
      	  for(int i =0; i<allcell; i++)
      	  {
      		  System.out.println(WebTable.get(i).getText());
      	  }
         }
           
         @FindBy(xpath="//table//tbody//tr//td")
         private List<WebElement> WebTable;
         public void getWebTable()
         {
      	int allcell  = WebTable.size();
      	  for(int i =0; i<allcell; i++)
      	  {
      		  System.out.println(WebTable.get(i).getText());
      	  }
         }
         */
           
           // Element Displayed Example
           @FindBy(xpath="//input[@id ='hide-textbox']")
           private WebElement elementhide;
           public void clickElementHide()
           {
        	   elementhide.isSelected();
           }
           @FindBy(xpath="//input[@id ='show-textbox']")
           private WebElement elementdisplayed;
           public void clickElementDisplayed()
           {
        	   elementdisplayed.isDisplayed();
           }
           
           // Mouse Hover Example
           Actions act;
           @FindBy(xpath="//button[@id ='mousehover']")
           private WebElement mouseHover;
           public void mouseHover()
           {
        	   act = new Actions(driver);
        	   act.moveToElement(mouseHover);       	   
           }
           
           @FindBy(xpath="//a[ text()='Top']")
           private WebElement mouseHoverTop;
           public void mouseHoverTop()
           {
        	  act.moveToElement(mouseHoverTop); 
        	  act.click().build().perform();
           }
           @FindBy(xpath="//div[@class='popup']")
           private WebElement popup;
           public void clickpopup()
           {
        	   popup.click();
           }
           //Auto Suggestive Dropdown Example
           @FindBy(xpath="//input[@list='mah-district']")
           private WebElement suggestivedropdown;
           public void clicksuggestivedropdown()
           {
        	   suggestivedropdown.click();
           }
           @FindBy(xpath="//option[text()='Akola']")
           private WebElement clickdropdownAkola;
           public void clickdropdownAkola()
           {
        	   clickdropdownAkola.click();
           }
           //Calendar Example
           @FindBy(xpath="//input[@type='date']")
           private WebElement Calendar;
           public void clickCalendar()
           {
        	   Calendar.click();
           }
           
              // constructor
         public VelocityPOMClasse1(WebDriver driver)
         {
        	    this.driver = driver;
        	    PageFactory.initElements(driver, this);
        	    
         }
}
  