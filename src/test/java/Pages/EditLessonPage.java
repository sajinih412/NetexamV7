package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class EditLessonPage {
    public WebDriver driver;

    public EditLessonPage (WebDriver driver){
        this.driver = driver;
    }
    public By LearningObjectivesTab = By.xpath("//a[@href='#tabLessonLearningObjectives']");
    public By AddNewLOButton = By.xpath("//button[@type='button'][@onclick='AddNewLearningObj()']");
    public By LOName = By.cssSelector("input#objectiveName");
    public By LOPopup = By.xpath("(//div[@class='modal-content'])[3]");
    public By AddLO = By.xpath("(//button[@class='btn-primary btn'])[3]");
    public By UploadLessonResourcesTab = By.xpath("//a[@href='#tabUploadLessonResources']");
    public By ResourceDisplayName = By.id("txtresourceName");
    //public By ResourceFormatDropdown = By.xpath("(//a[@class='chosen-single'])[4]");
    public By ResourceFormatDropdown = By.id("resourseFormatId_chosen");
    public By ResourceFormatDropdownListSearch = By.xpath("(//input[@type='text'])[14]");
    public By ResourceFormatDropdownList = By.xpath("(//ul[@class='chosen-results'])[4]");
    public By ResourceLanguage = By.cssSelector("div.chosen-container.chosen-container-multi.chosen-with-drop.chosen-container-active");
    public void clickLOTab (){
        driver.findElement(LearningObjectivesTab).click();
    }
    public void clickAddNewLO (){
        driver.findElement(AddNewLOButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until (ExpectedConditions.visibilityOfElementLocated(LOPopup));}
    public void enterLOName (String LObjName){
        driver.findElement(LOName).sendKeys(LObjName);
    }
    public void clickAddLOButton (){
        driver.findElement(AddLO).click();
    }
    public void clickUploadLessonResourcesTab (){
        driver.findElement(UploadLessonResourcesTab).click();
    }

    public void enterResourceName (String resourceName){
        driver.findElement(ResourceDisplayName).sendKeys(resourceName);
    }
    public void setResourceFormat (){
        driver.findElement(ResourceFormatDropdown).click();
//        driver.findElement(ResourceFormatDropdownListSearch).sendKeys(resourceFormat);
//        By selectedItemLocator = By.xpath("(//ul[@class='chosen-results'])[4]//li[contains(text(),'" + resourceFormat + "' and @data-option-array-index='28')]");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(selectedItemLocator)).click();
        //WebElement targetOption = (WebElement) By.cssSelector("li[data-option-array-index='20']");
        driver.findElement(By.cssSelector("li[data-option-array-index='28']")).click();
    }

    public void selectResourceLanguage(String language) {
        driver.findElement(ResourceLanguage).click();
        By selectedItemLocator = By.xpath("//ul[@class='chosen-results'][5]//li[contains(text(),'" + language + "')]");
        driver.findElement(selectedItemLocator).click();
    }

}
