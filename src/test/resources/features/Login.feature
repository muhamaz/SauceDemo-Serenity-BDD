Feature: Saucedemo Login Functionality

  Scenario: User logged in
    Given User already on login page
    When User input username "standard_user"
    And User input password "secret_sauce"
    And User click login button
    Then User directed to inventory page

#  Scenario: User enter invalid Login username
#    Given User landing on login page
#    When User input invalid username "standard_user33"
#    And User input valid password "secret_sauce"
#    And User click on login button
#    Then User can not login