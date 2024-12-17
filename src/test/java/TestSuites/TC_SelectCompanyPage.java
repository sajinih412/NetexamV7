package TestSuites;

import Pages.LoginPage;
import Pages.SelectCompanyPage;
import org.testng.annotations.Test;

public class TC_SelectCompanyPage extends BaseClass {
private String LoggedinCompany = "AMD";
    @Test
    public void VerifySuccessfulCompanyLogin () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown(LoggedinCompany);
        selectCompanyPage.clickSubmitButton();
        selectCompanyPage.validateLoggedinCompany(LoggedinCompany);
    }
    @Test
    public void VerifyUnsuccessfulCompanyLogin (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown(LoggedinCompany);
        selectCompanyPage.clickSubmitButton();
        selectCompanyPage.validateLoggedinCompany("Hexagon");
    }
}

