package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public By CourseMenu = By.cssSelector("span.Courses");
    public By CreateCurriculum = By.linkText("Create Curriculum");
    public By Curriculums = By.xpath("//a[@id='Curriculums']");

    public By Courses = By.xpath("//a[@id='Courses'][@class='sub-menu-item']");
    public By MenuItems = By.xpath("//ul[@class='menuItem'][@style='overflow: hidden; display: block;']");
    public By Users = By.id("Users");
    public By NewUser = By.xpath("//a[@id='New User'][@class='sub-menu-item']");
    public By NewUserGroup = By.id("New User Group");
    public By HomePageMenu = By.id("cssmenu");


    public void scrollMenu (){
        int pixelsToScroll = 350;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop += arguments[1];", HomePageMenu, pixelsToScroll);

    }
    public void expandCoursesMenu (){
        driver.findElement(CourseMenu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MenuItems));
    }
    public void clickCreateCurriculum(){
        driver.findElement(CreateCurriculum).click();
    }
    public void clickCurriculums (){
        driver.findElement(Curriculums).click();}
    public void clickCourses (){driver.findElement(Courses).click();}

    public void clickUsers (){ driver.findElement(Users).click();}
    public void clickNewUser (){ driver.findElement(NewUser).click();}
    public void clickNewUserGroup (){driver.findElement(NewUserGroup).click();}

}
