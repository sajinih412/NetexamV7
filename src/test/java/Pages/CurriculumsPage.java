package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurriculumsPage {
    public WebDriver driver;
    public CurriculumsPage (WebDriver driver){
        this.driver = driver;
    }
    public By EditButton = By.cssSelector("a.glyphicon.glyphicon-pencil.editLink.btn.btn-xs.btn-primary");
    public By DisplayCurName = By.xpath("//*[@id=\"collapsetwo\"]/div/table/tbody/tr[1]/td[2]");
    public void clickEditButton (){
        driver.findElement(EditButton).click();
    }
    public void validateSuccessfulCurriculumCreation (String CurName){
        if (driver.getPageSource().contains(CurName)){
            System.out.println("Curriculum Successfully Created");
        }

    }
}
