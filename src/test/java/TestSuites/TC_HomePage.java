package TestSuites;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectCompanyPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class TC_HomePage extends BaseClass{

    @Test
    public void verifyGetCreateCurriculumPage (){
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("AMD");
        selectCompanyPage.clickSubmitButton();
        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCreateCurriculum();
    }
    @Test
    public void verifyGetCurriculumsPage (){
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("NetexamTesting");
        selectCompanyPage.clickSubmitButton();
        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCurriculums();
    }
    @Test
    public void verifyGetCoursesPage (){
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("NetexamTesting");
        selectCompanyPage.clickSubmitButton();
        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCourses();
    }
    @Test
    public void verifyClickNewUserGroup (){
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("Qc6%cSxYU%J7");
        loginPage.clickLoginButton();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("NetexamTesting");
        selectCompanyPage.clickSubmitButton();
        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.clickUsers();
        homePage.clickNewUserGroup();
    }
}
