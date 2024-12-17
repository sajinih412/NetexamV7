package TestSuites;

import Pages.CoursesPage;
import Pages.EditCoursePage;
import Pages.EditLessonPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class TC_EditLessonPage extends BaseClass{

    @Test
    public void verifyEditLesson (){
        //Login
        login();
        //Select Company
        companySelect();
        //Get Course Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCourses();
        //Get edit courses page
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.inputSearchText("mdtest-saji-course1111");
        coursesPage.clickSearchButton();
        coursesPage.clickEditButton();
        //Get edit lesson page
        EditCoursePage editCoursePage = new EditCoursePage(driver);
        editCoursePage.clickCourseLessons();
        editCoursePage.clickLessonEdit();
        //Create a Learning Objective
        EditLessonPage editLessonPage = new EditLessonPage(driver);
        editLessonPage.clickLOTab();
        editLessonPage.clickAddNewLO();
        editLessonPage.enterLOName("mdtest-saji-LO1");
        editLessonPage.clickAddLOButton();

    }
    @Test
    public void uploadResourceFile (){
        //Login
        login();
        //Select Company
        companySelect();
        //Get Course Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCourses();
        //Get edit courses page
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.inputSearchText("mdtest-saji-course1111");
        coursesPage.clickSearchButton();
        coursesPage.clickEditButton();
        //Get edit lesson page
        EditCoursePage editCoursePage = new EditCoursePage(driver);
        editCoursePage.clickCourseLessons();
        editCoursePage.clickLessonEdit();
        //Get upload resource page and upload resource
        EditLessonPage editLessonPage = new EditLessonPage(driver);
        editLessonPage.clickUploadLessonResourcesTab();
        editLessonPage.enterResourceName("mdtest-saji-lessonresourcePDF");
        scrollPage();
        editLessonPage.setResourceFormat();

    }
}
