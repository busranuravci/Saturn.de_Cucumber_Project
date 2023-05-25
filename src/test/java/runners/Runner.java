package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty","html:src/test/resources/features/reports/hookTest.html"},
                 features = "src/test/resources/features/US003_SearchProducts.feature",
                 glue = {"stepDefinitions/SearchStepDefs"},
                 tags= "@search1",
                 dryRun = false)





public class Runner {
}
