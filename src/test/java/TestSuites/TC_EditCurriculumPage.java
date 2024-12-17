package TestSuites;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_EditCurriculumPage extends BaseClass{

    @Test
    public void verifySuccessfulCourseCreation (){
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        loginPage.validateLogin();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("NetexamTesting");
        selectCompanyPage.clickSubmitButton();
        selectCompanyPage.validateLoggedinCompany("NetexamTesting");
        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCreateCurriculum();
        //Create Curriculum
        CreateCurriculumPage createCurriculumPage = new CreateCurriculumPage(driver);
        createCurriculumPage.enterCurriculumName("mdtest-saji-test02 Cur");
        createCurriculumPage.clickSubmitButton();
        //Edit curriculum
        CurriculumsPage curriculumsPage = new CurriculumsPage(driver);
        curriculumsPage.validateSuccessfulCurriculumCreation("mdtest-saji-test02 Cur");
        curriculumsPage.clickEditButton();
        //Create Course
        EditCurriculumPage editCurriculumPage = new EditCurriculumPage(driver);
        editCurriculumPage.clickCurCoursesTab();
        editCurriculumPage.clickAddNewCourseBtn();
        editCurriculumPage.enterCourseName("mdtest-saji-test02 course-new");
        editCurriculumPage.clickAddButton();
    }

//    @Test
//    public void verifyGetEditCoursePage (){
//        this.verifySuccessfulCourseCreation();
//        EditCurriculumPage editCurriculumPage = new EditCurriculumPage(driver);
//        editCurriculumPage.clickFilterByCourseStatus();
//        editCurriculumPage.selectCourseStatus("Inactive");
//        editCurriculumPage.clickSearchButton();

    //}

}
