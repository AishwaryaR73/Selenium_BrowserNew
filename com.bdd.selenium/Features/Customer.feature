Feature: Login and Add customer
Background: 
Given User launch the browser
When  User add the url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then User enter the email id as "admin@yourstore.com" and password as "admin"
Then Click on the login button
Then Verify the title as "Dashboard / nopCommerce administration"

Scenario: Login with valid data
Then Click on logout button
Then Verify the title as "Your store. Login"
And Close the browser

Scenario: Add the new customer
Then Click on customer tab
Then Click on sub customer tab
Then Click on add new button
And Enter the email id
And Enter the password
And Enter the first name
And Enter the last name
And Enter the comapny
And Click on save button
Then Click on logout button
Then Verify the title as "Your store. Login"
And Close the browser

