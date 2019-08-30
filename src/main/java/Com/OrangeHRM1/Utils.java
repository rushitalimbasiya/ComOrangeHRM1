package Com.OrangeHRM1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //click Method
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //clear Method
    public static void clearOnElement(By by){
        driver.findElement(by).clear();
    }
    //sendKey Method
    public static void sendKeyMethod(By by,String sendkey){
        driver.findElement(by).sendKeys(sendkey);
    }
    //assertEqual Method
    public static void assertEqualsMethod(By by,String expectedResult  ){
    }
    //getText Method
    public static String getTextMethod(By by)
    {
        return driver.findElement(by).getText();
    }
    //for selectDropdownByValue for TestNG
    public static void selectByValueMethod(By by, String value)
    {
        Select sc = new Select(driver.findElement(by));
        sc.selectByValue(value);
    }
    //for selectDropdownByIndex TestNG
    public static void selectByIndexMethod(By by,int index){
        Select sc = new Select(driver.findElement(by));
        sc.selectByIndex(index);
    }
    //for selectDropdownByVisibleText TestNG
    public static void selectByVisibleTextMethod(By by,String visibleText )
    {
        Select sc = new Select(driver.findElement(by));
        sc.selectByVisibleText(visibleText);
    }
    //for DateStamp Method
    public static String GetCurrentDateStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(
                "ddmmss");// dete ,min,second
        Date today = new Date();
        String strDate = sdfDate.format(today);
        return strDate;
    }
    // Assert TestNG - Reusing Get Text Method
    public static void assertEqualMethod(By by, String expectedResult) {
        Assert.assertEquals(getTextMethod(by), expectedResult);
    }

    //for moveover
    public static void moveOverMethod(By by) {
        Actions actions = new Actions(driver);
        WebElement web = driver.findElement(by);
        actions.moveToElement(web).build().perform();
    }
    //for enter Key
    public static void enterKeyMethod(By by){
        driver.findElement(by).sendKeys(Keys.ENTER);
    }
    }







