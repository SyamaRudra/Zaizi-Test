package testRunner;


	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	public class zaiziRunner {
	
	@RunWith (Cucumber.class)
	@CucumberOptions (
				features = {"src/test/java/featureFiles/"},				//path of feature file
				glue = {"stepFiles"},
				monochrome = true,
				plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", 
						"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" })
	
	public class MainRunner {
		
	}
	}
	