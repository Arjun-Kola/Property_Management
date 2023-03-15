package step_definitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.Base.Base_Class;
import com.qa.Pages.LoginPage_Actions;

import PageFactory.Object_Repository;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Page_Step_Def extends Base_Class{

	 WebDriver driver;
	 WebDriverWait wait;
	 Object_Repository repo;
	 LoginPage_Actions LoginPageActions;
	 
 
	 @Before
	 public void before_Scenario()
	 {
		 driver 		= get_driver();
		 wait 			= get_explicitWait();
		 repo 			= new Object_Repository();
		 LoginPageActions = new LoginPage_Actions();
	 }
	 
	 

	 
	 @And("^close the browser$")
	 public void close_the_browser()
	 {
		 driver.close();
		 super.driver = null;
		 super.ExplicitWait = null;
	 }
	 
	 
	 
	 @Given("User is already on the Login Page")
	 public void user_is_already_on_the_login_page() 
	 { 
		 LoginPageActions.user_is_already_on_the_login_page();
	 }
	 
	 @Then("Validate the Login Page display the {string} text")
	 public void validate_the_login_page_display_the_text(String PageHeading) {
	    
		 LoginPageActions.validate_the_login_page_display_the_text(PageHeading);
	 }
	 
	 
	 @Then("Validate Login Details window with Your Email and Your Password text fields")
	 public void Validate_login_details_window_with_your_email_and_your_password_text_fields() {
	   
		 
	 }
	 
	 @Then("Select User Type dropdown with values {string} {string} {string} {string} {string}")
	 public void select_user_type_dropdown_with_values(String string, String string2, String string3, String string4, String string5) 
	 {
	    
		 
	 }
	 
	 @Then("Select Language dropdown with default value populated with {string}")
	 public void select_language_dropdown_with_default_value_populated_with(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 
	 @Then("Forgot Password link")
	 public void forgot_password_link() 
	 {
	    
	 }
	 
	 @Then("Login button displayed")
	 public void login_button_displayed() 
	 {
	    
	 }
	 
 
	 
	 
	 
	 
//	 
//	 @Given("^Admin is already on Login Page$")
//	 public void user_is_already_on_login_page(){
//	 
//	 driver.manage().window().maximize();
//	 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/");
//	 
//	 //Code will wait till the page is loaded
//	 	WaitTillPageLoad();
//	 
//	 }
	 
//	 @Given("^Law Sub Admin is already on Login Page$")
//	 public void Law_SA_is_already_on_login_page(){
//	 
//	 driver.manage().window().maximize();
//	 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/");
//	 
//	 //Code will wait till the page is loaded
//	 	WaitTillPageLoad();
//	 
//	 }
//	 
//	 
//	 
//	 
//	 @When("^Admin is on Login Page$")
//	 public void user1_is_already_on_login_page(){
//	 
//	 driver.manage().window().maximize();
//	 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/");
//	 
//	 //Code will wait till the page is loaded
//	 	WaitTillPageLoad();
//	 
//	 }
//	
//	 @When("^title of login page is Login$")
//	 public void title_of_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 
//	 @Then("^Admin enters \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Username = driver.findElement(By.xpath(repo.UserName));
//		 Username.sendKeys(UName);
//		 
//		 WebElement Password = driver.findElement(By.xpath(repo.Password));
//		 Password.sendKeys(Pwd);
//		
//		 
//	 }
//	 
//	 @Then("^Law Sub Admin enters \"(.*)\" and \"(.*)\"$")
//	 public void Law_SA_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Law_SA_Username = driver.findElement(By.xpath(repo.UserName));
//		 Law_SA_Username.sendKeys(UName);
//		 
//		 WebElement Law_SA_Password = driver.findElement(By.xpath(repo.Password));
//		 Law_SA_Password.sendKeys(Pwd);
//		
//		 
//	 }
//	
//	 @And("^Law Sub Admin clicks on login button$")
//	 public void Law_SA_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
//	 	@Then("^Admin enters username and password$") 
//		 public void user_enters_username_and_password()
//		 {
//			 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//				
//			 Username1.sendKeys("Arjun");
//			 
//			 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//			 
//			 Password1.sendKeys("Arjun123");
//		 }
//	
//	 
//	 @Then("^Admin enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void user_enters_username_and_password_as_null_values(String Username, String Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//		 Username1.sendKeys(Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		 Password1.sendKeys(Password);
//	 }
//	 
//	
//	 @And("^Admin clicks on login button$")
//	 public void user_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
//	 
//	 @Then("^validate Admin is on homepage$")
//	 public void validate_user_is_on_Create_post_page()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Creat_post = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Creat_post, "lawfront");
//	 }
//	 
//	 @Then("^validate Admin is not logged in due to missing login creadentilas$")
//	 public void user_is_not_logged_in_due_to_missing_login_creadentilas()
//		{
//			wait.until(ExpectedConditions.titleIs("Login"));
//			String Title_Creat_post = driver.getTitle();
//			Assert.assertEquals(Title_Creat_post, "Login");
//			
//		}
//	 
//
//	 @Then("^logout from the application$")
//	 public void logout_from_the_application() throws Exception{
//		 
//		 ThreadSleep(10000);
//	
//		// Actions action =  new Actions(driver);
//		
//		 WebElement SignOut_Option = driver.findElement(By.xpath(repo.SignOut));
//	
//		 try {
//			 SignOut_Option.click();
//		  } catch (Exception e) {
//		     JavascriptExecutor executor = (JavascriptExecutor) driver;
//		     executor.executeScript("arguments[0].click();",SignOut_Option);
//		  }
//	/*	 
//	//	 wait.until(ExpectedConditions.elementToBeClickable(SignOut_Option));
//	//	 action.moveToElement(SignOut_Option).build().perform();
//		 SignOut_Option.clear();
//	*/	 
//		 WebElement LogOut_Btn = driver.findElement(By.xpath(repo.Logout_btn));
//		 wait.until(ExpectedConditions.elementToBeClickable(LogOut_Btn));
//		 LogOut_Btn.click();
//		 
//		 ThreadSleep(5000);
//		 
//		 WebElement Confirm_Logout = driver.findElement(By.xpath(repo.LogOut_Confirm));
//	//	 wait.until(ExpectedConditions.elementToBeClickable(Confirm_Logout));
//		
//		 
//		 	String parent=driver.getWindowHandle();
//
//			Set<String>s=driver.getWindowHandles();
//
//			// Now iterate using Iterator
//			Iterator<String> I1= s.iterator();
//
//			while(I1.hasNext())
//			{
//				System.out.println("Step 1");
//				String child_window=I1.next();
//			
//				if(!parent.equals(child_window))
//				{
//					System.out.println("Step 2");
//					driver.switchTo().window(child_window);
//					if(Confirm_Logout.isDisplayed())
//					{
//						System.out.println("Step 3");
//						Confirm_Logout.click();
//						break;
//					}
//				}	
//			}
//	 }
//	 //==============================Client Login==============================//
//	 @Given("^Client Is On Login Page$")
//	 public void User_Is_On_Client_Login_Page(){
//	 
//	 driver.manage().window().maximize();
//		 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/client");
//	 
//	 } 
//	 
//	 @When("^Client is on login page$")
//	 public void User_Is_On_Client1_Login_Page(){
//	 
//	 driver.manage().window().maximize();
//		 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/client");
//	 
//	 } 
//	 
//	 @Then("^Client enters \"(.*)\" and \"(.*)\"$")
//	 public void Client_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Client_Username = driver.findElement(By.xpath("//input[@name = 'email']"));
//		 Client_Username.sendKeys(UName);
//		 
//		 WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
//		 Password.sendKeys(Pwd);
//	 
//	 
//	 }
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	 @Then("^Client enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void Client_enters_username_and_password_as_null_values(String Client_Username, String Client_Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[@name = 'email']"));
//		 Username1.sendKeys(Client_Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[@name = 'password']"));
//		 Password1.sendKeys(Client_Password);
//	 }
//	 
//	 @When("^title of client login page is Login$")
//	 public void title_of_Client_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 @Then("^Client enters Username And Password$")
//	 public void Client_user_enters_username_and_Password()
//	 {
//		 WebElement Username2 = driver.findElement(By.xpath("//input[@name = 'email']"));
//		 Username2.sendKeys("clientadmin");
//		 
//		 WebElement Password2 = driver.findElement(By.xpath("//input[@name = 'password']"));
//		 Password2.sendKeys("lawoffice@123");
//	 }
//	 
//	 @And("^Client clicks on login button$")
//	 public void Client_user_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath("//button[contains(text(),\"Sign In\")]"));
//		 SignIn.click();
//		 WaitTillPageLoad();
//	 }
//	 
//	
//	 
//	 @Then("^Client logout from the application$")
//	 public void Client_logout_from_the_application() throws Exception{
//		 
//		 ThreadSleep(10000);
//	
//		// Actions action =  new Actions(driver);
//		
//		 WebElement SignOut_Option = driver.findElement(By.xpath("//*[@id=\"user-dropdown\"]/span"));
//	
//		 try {
//			 SignOut_Option.click();
//		  } catch (Exception e) {
//		     JavascriptExecutor executor = (JavascriptExecutor) driver;
//		     executor.executeScript("arguments[0].click();",SignOut_Option);
//		  }
//	/*	 
//	//	 wait.until(ExpectedConditions.elementToBeClickable(SignOut_Option));
//	//	 action.moveToElement(SignOut_Option).build().perform();
//		 SignOut_Option.clear();
//	*/	 
//		 ThreadSleep(5000);
//		 WebElement LogOut_Btn = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/div[3]/div/div/button"));
//		 wait.until(ExpectedConditions.elementToBeClickable(LogOut_Btn));
//		 LogOut_Btn.click();
//		 
//		 ThreadSleep(5000);
//		 
//		 WebElement Confirm_Logout = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[3]/button[2]"));
//	//	 wait.until(ExpectedConditions.elementToBeClickable(Confirm_Logout));
//		
//		 
//		 	String parent=driver.getWindowHandle();
//
//			Set<String>s=driver.getWindowHandles();
//
//			// Now iterate using Iterator
//			Iterator<String> I1= s.iterator();
//
//			while(I1.hasNext())
//			{
//				System.out.println("Step 1");
//				String child_window=I1.next();
//			
//				if(!parent.equals(child_window))
//				{
//					System.out.println("Step 2");
//					driver.switchTo().window(child_window);
//					if(Confirm_Logout.isDisplayed())
//					{
//						System.out.println("Step 3");
//						Confirm_Logout.click();
//						break;
//					}
//				}	
//			}
//	 }
//	//============================Law Sub Admin Login======================//
//	 
//	 
//	 @When("^title of subadmin login page is Login$")
//	 public void title_of_Subadmin_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 
//	/* @Then("^Sub Admin enters \"(.*)\" and \"(.*)\"$")
//	 public void Sub_Amin_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Law_SA_Username = driver.findElement(By.xpath(repo.UserName));
//		 Law_SA_Username.sendKeys(UName);
//		 
//		 WebElement Law_SA_Password = driver.findElement(By.xpath(repo.Password));
//		 Law_SA_Password.sendKeys(Pwd);
//		
//		 
//	 }*/
//	
//	 
//	
//	 
//	 @Then("^Sub Admin enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void Sub_admin_enters_username_and_password_as_null_values(String Subadmin_Username, String Subadmin_Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//		 Username1.sendKeys(Subadmin_Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		 Password1.sendKeys(Subadmin_Password);
//	 }
//	 
//	
//	 @And("^Sub Admin clicks on login button$")
//	 public void Subadmin_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
//	 
//	 
//	 
//
//	 @When("^title of TeamMember login page is Login$")
//	 public void title_of_TeamMember_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 
//	 @Then("^TeamMember enters \"(.*)\" and \"(.*)\"$")
//	 public void TeamMember_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Client_Username = driver.findElement(By.xpath(repo.UserName));
//		 Client_Username.sendKeys(UName);
//		 
//		 WebElement Client_Password = driver.findElement(By.xpath(repo.Password));
//		 Client_Password.sendKeys(Pwd);
//		
//		 
//	 }
//	
//	 
//	//=============Law Team Member Login===========================//
//	 
//	 @Then("^TeamMember enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void TeamMember_enters_username_and_password_as_null_values(String TeamMember_Username, String TeamMember_Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//		 Username1.sendKeys(TeamMember_Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		 Password1.sendKeys(TeamMember_Password);
//	 }
//	 
//	
//	 @And("^Team member clicks on login button$")
//	 public void TeamMember_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
	 
}
