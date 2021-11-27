Feature:Registering the New User

  Background: Launch the browser for execution
    Given Launch the chrome browser

  @smoke
  Scenario:Create a new user
    Given Launch automation practice site  url "http://automationpractice.com/index.php"
#    When Click on Sign In button
#    And Enter Email Id "Email_address"
#    And Click on Create an account page
#    Then Navigate to Create account page
     Given Navigate to Create account page
    When Enter all required fields "testone", "testtwo","test@678","1","1", "2000","testone", "testtwo", "ABCCompany", "123 main street", "cypress","California", "90630", "United States", "234567890"
    And Click on Automation practice Register button
    Then  Validate new account created
