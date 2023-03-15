package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
	//	format={"pretty","json:path/to/json_repot.json"},
        features = "src/main/java/features",
        glue="step_definitions",
        tags="@Login_Without_Data_Driven"
      )

public class Test_Runner_TestNG_001 extends AbstractTestNGCucumberTests {
	
}
