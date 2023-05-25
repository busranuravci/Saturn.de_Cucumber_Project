package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogOutPage {

    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"mms-app-root\"]/div[1]/div/header/div/div[2]/div[5]/button/span")
    public WebElement profileBox;


    @FindBy(xpath = "//*[@id=\"mms-app-root\"]/div[1]/div/header/div/div[2]/div[5]/div/div/div/div/div/ul[3]/li/a/span[3]")
    public WebElement logOutButton;

}
