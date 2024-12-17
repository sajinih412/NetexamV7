package TestSuites;

import Pages.*;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_EditCoursePage extends BaseClass{

    @Test(priority = 0)
    public void verifyGetEditLessonPage (){
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
        //Get Course Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCourses();
        //Get edit courses page
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.inputSearchText("mdtest-saji-course1111");
        coursesPage.clickSearchButton();
        WebElement editLink = driver.findElement(By.cssSelector("a.glyphicon.glyphicon-pencil.editLink.btn.btn-xs.btn-primary"));
        editLink.click();
        //Get Edit Lessons
        EditCoursePage editCoursePage = new EditCoursePage(driver);
        editCoursePage.clickCourseLessons();



    }
    @Test(priority = 1)
    public void verifyEditCourse () throws InterruptedException {
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
        //Get Course Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCourses();
        //Get edit courses page
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.inputSearchText("mdtest-saji-course1111");
        coursesPage.clickSearchButton();
        coursesPage.clickEditButton();
        //Get Create Lessons
        EditCoursePage editCoursePage = new EditCoursePage(driver);
        editCoursePage.editCourseName("mdtest-saji-courseedited3");
        editCoursePage.clickCourseLessons();
        editCoursePage.clickAddCourseLesson();
        editCoursePage.enterLessonName("mdtest-saji-lesson4");
        editCoursePage.clickAddNewLesson();
        //Set Course Modality and Status
        editCoursePage.clickOverviewTab();
        scrollPage();
        editCoursePage.clickCourseModalityDropdown();
        editCoursePage.setCourseModality("External");
        editCoursePage.clickCourseActiveStatus();
        editCoursePage.clickUpdateCourseButton();

    }

}
