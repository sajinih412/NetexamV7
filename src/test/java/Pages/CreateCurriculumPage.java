package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCurriculumPage {
    public WebDriver driver;

    public CreateCurriculumPage (WebDriver driver){ this.driver = driver;}

    public By TxtCurriculumName = By.xpath("//input[@id='txtCurriculumName']");
    public By TxtCurriculumDescription = By.cssSelector("div.Editor-editor");
    public By SubmitButton = By.xpath("//button[@class='btn btn-primary'][@type='submit']");
    public By ResetButton = By.xpath("//button[@type='reset']");
    public By DuplicateErrorMsg = By.cssSelector("p.field-validation-error");
    public By CurNameReqMsg = By.cssSelector("span.field-validation-error");


    public void enterCurriculumName (String CurName){
        driver.findElement(TxtCurriculumName).sendKeys(CurName);
    }
    public void enterCurriculumDescription (String CurDescription){
        driver.findElement(TxtCurriculumDescription).sendKeys(CurDescription);
    }
    public void clickSubmitButton (){
        driver.findElement(SubmitButton).click();
    }
    public void clickResetButton (){
        driver.findElement(ResetButton).click();
    }
    public void validateDuplicateCurriculumCreation (){
        if (driver.findElement(DuplicateErrorMsg).isDisplayed()){
            System.out.println("A curriculum with that name already exists");
        }
    }
    public void validateEmptyCurriculumName (){
        if (driver.findElement(CurNameReqMsg).isDisplayed()){
            System.out.println("Curriculum Name cannot be empty");
        }
    }


}
