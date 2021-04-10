import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features="src/test/java/features/PruebaTuya.feature", 
		glue={"stepsDefinition"},
		plugin = {"html:Reports/cucumber-html-report"}
	
		)

public class RunCucumberTest extends AbstractTestNGCucumberTests{

}
