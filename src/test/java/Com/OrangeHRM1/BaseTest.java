package Com.OrangeHRM1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();
    @BeforeMethod
    public void openBrowser(){
        browserSelector.browserSelection();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(loadProp.getproperty("url"));
       // driver.manage().deleteAllCookies();
    }
    @AfterMethod
    public void closeBrowser(){
       driver.quit();
    }

}
