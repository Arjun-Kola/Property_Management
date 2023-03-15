package com.qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage_Actions extends Base_Class {

	
	 WebDriver driver;
	
	 public LoginPage_Actions()
	 {
		 this.driver = Base_Class.driver;
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	
	 @FindBy(xpath = "/html/body/div/div[1]/div")
	 WebElement HeadText;
	 
	 @FindBy(xpath = "//*[@id=\"username\"]")
	 WebElement YourEmail; 
	 
	 @FindBy(xpath = "//*[@id=\"password\"]")
	 WebElement YourPwd;
	 
	 @FindBy(xpath = "//*[@id=\"ddlLoginType\"]")
	 WebElement SelectUserType;
	 
	 @FindBy(xpath = "//*[@id=\"ddlLanguage\"]")
	 WebElement Language;
	 
	 
	
	 public void user_is_already_on_the_login_page() 
	 {
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.get("https://micasas.in/");
		 WaitTillPageLoad();	 
	 }
	 

	 public void validate_the_login_page_display_the_text(String PageHeading) {
	    
		 String  Actual_Text= HeadText.getText();
		 String Expected_Text = PageHeading;

		 Assert.assertEquals(Actual_Text, Expected_Text);
	 }
	 
	 
	 public void enter_login_details_window_with_your_email_and_your_password_text_fields() 
	 {
	  
	 }
	 
	 
	 public void select_user_type_dropdown_with_values(String string, String string2, String string3, String string4, String string5) {
	     
		 
	 }
	 
	 
	 public void select_language_dropdown_with_default_value_populated_with(String string) 
	 {
	     
	 }
	 
	 @Then("Forgot Password link")
	 public void forgot_password_link() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 
	 @Then("Login button displayed")
	 public void login_button_displayed() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 
}
