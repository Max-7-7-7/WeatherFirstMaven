import Helpers.Waiter;
import Pages.MainPage;
import Pages.PremPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;


public class MainTest {

    MainPage mainPage;
    static AndroidDriver ad;
    Waiter wait;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability("appPackage", "weather.widget.radar.storm.live.local.temperature.forecast");
        cap.setCapability("appActivity", "weather.widget.radar.storm.live.local.temperature.forecast.main.MainActivity");
        cap.setCapability("noReset", true);
        cap.setCapability("app", new File("APK/WeatherFlow1.0.8.apk").getAbsolutePath());

        ad = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), cap);

    }
    
    @Test
    public void firsTest() {

        new MainPage(ad)
                .getText();
        assertTrue(mainPage.getText().equals(""));
    }



}
