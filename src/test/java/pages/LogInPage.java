package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogInPage {

    public LogInPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//*[@id=\"mms-app-root\"]/div[1]/div/header/div/div[2]/div[5]/button/span")
    public WebElement signInButton;


    @FindBy(xpath = "//*[@id=\"myaccount-dropdown-login-button\"]/span")
    public WebElement loginButton1;

    @FindBy(id = "email")
    public WebElement emailBox;


    @FindBy(xpath = "//*[@id=\"mms-login-form__login-button\"]/span")
    public WebElement logginButton2;

    @FindBy(xpath = "//*[@id=\"mms-app-root\"]/div[1]/div/header/div/div[2]/div[5]/button/span")
    public WebElement profileBox;



}
