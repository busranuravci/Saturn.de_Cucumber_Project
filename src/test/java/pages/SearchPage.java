package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "search-form")
    public WebElement searchBox;


    @FindBy(xpath = "//*[@id=\"product-grid-4yH4HIweBvtQ6lWTgmV4Xd\"]/div[2]/div[1]/div[1]/a/div/div/div/div[4]")
    public WebElement firstProductDyson;


    @FindBy(xpath = "//*[@id=\"StyledPdpWrapper\"]/div[1]/div/div[4]/div[1]/div[1]/div/div/div/div[2]/span")
    public WebElement dysonPrice;


    @FindBy(xpath = "//*[@id=\"pdp-add-to-cart-button\"]/span[2]")
    public WebElement addCartButton;


    @FindBy(xpath = "//*[@id=\"main-content\"]/div[5]/div[4]/button[1]/span")
    public WebElement dismissOffer;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[5]/div[4]/button[1]/span")
    public WebElement dismissOffer2;


    @FindBy(xpath = "//*[@id=\"mms-search-srp-productlist\"]/div[1]/div/div[1]/div[2]")
    public WebElement secondProductIphone;

    @FindBy(xpath = "//*[@id=\"StyledPdpWrapper\"]/div[1]/div/div[4]/div[1]/div[1]/div/div/div/div[2]/span/font[2]/font")
    public WebElement iphonePrice;


    @FindBy(xpath = "//*[@id=\"main-content\"]/div[5]/div[4]/button[2]/span")
    public WebElement goToCartButton;


    @FindBy(xpath = "//*[@id=\"totalPriceWrapper\"]/div/h3/span")
    public WebElement totalPrice;


    @FindBy(xpath = "//*[@id=\"pwa-consent-layer-form\"]/div[2]/button[1]/span")
    public WebElement cookies;

}
