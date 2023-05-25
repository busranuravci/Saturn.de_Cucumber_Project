package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SearchStepDefs {

    SearchPage searchPage;


    @Then("user search {string} on search box")
    public void userSearchOnSearchBox(String product) {
        searchPage = new SearchPage();
        searchPage.searchBox.sendKeys(product,Keys.ENTER);
    }


    @And("user click first dyson's picture")
    public void userClickFirstDysonSPicture() {
        searchPage = new SearchPage();
        searchPage.firstProductDyson.click();
    }


    @And("user checks dyson price")
    public void userChecksDysonPrice() {
        searchPage = new SearchPage();
        Assert.assertTrue(searchPage.dysonPrice.isDisplayed());
    }

    @And("user click add cart button")
    public void userClickAddCartButton() {
        searchPage = new SearchPage();
        searchPage.addCartButton.click();
    }

    @And("user dismiss first offer")
    public void userDismissFirstOffer() {
        searchPage = new SearchPage();
        searchPage.dismissOffer.click();
    }

    @And("user dismiss second offer")
    public void userDismissSecondOffer() {
        searchPage = new SearchPage();
        searchPage.dismissOffer2.click();
    }

    @And("user click first iphone's picture")
    public void userClickFirstIphoneSPicture() {
        searchPage = new SearchPage();
        searchPage.secondProductIphone.click();
    }

    @And("user checks iphone price")
    public void userChecksIphonePrice() {
        searchPage = new SearchPage();
        Assert.assertTrue(searchPage.iphonePrice.isDisplayed());
    }

    @And("user click check out button")
    public void userClickCheckOutButton() {
        searchPage.goToCartButton.click();
    }

    @And("user check total price")
    public void userCheckTotalPrice() {
        searchPage = new SearchPage();
        Assert.assertTrue(searchPage.totalPrice.isDisplayed());
    }

    @When("user dismiss all cookies")
    public void userDismissAllCookies() {
        ReusableMethods.alertDismiss();

    }
}
