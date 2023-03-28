//package Helpers;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeClass;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
//import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
//import static io.appium.java_client.remote.MobileCapabilityType.*;
//import static io.appium.java_client.service.local.AppiumDriverLocalService.buildService;
//import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;
//
//public class Capability {
//
//    private static AndroidDriver<MobileElement> driver;
//    File app = new File("C:\\Users\\user\\Desktop\\WeatherFirstMaven\\APK");
//    String deviceName = "c421c93c9905";
//    AppiumDriverLocalService service;
//
//    @BeforeClass
//    public void precondition(){
//       service = buildService(new AppiumServiceBuilder().usingAnyFreePort());
//       service.start();
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(DEVICE_NAME, deviceName);
//        capabilities.setCapability(APP, app.getAbsolutePath());
//        capabilities.setCapability(PLATFORM_NAME, "Android");
//        capabilities.setCapability(APP_PACKAGE, "alerts.climate.widget.radar.forecast.live.local.weather");
//        capabilities.setCapability(APP_ACTIVITY, "alerts.climate.widget.radar.forecast.live.local.weather.main.MainActivity");
//
//        capabilities.setCapability(FULL_RESET, false);
//        capabilities.setCapability(CLEAR_SYSTEM_FILES, false);
//        capabilities.setCapability(NO_RESET, true);
//        capabilities.setCapability(NEW_COMMAND_TIMEOUT, 600);
//
//        driver = new AndroidDriver<>(service.getUrl(), capabilities);
//        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
//    }
//
//
//
//
//
//
//
//
//}
