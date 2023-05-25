package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LogInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepDefs {

    LogInPage loginPage;

    @Given("user go to {string} website")
    public void userGoToWebsite (String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @Then("user click sign in button")
    public void userClickSignInButton() {
        loginPage = new LogInPage();
        loginPage.signInButton.click();
    }


    @And("user wait {int} seconds")
    public void userWaitSeconds(int second) {
        ReusableMethods.wait(second);
    }


    @And("user click first login button")
    public void userClickFirstLoginButton() {
        loginPage = new LogInPage();
        loginPage.loginButton1.click();
    }


    @And("user logs in with the given information {string},{string}")
    public void userLogsInWithTheGivenInformation(String email, String password) {
        loginPage = new LogInPage();
        loginPage.emailBox.sendKeys(email, Keys.TAB,password);
    }

    @And("user click second login button")
    public void userClickSecondLoginButton() {
        loginPage = new LogInPage();
        loginPage.logginButton2.click();
    }


    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }

    @And("user verifies successful login")
    public void userVerifiesSuccessfulLogin() {
        loginPage = new LogInPage();
        Assert.assertTrue(loginPage.profileBox.isDisplayed());
    }

}
