package Com.OrangeHRM1;

import org.openqa.selenium.By;

public class DashboardPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private static By _hoveroverForPIM=By.cssSelector("#menu_pim_viewPimModule>b"); //Hoverover PIM
    private static By _clickOnAddEmployee=By.cssSelector("#menu_pim_addEmployee");//click add employee
    private static By _assertForWelComeName=By.xpath("//a[@id='welcome']");//assert welcome name


    public void hoveroverPIMClickONAddEmploy_Method()//Hoverover PIM - add employee
    {
        moveOverMethod(_hoveroverForPIM);
        clickOnElement(_clickOnAddEmployee);
    }
    public void assertForWelComeName_Method(String assertname){
        assertEqualMethod(_assertForWelComeName,"Welcome "+assertname);

    }
}
