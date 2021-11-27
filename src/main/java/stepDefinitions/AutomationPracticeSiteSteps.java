package stepDefinitions;

import commonUtilities.DriverUtility;
import elementRepository.APMyAccountCreationPage;
import elementRepository.APMyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeSiteSteps {

    APMyAccountCreationPage apMyAccountCreationPage;
    APMyAccountPage apMyAccountPage;
   // WebDriver driver;

    @Given("Launch automation practice site  url {string}")
    public void launch_automation_practice_site_url(String url) {
        DriverUtility.driver.get(url);
        apMyAccountCreationPage = new APMyAccountCreationPage();
        apMyAccountPage = new APMyAccountPage();
    }


    @Given("Navigate to Create account page")
    public void navigate_to_create_account_page() {
        apMyAccountCreationPage =  apMyAccountPage.goToMyAccountCreationPage();
    }

    @When("Enter all required fields {string}, {string},{string},{string},{string}, {string},{string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}")
    public void enter_all_required_fields(String custFN, String custLN, String custEmail, String dropDaysValue, String dropDMonth, String dropDownYear, String addressFirName, String addressLastName, String companyName, String address, String cityName, String addressState, String zip, String countryDdTextValue, String phoneNumber) {

        apMyAccountCreationPage.createNewAccount(custFN,custLN,custEmail,dropDaysValue,dropDMonth,dropDownYear,addressFirName,addressLastName,companyName,address,cityName,addressState,zip,countryDdTextValue,phoneNumber);
    }

    @When("Click on Automation practice Register button")
    public void click_on_automation_practice_register_button() {
       apMyAccountCreationPage.clickOnRegisterAccountBtn();
    }
    @Then("Validate new account created")
    public void validate_new_account_created() {
        System.out.println(" new account has been created");
    }

}
