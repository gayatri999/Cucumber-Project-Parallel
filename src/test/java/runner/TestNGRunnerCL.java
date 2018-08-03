package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/java/features/CreateLead.feature"},
			glue={"pages","hooks"},
			tags={"@Babu"},
			plugin= {"pretty","html:target/cucumber"}
			/*dryRun = false,
			strict = false,
			plugin={"pretty" ,
					"html:result",
					"json:result/cucumber.json" ,
					"junit:result/cucumber.xml"}*/

		)

       
@Test
public class TestNGRunnerCL extends AbstractTestNGCucumberTests {
	//DesiredCapabilities dc = new DesiredCapabilities();
	/*//dc.setBrowserName("chrome");
	//dc.setPlatform(Platform.WINDOWS);
	
	RemoteWebDriver driver = new RemoteWebDriver(
			new URL("http://192.168.1.8:4444/wd/hub"), dc);
	*/


}





