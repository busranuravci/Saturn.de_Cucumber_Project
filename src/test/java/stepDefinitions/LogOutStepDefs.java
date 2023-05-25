package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LogOutPage;

public class LogOutStepDefs {

    LogOutPage logOutPage;

    @Then("user click profile box")
    public void userClickProfileBox() {
        logOutPage = new LogOutPage();
        logOutPage.profileBox.click();
    }


    @And("user click logout button")
    public void userClickLogoutButton() {
        logOutPage = new LogOutPage();
        logOutPage.logOutButton.submit();
    }
}
