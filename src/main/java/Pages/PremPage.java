package Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class PremPage {
    private final String closeButtonPrem = "weather.widget.radar.storm.live.local.temperature.forecast:id/imgClose";
    @FindBy(id = closeButtonPrem)
    private MobileElement closeButtonPremC;
    public MobileElement getCloseButtonPremC() {
        return closeButtonPremC;
    }
    private final String textPremiumVersion = "weather.widget.radar.storm.live.local.temperature.forecast:id/textView3";
    @FindBy(id = textPremiumVersion)
    private MobileElement textPremiumVersionEn;
    public MobileElement getTextPremiumVersionEn() {
        return textPremiumVersionEn;
    }
    private final String textRemoveADS = "weather.widget.radar.storm.live.local.temperature.forecast:id/textView";
    @FindBy(id = textRemoveADS)
    private MobileElement textRemoveADSEn;
    public MobileElement getTextRemoveADSEn() {
        return textRemoveADSEn;
    }
    private final String textSupport = "weather.widget.radar.storm.live.local.temperature.forecast:id/textView8";
    @FindBy(id = textSupport)
    private MobileElement textSupportEn;
    public MobileElement getTextSupportEn() {
        return textSupportEn;
    }
    private final String textUnblockAllWidgets = "weather.widget.radar.storm.live.local.temperature.forecast:id/textView12";
    @FindBy(id = textUnblockAllWidgets)
    private MobileElement textUnblockAllWidgetsEn;
    public MobileElement getTextUnblockAllWidgetsEn() {
        return textUnblockAllWidgetsEn;
    }
    private final String textOnePay = "weather.widget.radar.storm.live.local.temperature.forecast:id/textView4";
    @FindBy(id = textOnePay)
    private MobileElement textOnePayEn;
    public MobileElement getTextOnePayEn() {
        return textOnePayEn;
    }
    private final String buttonRestorePurchases = "weather.widget.radar.storm.live.local.temperature.forecast:id/tvRestore";
    @FindBy(id = buttonRestorePurchases)
    private MobileElement buttonRestorePurchasesEn;
    public MobileElement getButtonRestorePurchasesEn() {
        return buttonRestorePurchasesEn;
    }
    private final String textOneTimePayment = "weather.widget.radar.storm.live.local.temperature.forecast:id/textView6";
    @FindBy(id = textOneTimePayment)
    private MobileElement textOneTimePaymentEn;
    public MobileElement getTextOneTimePaymentEn() {
        return textOneTimePaymentEn;
    }



}
