package TestSuites;

import Pages.LoginPage;
import Pages.SelectCompanyPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


        public WebDriver driver;
        public String baseURL = "https://v7a1-staging.netexam.com/Login";




    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void quit(){
//        driver.quit();
//    }
    public void scrollPage() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 1000);");
    }

    public void login (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        loginPage.validateLogin();
    }
    public void companySelect (){
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("NetexamTesting");
        selectCompanyPage.clickSubmitButton();
        selectCompanyPage.validateLoggedinCompany("NetexamTesting");
    }





}
