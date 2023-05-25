package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:src/test/resources/features/reports/hookTest.html",
                                     "json:src/test/resources/features/reports/hookTest.json",
                                     "junit:src/test/resources/features/reports/hookTest.xml"},
                  features = "src/test/resources/features/US001_Login.feature",
                  glue = {"stepDefinitions/LoginStepDefs"},
                  tags = "@hooktest",
                  dryRun = false)


public class HooksRunner {
}
