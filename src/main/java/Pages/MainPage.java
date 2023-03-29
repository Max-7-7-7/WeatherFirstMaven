package Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    /**
     * Get MobileElement
     *
     * @return {@link <MobileElement>}
     */
    private final String mainPageTitle = "weather.widget.radar.storm.live.local.temperature.forecast:id/title";
    @FindBy(id = mainPageTitle)
    private MobileElement mainPageTitleHeader;
    public MobileElement getMainPageTitleHeader() {
        return mainPageTitleHeader;
    }

    private final String mainPageBackButton = "weather.widget.radar.storm.live.local.temperature.forecast:id/imgBackArrow";
    @FindBy(id = mainPageBackButton)
    private MobileElement mainPageBackButtonHeader;
    public MobileElement getMainPageBackButtonHeader() {
        return mainPageBackButtonHeader;
    }

    private final String mainPremButton = "weather.widget.radar.storm.live.local.temperature.forecast:id/noAds";
    @FindBy(id = mainPremButton)
    private MobileElement mainPremButtonHeader;
    public MobileElement getMainPremButtonHeader() {
        return mainPremButtonHeader;
    }

    private final String  dateWeek= "weather.widget.radar.storm.live.local.temperature.forecast:id/dateWeek";
    @FindBy(id = dateWeek)
    private MobileElement dateWeekHeader;
    public MobileElement getDateWeekHeader() {
        return dateWeekHeader;
    }

    private final String maxTemp = "weather.widget.radar.storm.live.local.temperature.forecast:id/txtMax";
    @FindBy(id = maxTemp)
    private MobileElement maxTempCirce;
    public MobileElement getMaxTempCirce() {
        return maxTempCirce;
    }

    private final String minTemp = "weather.widget.radar.storm.live.local.temperature.forecast:id/txtMin";
    @FindBy(id = minTemp)
    private MobileElement minTempCircle;
    public MobileElement getMinTempCircle() {
        return minTempCircle;
    }

    private final String fellLike = "weather.widget.radar.storm.live.local.temperature.forecast:id/feelsTxt";
    @FindBy(id = fellLike)
    private MobileElement fellLikeCirkle;
    public MobileElement getFellLikeCirkle() {
        return fellLikeCirkle;
    }
    private final String horoskop = "weather.widget.radar.storm.live.local.temperature.forecast:id/container_header";
    @FindBy(id = horoskop)
    private MobileElement horoskopMain;
    public MobileElement getHoroskopMain() {
        return horoskopMain;
    }
    private final String buttonMore = "weather.widget.radar.storm.live.local.temperature.forecast:id/image_next";
    @FindBy(id = buttonMore)
    private MobileElement buttonMoreMain;
    public MobileElement getButtonMoreMain() {
        return buttonMoreMain;
    }
    private final String changeZodiac = "weather.widget.radar.storm.live.local.temperature.forecast:id/text_change_zodiac";
    @FindBy(id = changeZodiac)
    private MobileElement changeZodiacMain;
    public MobileElement getChangeZodiacMain() {
        return changeZodiacMain;
    }

}
