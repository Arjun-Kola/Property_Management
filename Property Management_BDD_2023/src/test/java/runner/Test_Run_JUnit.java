package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "classpath:features",
//		glue={"step_definitions"}, //the path of the step definition files
//		format = {"pretty","html:test-output/", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting 
//		monochrome = true, //display the console output in a proper readable format
//		strict = true, //it will check if any step is not defined in step definition file
//		dryRun = false, //to check the mapping is proper between feature file and step def file
//		tags  = {"@Login_Without_Data_Driven"}
		
		// Examples: 	tags = {"@SmokeTest" , "@RegressionTest", "@End2End"}
	
		)

public class Test_Run_JUnit{
 
}
