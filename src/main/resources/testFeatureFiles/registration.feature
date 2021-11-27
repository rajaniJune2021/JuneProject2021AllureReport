Feature:Registering the User

  Background: Launch the browser for execution
    Given Launch the chrome browser

  @sanity

#Scenario Outline:Creating a user
#Given Launch automation demo site  url "http://demo.automationtesting.in/Register.html"
##When  Click on signIn button
#When Enter all required fields "<firstName>","<lastName>","<address>","<emailID>","<phoneNumber>","<password>","<confirmPassword>"
#Then Click on Register button
#Then validate successFul registration message displayed.
#  Examples:
#  |firstName| lastName|address|emailID|phoneNumber | password| confirmPassword|
#  |rajani |gunda     |123 main street| test@gmail.com|123456789|pwd123|pwd123|
##  | david  | Henry    | 234 main street| test2@gmail.com | 234567890|pwd234|pwd234|
##  |naresh  | kumar    | 345 main street| test3@gmail.com |345678901 |pwd345| pwd345|
##  |kim     |raver     | 456 main street | test4@gmail.com|456789012 | pwd456|pwd456|

  @quickTest
  Scenario:Creating a user
    Given Launch automation demo site  url "http://demo.automationtesting.in/Register.html"
#When  Click on signIn button
    When Enter all required fields
      | attribute       |   value           |
      | firstName       |  david           |
      | lastName        |  Henry           |
      | address         |  234 main street |
      | emailID         |   test2@gmail.com |
      | phoneNumber     |  345678901       |
      | password        |  pwd345          |
      | confirmPassword |   pwd345          |
    Then Click on Register button
    Then validate successFul registration message displayed.

  @Regression
  Scenario: SwitchTo tab test
    Given Launch automation demo site  url "http://demo.automationtesting.in/Register.html"
    When Hover on Switch to tab
    When Click on AlertTab
    Then Navigate to AlertsPage

#    create another feature for autoamtion practices site


