package Com.OrangeHRM1;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    private static By _inputUsername=By.xpath("//div[@id='divUsername']/input");//input Username admin
    private static By _inputPassword=By.xpath("//div[@id='divPassword']/input");//input Password admin123
    private static By _clickOnLoginButton=By.xpath("//div[@id='divLoginButton']/input");//click on log in button
    private static By _inputCreatedUserNme=By.xpath("//input[@id='txtUsername']");//input username
    private static By _inputpasswordForLogIn=By.xpath("//input[@id='txtPassword']");//input password
    private static By _clickOnLonginButton2=By.xpath("//input[@id='btnLogin']");//click on login button

    public void inputUserinputPassclickLoginbutton_Method()//input Username admin,input Password admin123 andclick on log in button
    {
        sendKeyMethod(_inputUsername,loadProp.getproperty("Username"));
        sendKeyMethod(_inputPassword,loadProp.getproperty("Password"));
        clickOnElement(_clickOnLoginButton);
    }
    public void inputusernameAndPassword_Method(String username){
        sendKeyMethod(_inputCreatedUserNme,username);
        sendKeyMethod(_inputpasswordForLogIn,loadProp.getproperty("password"));
        clickOnElement(_clickOnLonginButton2);
    }
}
