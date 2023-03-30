package Helpers;

import Pages.MainPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Waiter {

    AndroidDriver ad;
    MainPage mainPage;
    public Waiter(AndroidDriver ad){
        PageFactory.initElements(ad, this);
        this.ad = ad;

    }

    public void clickAndWaitJs(WebElement element, String description) {
        System.out.println(description);
        JavascriptExecutor executor = (JavascriptExecutor) ad;
        executor.executeScript("arguments[0].click();", element);
    }

}
