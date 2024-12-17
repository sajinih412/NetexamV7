package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UserCreatePage {

    public WebDriver driver;
    public UserCreatePage (WebDriver driver) { this.driver = driver;}


    public By DropdownList = By.cssSelector("ul.chosen-results>li");
    public By TitleDropdown = By.xpath("(//a[@class=\"chosen-single\"])[1]");
    //public By TitleList = By.cssSelector("ul.chosen-results>li");
    public By FirstNameField = By.id("txtFName");
    public By LastNameField = By.id("txtLName");
    public By UsernameField = By.id("txtUserName");
    public By BusinessEmailField = By.id("txtEmail");
    public By UserRoleDropdown = By.id("cmbUserRole_chosen");
    //public By UserRoleList = By.cssSelector("ul.chosen-results>li");
    public By UserTypeDropdown = By.id("cmbUserType_chosen");
    //public By UserTypeList = By.cssSelector("ul.chosen-results>li");
    public By TimeZoneDropdown = By.id("cmbTimeZone_chosen");
    public By LanguageDropdown = By.id("cmbLanguage_chosen");
    public By CountryDropdown = By.id("cmbCountry_chosen");
    public By SelectPrimaryUgButton = By.id("btnUserUserGroups");
    public By SearchUGField = By.id("txtsearchbyPrimaryUserGroup");
    public By SearchUGButton = By.xpath("//button[@class=\"btn btn-primary btn-xs\"][@onclick=\"searchPrimaryUserGroup()\"]");
    public By PrimaryUGDropdown= By.id("cmbPrimaryUserGroup_chosen");

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300);");
    }

    public void selectTitle (String Title) {
        driver.findElement(TitleDropdown).click();
        List<WebElement> titleList = driver.findElements(DropdownList);
        for (WebElement title : titleList) {
            if (title.getText().trim().equals(Title))
                title.click();
        }
    }
    public void setFirstName(String firstName){
        driver.findElement(FirstNameField).sendKeys(firstName);
    }
    public void setLastName (String lastName){
        driver.findElement(LastNameField).sendKeys(lastName);
    }
    public void setUsername (String username){
        driver.findElement(UsernameField).sendKeys(username);
    }
    public void setBusinessEmail (String businessEmail){
        driver.findElement(BusinessEmailField).sendKeys(businessEmail);
    }
    public void selectUserRole (String UserRoleName){
        driver.findElement(UserRoleDropdown).click();
        List<WebElement> userRoleList = driver.findElements(DropdownList);
        for (WebElement userRole : userRoleList) {
            if (userRole.getText().trim().equals(UserRoleName))
                userRole.click();
        }
    }
    public void selectUserType (String UserType){
        driver.findElement(UserTypeDropdown).click();
        List<WebElement> userTypeDropdown = driver.findElements(DropdownList);
        for (WebElement userType : userTypeDropdown) {
            if (userType.getText().trim().equals(UserType))
                userType.click();
        }
    }
    public void selectTimeZone (String timeZone){
        driver.findElement(TimeZoneDropdown).click();
        List<WebElement> userTypeDropdown = driver.findElements(DropdownList);
        for (WebElement userType : userTypeDropdown) {
            if (userType.getText().trim().equals(timeZone))
                userType.click();
        }
    }
    public void selectLanguage (String userLanguage){
        Select language = new Select(driver.findElement(LanguageDropdown));
        language.selectByVisibleText(userLanguage);
    }
    public void selectCountry (String userCountry){
        Select country = new Select(driver.findElement(CountryDropdown));
        country.selectByVisibleText(userCountry);
    }
    public void selectPrimaryUg (String userGroup){
        driver.findElement(SelectPrimaryUgButton).click();
        driver.findElement(SearchUGField).sendKeys(userGroup);
        driver.findElement(SearchUGButton).click();

    }
    public void selectPrimaryUserGroup (String uG){

    }
}
