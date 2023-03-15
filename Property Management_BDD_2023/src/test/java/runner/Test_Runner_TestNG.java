package runner;	

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @RunWith(Cucumber.class)
@CucumberOptions(
		
	//	features = "E:\\TruVisory\\Automation Projects\\Property Management\\Property_Management_WorkSpace\\Property Management_BDD_2023\\src\\main\\java\\features",
	//	glue={"step_definitions"}, //the path of the step definition files
	//	format = {"pretty","html:test-output/", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting 
	//	monochrome = true, //display the console output in a proper readable format
	//	strict = true, //it will check if any step is not defined in step definition file
	//	dryRun = false, //to check the mapping is proper between feature file and step def file
	//	tags  = {"@Login_Without_Data_Driven"}
		
		// Examples: 	tags = {"@SmokeTest" , "@RegressionTest", "@End2End"}
		// Hello Arjun This is test comments added for AzureDevOps testing
		// Branch Comment Added To push the code
		)

public class Test_Runner_TestNG extends AbstractTestNGCucumberTests {

}