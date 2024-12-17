package TestSuites;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectCompanyPage;
import Pages.UserCreatePage;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TC_UserCreatePage extends BaseClass {

    @Test
    public void verifyUserCreation (){
        System.out.println("TC01 - Verify whether the user created successfully");
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("Qc6%cSxYU%J7");
        loginPage.clickLoginButton();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("Apek");
        selectCompanyPage.clickSubmitButton();
        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.clickUsers();
        homePage.clickNewUser();
        //Create User
        UserCreatePage userCreatePage = new UserCreatePage(driver);
        userCreatePage.selectTitle("Mrs.");
        userCreatePage.setFirstName("mdtest-saji");
        userCreatePage.setLastName("user auto");
        userCreatePage.setUsername("mdtest-saji user auto");
        userCreatePage.setBusinessEmail("hjayasooriyaauto@gmail.com");
        userCreatePage.scrollPage();
        userCreatePage.selectUserRole("System Administrators");
        userCreatePage.selectUserType("Employee");
        userCreatePage.selectTimeZone("(GMT-06:00) Central Time (US & Canada)");
        userCreatePage.selectLanguage("English");
        userCreatePage.selectCountry("United States");




        //userCreatePage.selectTimeZone(9);
        //userCreatePage.selectLanguage("English");
        //userCreatePage.selectCountry("United States");

    }
}
