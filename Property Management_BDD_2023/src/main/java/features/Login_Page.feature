@Login_Page_All_Scenarios
Feature: Property Management Super Admin Login Page Tests

  @Login_Without_Data_Driven @Demo
  Scenario: Dofiling login test scenario without data driven
  
    Given User is already on the Login Page
    Then Validate the Login Page display the 'Property Management System1' text
    #And Validate Login Details window with Your Email and Your Password text fields
    #And Select User Type dropdown with values 'Admin' 'Owner' 'Employee' 'Tenant' 'Super Admin'
    #And Select Language dropdown with default value populated with 'English'
    #And Forgot Password link
    #And Login button displayed
