package TestSuites;

import Pages.CreateCurriculumPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectCompanyPage;
import org.testng.annotations.Test;

public class TC_CreateCurriculum extends BaseClass{

    @Test(priority = 0)
    public void verifyCreateCurriculum (){
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("Qc6%cSxYU%J7");
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
        System.out.println("Clicked Create Curriculum");
        //Create Curriculum
        CreateCurriculumPage createCurriculumPage = new CreateCurriculumPage(driver);
        createCurriculumPage.enterCurriculumName("mdtest-saji-test02curriculum");
        createCurriculumPage.enterCurriculumDescription("mdtest Curriculum Description2");
        createCurriculumPage.clickSubmitButton();


    }
    @Test(priority = 1)
    public void verifyDuplicateCurriculum (){
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
        //Create Curriculum
        CreateCurriculumPage createCurriculumPage = new CreateCurriculumPage(driver);
        createCurriculumPage.enterCurriculumName("mdtest-saji-test02curriculum");
        createCurriculumPage.clickSubmitButton();
        createCurriculumPage.validateDuplicateCurriculumCreation();

    }
    @Test(priority = 2)
    public void verifyEmptyCurriculumName (){
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
        //Create Curriculum
        CreateCurriculumPage createCurriculumPage = new CreateCurriculumPage(driver);
        createCurriculumPage.enterCurriculumName("");
        createCurriculumPage.clickSubmitButton();
        createCurriculumPage.validateEmptyCurriculumName();
    }

}
