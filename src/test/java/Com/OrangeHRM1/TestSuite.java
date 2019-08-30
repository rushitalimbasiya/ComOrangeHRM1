package Com.OrangeHRM1;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage =new HomePage();
    DashboardPage dashboardPage = new DashboardPage();
    AddEmployeePage addEmployeePage= new AddEmployeePage();
    SystmUsersPage systmUsersPage = new SystmUsersPage();
    AddUserPage addUserPage= new AddUserPage();


 /*   TC : 1
    URL : https://opensource-demo.orangehrmlive.com
    Admin user should be able to assign username for existing employee with specific role
 1.0       Get user name and password from login screen and login.
 1.1       Hoverover PIM - add employee and create employe
 2.       Click on Admin tab
 3.       Click Add
 4.       Select User roles(admin)  - enter created employe in the employee name
 5.       Fill all compulsory fields
 6.       Save it
 7.       Verify that user name present in the database by searching
 8.       Logout
 9.       Login with username and password just created
 10.      verify user is able to login successfully.
 */
@Test

    public void to_verify_User_Is_Able_To_inputUserIDPassword_HoveroverPIM_CreateEmploee_ClickOnAdmin_ClickAdd_(){

    homePage.inputUserinputPassclickLoginbutton_Method();  //Get user name and password from login screen and login.
    dashboardPage.hoveroverPIMClickONAddEmploy_Method();//Hoverover PIM - add employee
    addEmployeePage.inputFirstNameMiddleNameLastNameClickOnSaveButton_Method();//input employe First Name,Middle Name,Last Name and click on save button
    systmUsersPage.clickOnAdminTebClickOnAddButton_Method();// Click on Admin tab and Click Add button
    addUserPage.selectAdminInputEmployeeNameUserNamePasswordCofirmPass_Method(addEmployeePage.firstName1);//Select User roles(admin) ,enter created employe in the employee name,Username,Password and Confirm Password
    addUserPage.clickOnSaveButton_Method();//Save it button
    systmUsersPage.inputUserName2_Method(addEmployeePage.firstName1);//input user name
    systmUsersPage.clickOnSearch_Method();//click on search button
    systmUsersPage.clickOnWelcomeAdminAndLoginButton_Method();//click on welcome admin button and click on long in button
    homePage.inputusernameAndPassword_Method(addEmployeePage.firstName1);
    dashboardPage.assertForWelComeName_Method(addEmployeePage.firstName1);


}
}
