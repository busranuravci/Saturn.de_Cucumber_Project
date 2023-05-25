package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReusableMethods {


    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }






    //DropDown Index
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value
    public static void ddmValue(WebElement ddm, String option) {
        Select select = new Select(ddm);
        select.selectByValue(option);
    }

    //SwitchToWindow1
    public static void switchToWindow(int num) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(num));
    }




    //EXPLICIT WAIT METHODS

    //Visible Wait
    public static void visibleWait(WebElement element, int num) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(num));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    //VisibleElementLocator Wait
    public static WebElement visibleWait(By locator, int num) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(num));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }




    public static void allPageSS() {
        String date = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String filePath = "TestOutput/screenshot/screenshot" + date + ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //WebElement ScreenShot
    public static void webElementSS(WebElement element) {
        String date = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String filePath = "TestOutput/screenshot/webElementScreenshot" + date + ".png";

        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    //WebTable
    public static void printData(int row, int column) {
        WebElement rowColumn = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + row + "]//td[" + column + "]"));
        System.out.println(rowColumn.getText());
    }


    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void JSscroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS end  Scroll
    public static void JSscrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS  home Scroll
    public static void JSscrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }




}