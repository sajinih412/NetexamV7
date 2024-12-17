package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EditCurriculumPage {
    public WebDriver driver;
    public EditCurriculumPage (WebDriver driver){
        this.driver = driver;
    }
    public By CurCoursesTab = By.xpath("//a[@class='tab_bac'][@aria-controls='tabCurriculumCourses'][@role='tab']");
    public By AddNewCourseBtn = By.xpath("//button[@class='btn btn-sm btn-success'][@onclick='AddNewCourse()']");
    public By CourseNameField = By.id("courseName");
    public By AddButton = By.id("addbtn");
    public By ClearButton = By.id("btnreset");
    public By StatusDropdown = By.xpath("//*[@id=\"statusIsActive_chosen\"]/a");
    public By CreateCoursePopup = By.id("AddNewCourseModal");
    public By FilterByCourseStatus = By.id("filterCourseStatus_chosen");
    public By StatusResults = By.cssSelector("ul.chosen-results>li");
    public By SearchButton = By.xpath("//*[@id=\"tabCurriculumCourses\"]/div/div/div[1]/div/button");



    public void clickCurCoursesTab (){
        driver.findElement(CurCoursesTab).click();
    }
    public void clickAddNewCourseBtn (){
        driver.findElement(AddNewCourseBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateCoursePopup));
    }
    public void enterCourseName (String CourseName){
        driver.findElement(CourseNameField).sendKeys(CourseName);
    }
    public void clickAddButton (){
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,600)");
        //js.executeScript("arguments[0].scrollIntoView();",AddButton );
        driver.findElement(AddButton).click();
    }
    public void clickClearButton (){
        driver.findElement(ClearButton).click();
    }
    public void displayCreateCoursePopup (){ driver.findElement(CreateCoursePopup).isDisplayed();}
    public void clickFilterByCourseStatus (){
        driver.findElement(FilterByCourseStatus).click();
    }
    public void selectCourseStatus (String Status) {
        List<WebElement> statusList = driver.findElements(StatusResults);
        for (WebElement status : statusList) {
            if (status.getText().trim().equals(Status))
                status.click();
        }
    }
    public void clickSearchButton(){
        driver.findElement(SearchButton).click();
    }
}
