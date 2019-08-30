package Com.OrangeHRM1;

import org.openqa.selenium.By;

public class SystmUsersPage extends Utils {
    LoadProp loadProp= new LoadProp();
    private static By _clickOnAdminTeb= By.cssSelector("#menu_admin_viewAdminModule>b");//click on admin teb
    private static By _clickOnAddButton= By.xpath("//input[@id='btnAdd']");//click on add button
    private static By _inputUserName2 = By.xpath("//input[@id='searchSystemUser_userName']");//input user name
    private static By _clickOnSearchButton = By.cssSelector("#searchBtn");//click on search button
    private static By _clickOnWelcomeAdmin = By.xpath("//a[@id='welcome']");//click on welcome admin button
    private static By _clickOnLoginButton = By.xpath("//a[@href='/index.php/auth/logout']");//click on long in button

    public void clickOnAdminTebClickOnAddButton_Method()
    {
        clickOnElement(_clickOnAdminTeb);
        clickOnElement(_clickOnAddButton);
    }
    public void inputUserName2_Method(String name){
        sendKeyMethod(_inputUserName2,name);

    }
    public void clickOnSearch_Method()
    {
        clickOnElement(_clickOnSearchButton);

    }
    public void clickOnWelcomeAdminAndLoginButton_Method(){
        clickOnElement(_clickOnWelcomeAdmin);
        clickOnElement(_clickOnLoginButton);
    }
}
