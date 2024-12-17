package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EditCoursePage {
    public WebDriver driver;



    public EditCoursePage(WebDriver driver){
        this.driver = driver;}

    public By CourseLessons = By.xpath("//a[@href='#tabCourseLessons']");
    public By AddCourseLesson = By.cssSelector("button.btn.btn-sm.btn-success");
    public By LessonName = By.cssSelector("input#lessonName_1.form-control");
    public By AddNewLessonButton = By.cssSelector("#addCourseLessonModal > div > div > div.modal-footer > button.btn.btn-primary");
    public By CourseName = By.id("CourseName_1");
    public By CourseActiveStatus = By.id("rdoStatusActive");
    public By CourseInactiveStatus = By.id("rdoStatusInactive");
    public By CourseModalityDropdown = By.cssSelector("div#cmbModality_chosen.chosen-container.chosen-container-single");
    public By CourseModalityList = By.xpath("(//ul[@class='chosen-results'])[3]");
    public By ChooseCourseModality = By.cssSelector("ul.chosen-results>li");
    public By OverviewTab = By.xpath("//a[@href='#tabCourseOverview']");
    public By UpdateCourseButton = By.xpath("//button[@type='submit'][@class='btn btn-primary'][@onclick='return validateForm()']");
    public By AddLessonPopup = By.xpath("(//div[@class='modal-content'])[18]");
    public By DuplicateLessonMsg = By.id("clickOverviewTab");


    public void clickCourseLessons (){
        driver.findElement(CourseLessons).click();
    }
    public void clickAddCourseLesson (){
        driver.findElement(AddCourseLesson).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddLessonPopup));
    }
    public void enterLessonName (String LessonNameTxt){
        driver.findElement(LessonName).sendKeys(LessonNameTxt);
    }
    public void clickAddNewLesson () throws InterruptedException {
        driver.findElement(AddNewLessonButton).click();
        Thread.sleep(5000);
    }
    public void clickOverviewTab () throws InterruptedException {
        driver.findElement(OverviewTab).click();
        Thread.sleep(5000);
    }
    public void clickCourseActiveStatus (){
        WebElement radioButton1 = driver.findElement(CourseActiveStatus);
        if (!radioButton1.isSelected()) {
            radioButton1.click();
        }
    }
    public void clickCourseInactiveStatus(){
        WebElement radioButton2 = driver.findElement(CourseInactiveStatus);
        if (!radioButton2.isSelected()) {
            radioButton2.click();
        }
    }
    public void clickCourseModalityDropdown(){
        driver.findElement(CourseModalityDropdown).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CourseModalityList));
    }
    public void setCourseModality (String CourseModality){
        List<WebElement> modalityList = driver.findElements(ChooseCourseModality);
        for(WebElement modality:modalityList ){
            if(modality.getText().trim().equals(CourseModality))
                modality.click();
        }
    }
    public void clickUpdateCourseButton (){
        driver.findElement(UpdateCourseButton).click();
    }

    public void editCourseName (String newCourseName){
        //String previousText = driver.findElement(CourseName).getAttribute("value");
        driver.findElement(CourseName).clear();
        //driver.findElement(CourseName).sendKeys(newCourseName + previousText);
        driver.findElement(CourseName).sendKeys(newCourseName);
    }
    public By editIcon = By.xpath("//td[contains(text(),'mdtest-saji-lesson1')]/following-sibling::td/a[contains(@class, 'glyphicon glyphicon-pencil editLink btn btn-xs btn-primary')]");
    public void clickLessonEdit (){
        driver.findElement(editIcon).click();
    }



}
