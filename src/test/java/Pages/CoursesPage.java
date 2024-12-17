package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesPage {

    public WebDriver driver;
    public CoursesPage(WebDriver driver){ this.driver = driver;}
    public By SearchTextbox = By.id("searchString");
    public By SearchButton = By.xpath("//button[@type='submit'][@class='btn btn-sm btn-primary']");
    public By EditButton = By.cssSelector("a.glyphicon.glyphicon-pencil.editLink.btn.btn-xs.btn-primary");
    public void inputSearchText (String CourseName){
        driver.findElement(SearchTextbox).sendKeys(CourseName);
    }
    public void clickSearchButton (){
        driver.findElement(SearchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickEditButton (){
        driver.findElement(EditButton).click();
    }


}
