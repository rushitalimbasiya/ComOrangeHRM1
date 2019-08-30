package Com.OrangeHRM1;

import org.openqa.selenium.By;

import java.util.Random;


public class AddEmployeePage extends Utils {
    LoadProp loadProp = new LoadProp();
   // Faker faker = new Faker();
    private static By _inputFirstName=By.cssSelector("#firstName");//input  First Name
    private static By _inputMiddleName=By.cssSelector("#middleName");//input Middle Name
    private static By _inputLastName= By.cssSelector("#lastName");//input Last Name
    private static By _clickOnSaveButton=By.cssSelector("#btnSave");//click on save button
   // String firstName = faker.name().firstName();
   // String LastName = faker.name().LastName();
    String firstName1 ;
    String lastName1 = "patel"+new Random().nextInt(1000);

    public void inputFirstNameMiddleNameLastNameClickOnSaveButton_Method()
    {
        sendKeyMethod(_inputFirstName,firstName1 = "gopu"+new Random().nextInt(1000));
        sendKeyMethod(_inputMiddleName,loadProp.getproperty("MiddleName"));
        sendKeyMethod(_inputLastName,lastName1);
        clickOnElement(_clickOnSaveButton);
    }


}
