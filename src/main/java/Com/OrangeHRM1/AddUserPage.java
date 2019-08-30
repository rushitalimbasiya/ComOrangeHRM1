package Com.OrangeHRM1;

import org.openqa.selenium.By;

public class AddUserPage extends Utils{
    LoadProp loadProp = new LoadProp();
    AddEmployeePage addEmployeePage = new AddEmployeePage();

   private static By _selectAdmin=By.cssSelector("#systemUser_userType"); //select admin
   private static By _inputEmployeeName=By.xpath("//input[@id='systemUser_employeeName_empName']"); //input Employee Name
   private static By _inputUserName= By.cssSelector("#systemUser_userName"); //input Username
   private static By _inputPassword = By.xpath("//input[@id='systemUser_password']"); //input Password
   private static By _inputCofirmPassword=By.xpath("//input[@id='systemUser_confirmPassword']"); //input Confirm Password
   private static By _clickOnSaveButton=By.xpath("//input[@id='btnSave']"); // click on save button

    public void selectAdminInputEmployeeNameUserNamePasswordCofirmPass_Method(String employName1)
    {
        selectByVisibleTextMethod(_selectAdmin,"Admin");
        sendKeyMethod(_inputEmployeeName,employName1);
        enterKeyMethod(_inputEmployeeName);// click on enter without enter does not take employ name
        sendKeyMethod(_inputUserName,employName1);
        sendKeyMethod(_inputPassword,loadProp.getproperty("password"));
        sendKeyMethod(_inputCofirmPassword,loadProp.getproperty("confirmPassword"));
    }
    public void clickOnSaveButton_Method()
    {
        clickOnElement(_clickOnSaveButton);
    }



}
