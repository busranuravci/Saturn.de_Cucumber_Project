package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {



    @Before
    public void setUp(){
        System.out.println("Test have started to run.");
    }





    @Before("@search1")
    public void setUp2() {
        System.out.println("Dyson searched on Saturn");
    }




    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","screenshot_" + scenario.getName());
        }

        Driver.closeDriver();
    }


}
