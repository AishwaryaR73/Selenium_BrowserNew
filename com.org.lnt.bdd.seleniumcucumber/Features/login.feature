Feature: Nop Commerce
  
  Scenario: Login with valid credentials
    Given User launch the browser
    When User open  the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters email id as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then The page title should be "Dashboard / nopCommerce administration"
    When User click on logout button
    Then The page title should be "Your store. Login"
    And Close the browser

    
