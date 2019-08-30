package Com.OrangeHRM1;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DesireCaps extends Utils {
    LoadProp loadProp = new LoadProp();
    String platfromName = loadProp.getproperty("platformName");
    String browserVersion = loadProp.getproperty("browserVersion");

    //sauceLabs code
    public static final String USERNAME="rushitalimbasiya";
    public static final String ACCESS_KEY="fb9130b4-525d-491c-bcf2-781448892604";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";

    public void sauceLabChromeBrowser()
    {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform",platfromName);
        caps.setCapability("version",browserVersion);
        try {
                driver=new RemoteWebDriver(new URL(URL),caps);
            } catch (MalformedURLException e)
        {
                e.printStackTrace();
            }
        }
    }

