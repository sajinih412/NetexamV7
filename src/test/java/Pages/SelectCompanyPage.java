package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class SelectCompanyPage {
        public WebDriver driver;
        public SelectCompanyPage (WebDriver driver){
            this.driver = driver;
        }

        public By CompanyDropdown = By.xpath("//div[@class='chosen-container chosen-container-single']");
        public By SubmitButton = By.cssSelector("button.login.login-btn");
        public By ChooseCompany = By.cssSelector("ul.chosen-results>li");

        public void clickDropdown (){
                driver.findElement(CompanyDropdown).click();
        }
        public void selectCompanyFromDropdown (String option){
                List<WebElement> companyList = driver.findElements(ChooseCompany);
                for(WebElement company:companyList ){
                        if(company.getText().trim().equals(option))
                                company.click();
                }
        }
        public void clickSubmitButton (){
                driver.findElement(SubmitButton).click();
        }

        public void validateLoggedinCompany (String loggedCompany) {
                if (driver.getPageSource().contains(loggedCompany)){
                        System.out.println("Successfully Logged into" + " " + loggedCompany);
                } else {
                        System.out.println("Logged into the incorrect Company");

                }
        }



        }



