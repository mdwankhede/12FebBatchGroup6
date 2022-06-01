package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class MethodOfScreenShot 
{
	 public static void screenshotmethod(WebDriver driver) throws IOException
     {
     	Date d = new Date();
     	DateFormat d1 = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
     	String date = d1.format(d);
     	
     	TakesScreenshot ts = (TakesScreenshot)driver;
     	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
     //	File DestiFile = new File("D:\\ScreenShot1\\PP1.jpg");
     	 File DestiFile = new File("D:\\ScreenShot1\\PP"+date+".jpg");
     	FileHandler.copy(sourceFile, DestiFile);
     }
}
