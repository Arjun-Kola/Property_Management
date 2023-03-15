package com.qa.Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	 public static WebDriver driver;
	 public WebDriverWait ExplicitWait;
	 Properties properties = System.getProperties();
	 
	 
	
	 public void Take_Screenshot() throws Exception
	 {
		 File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
		 String workingDir = System.getProperty("user.dir");
		 File dest = new File(workingDir+"\\Screenshots\\" + filename);
		 FileUtils.copyFile(screen, dest);
		 
	 }
	 
	 
	 
	 
 	public WebDriver get_driver()
 	{
		 if(driver==null)
		 {
			 // WebDriver Manger code
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
			 
			 // ChromeDriver path
//				 System.setProperty("webdriver.chrome.driver","E:\\Selenium_Required Files\\Chrome_Driver\\chromedriver.exe");
//				 driver = new ChromeDriver();
			
			 
			 // Execute the scripts on already existing browser	 
			 
//			 System.setProperty("webdriver.chrome.driver", "E:\\Selenium_RequiredFiles\\ChromDriver\\chromedriver.exe");
//			 ChromeOptions options = new ChromeOptions();
//			 options.setExperimentalOption("debuggerAddress", "localhost:9014");
//			 driver = new ChromeDriver(options);	 
			  
		 }
		 
		 return driver;
		 		  
	 }
	
	 public WebDriverWait get_explicitWait()
	 {
		 if(ExplicitWait == null) {
			 ExplicitWait = new WebDriverWait(driver,10);
		 }
			
		 return ExplicitWait;
	 }
	 
	
	 public JavascriptExecutor ScrollDown_PageEnd()
	 {
	
		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
		 return  (JavascriptExecutor) javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	  		  
	 }
	 
	 
	 	public static void ExplicitWait(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		
		public static void WaitTillPageLoad()
		{
			JavascriptExecutor Js =  ((JavascriptExecutor) driver);
			Js.executeScript("return document.readyState").equals("complete");
		}
		
		public static void ThreadSleep(int TimeSeconds) throws Exception
		{
			Thread.sleep(TimeSeconds);
		}
		
		
		public static void WindowHandling()
		{
			String parent=driver.getWindowHandle();

			Set<String>s=driver.getWindowHandles();

			// Now iterate using Iterator
			Iterator<String> I1= s.iterator();

			while(I1.hasNext())
			{

				String child_window=I1.next();
			
			/*	if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
				}
			*/
		
				
			}
	 
		}
		
		public static String Gen_Randome_String() 
		{
			String generatedString = RandomStringUtils.randomAlphabetic(5);
		    System.out.println("Random String Generated: " + generatedString);
			return generatedString;	
		}
				
		public static void Dropdown_Select_ByVisibileText(WebElement element, String DDL_Value)
		{
			Select sel = new Select(element);
			sel.selectByVisibleText(DDL_Value);
		}
		
}
