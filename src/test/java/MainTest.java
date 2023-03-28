import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.Assert.assertTrue;


public class MainTest {
    AndroidDriver ad;
    public MainTest() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "weather.widget.radar.storm.live.local.temperature.forecast");
        cap.setCapability("appActivity", "weather.widget.radar.storm.live.local.temperature.forecast.main.MainActivity");
        cap.setCapability("noReset", true);

        AndroidDriver ad = new AndroidDriver(new URL("https://0.0.0.0:4723/wd/hub"), cap);

        }

    private final String mainPageTitle = "weather.widget.radar.storm.live.local.temperature.forecast:id/title";
    @FindBy(id = mainPageTitle)
    private WebElement mainPageTitleHeader;
    public WebElement getMainPageTitleHeader(){
        return mainPageTitleHeader;
    }


        @Test
        public void firsTest(){
            assertTrue(getMainPageTitleHeader().isDisplayed());
        }

}
