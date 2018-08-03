package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/java/features/DuplicateLead.feature"},
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
public class TestNGRunnerDL extends AbstractTestNGCucumberTests {
   
	


}





