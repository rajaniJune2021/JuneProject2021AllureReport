package stepDefinitions;

import commonUtilities.DriverUtility;
import elementRepository.APMainPage;
import elementRepository.RegistrationPage;
import io.cucumber.datatable.internal.difflib.Delta;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Steps {

     APMainPage apMainPage;
    RegistrationPage registrationPage;
    WebDriver driver;

    @Given("Launch the chrome browser")
    public void launch_the_chrome_browser() {
     driver =  DriverUtility.getDriver();

    }
    @Given("Launch automation demo site  url {string}")
    public void launch_automation_demo_site_url(String string) {
        driver.get(string);
        apMainPage  = new APMainPage();
        registrationPage   = new RegistrationPage();

    }

    @When("Enter all required fields {string},{string},{string},{string},{string},{string},{string}")
    public void enter_all_required_fields(String firstNameInput, String lastNameInput, String addressInput, String emailInput, String phoneInput, String firstPwd, String secondPw) {
        registrationPage.registerUser(firstNameInput,lastNameInput,addressInput,emailInput,phoneInput,firstPwd,secondPw);

    }

    @When("Enter all required fields")
    public void enter_all_required_fields(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> valuesMap = dataTable.asMap(String.class,String.class);
        System.out.println("first name " +valuesMap.get("firstName"));
        registrationPage.registerUser(valuesMap.get("firstName"),valuesMap.get("lastName"),valuesMap.get("address"),valuesMap.get("emailID"),valuesMap.get("phoneNumber"),valuesMap.get("password"),valuesMap.get("confirmPassword"));
    }
    @Then("Click on Register button")
    public void click_on_register_button() {
      registrationPage.clickOnSubmit();

    }
    @Then("validate successFul registration message displayed.")
    public void validate_success_ful_registration_message_displayed() {
        System.out.println("Registration is successful.");

    }


    //Test2

    @Before("@sanity")
    public void abcMethod(){
        System.out.println("Before method abc method  calling which has sanity tag in step definition");
       // driver.get("http://demo.automationtesting.in/Register.html");
    }

    @When("Hover on Switch to tab")
    public void hover_on_switch_to_tab() throws InterruptedException {
     registrationPage.validateFirstAlertBox();
    }
    @When("Click on AlertTab")
    public void click_on_alert_tab() {
        System.out.println("navigatedto switch To tab and validated all alert and windows tabs");
    }
    @Then("Navigate to AlertsPage")
    public void navigate_to_alerts_page() {

    }

    @After("@sanity")
    public void abcAfterMethod(){
        System.out.println("after method calling from step definition file which has sanity tag");
    }

}
