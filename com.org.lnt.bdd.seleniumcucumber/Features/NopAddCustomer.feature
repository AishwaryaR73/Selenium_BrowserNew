Feature: Nop Commerce 
Background:
Given User launch the browser
    When User open  the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters email id as "admin@yourstore.com" and password as "admin"
    And  User click on login button
   

@sanity
Scenario: Login with valid credentials --sanity
    
    Then The page title should be "Dashboard / nopCommerce administration"
    Then Click on logout button
		Then The page title should be "Your store. Login"
		And Close the browser
		
    @Regression 
Scenario: Add customer--regression
	  Then  User click on customer tab
    Then User click on sub customer tab
    Then User click on add new button
    Then Enter email id
    Then Enter password
    Then Enter first name
    Then Enter last name
    Then Enter comapny name
		And Click on save button
		Then Click on logout button
		Then The page title should be "Your store. Login"
		And Close the browser
