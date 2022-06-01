package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class HomePagePOMClass
{
        // 6 products, click menu, logout button, card buttem, dropdown
	    
	private WebDriver driver;
	
	    // Menu Button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private  WebElement menubutton;

            public void clickMenuButtion()
      {
    	  menubutton.click();
      }
      
      // All Items
      @FindBy(xpath="//a[@id='inventory_sidebar_link']")
      private  WebElement allelement ;
        
   public void clickAllIteam()
        {
        	allelement.click();
        }
        
        //About
        @FindBy(xpath="//a[@id='about_sidebar_link']")
        private  WebElement aboutbutton;
                
          public void clickaboutButtion()
          {
        	  aboutbutton.click();
          }
          
          //Logout
          @FindBy(xpath="//a[@id='logout_sidebar_link']")
          private  WebElement logoutButton;
            
            // actions on element - method
            
            public void clicklogoutButtion()
            {
            	logoutButton.click();
            }
            
            //Name DropDown
            @FindBy(xpath="//select[@class='product_sort_container']")
            private  WebElement nameButton;
              
              public void clicklnameButtion()
              {
            	  Select s = new Select(nameButton);
            	  s.selectByVisibleText("Name (A to Z)");
              }
              //add to card product (1 product)
              @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
              private  WebElement addtocard;
                
                public void clickaddtocardButtion()
                {
                	addtocard.click();
                }
                
              //Twitter
                @FindBy(xpath="//a[text()='Twitter']")
                private  WebElement twitter;
                  
                  public void clicktwitterButtion1()
                  {
                	  twitter.click();
                  }
                //facebook
                  @FindBy(xpath="//a[text()='Facebook']")
                  private  WebElement facebooklink;
                    
                    public void clicktwiterButtion()
                    {
                    	facebooklink.click();
                    }
                  //linkedin
                    @FindBy(xpath="//a[text()='LinkedIn']")
                    private  WebElement linkedin;
                      
                      public void clicklinkedinButtion()
                      {
                    	  linkedin.click();
                      }
                      
                      // constructor
                      public HomePagePOMClass(WebDriver driver)
                      {
                    	  this.driver = driver;
                    	  PageFactory.initElements(driver, this);
                    	
                      }
                      
                      // single product element
                      
                      @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
                      private WebElement singleproduct;  // give name = bagbutton
                       
                      public void clicksingleproduct()
                      {
                    	  //String singleprduct = singleproduct.getText();
                    	  singleproduct.click();
                      }
                      
                      @FindBy(xpath="//a[@class='shopping_cart_link']")
                      private WebElement shopingcard;
                      public void clickshopingcard()
                      {
                    	  
                    	  shopingcard.click();
                      }
                      
                      // all product
                      @FindBy(xpath="//button[text()='Add to cart']")
                      private List<WebElement> allproduct;
                      public void addallproduct()
                      {
                    	  for(int i=0; i<allproduct.size(); i++)
                    	  {
                    		  allproduct.get(i).click();
                    	  }
                      }

                // card container
                @FindBy(xpath="//div[@id='shopping_cart_container']") 
                private WebElement addtocardbutton;
                public String getTextFrmCardButton()
                {
                	 String totalProducts = addtocardbutton.getText();
                	 return totalProducts;
                }
                
                
                   //dropdrown 
                private  Select s;
              
                //filter button
                @FindBy(xpath="//select[@class='product_sort_container']")
                private  WebElement clickfilter;
                  
                  // actions on element - method
                  
                  public void clickfilterbutton()
                  {
                	  clickfilter.click();
                	  s.selectByVisibleText("Name (A to Z)");
                  }




} 
