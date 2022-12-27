package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
 @CucumberOptions(
		 features = { "src/test/resources/features" },
		 plugin = { 
				 //"html:target/cucumber-reports",
				 //"json:target/cucumber.json",
				 //"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/reporter.html"
				  },
		 monochrome = true,			
		 glue = { "stepsDefinition" },
		 tags= "@carregarTodosResultados"
		)

public class RunnerTest {	
	
	@AfterClass
	public static void quitAPP() {
		DriverFactory.getDriver().quit();
	}
}
