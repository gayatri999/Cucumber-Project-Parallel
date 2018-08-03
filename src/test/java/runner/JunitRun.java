package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/java/features/CLtestcase.feature"},
      // glue= {"steps"},monochrome= true
			glue={"steps"},monochrome= true
			//tags={"@Babu"}
			//dryRun = false,
			//strict = false,
			/*plugin={"pretty" ,
					"html:result",
					"json:result/cucumber.json" ,
					"junit:result/cucumber.xml"}*/

		)

public class JunitRun {
   
	


}





