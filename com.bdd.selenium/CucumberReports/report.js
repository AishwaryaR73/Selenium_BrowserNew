$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Login and Add customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the url as \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.user_add_the_url_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the email id as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.user_enter_the_email_id_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.apache.log4j.Logger.info(Object)\" because \"testSteps.NopAddCustomer.logger\" is null\r\n\tat testSteps.NopAddCustomer.user_enter_the_email_id_as_and_password_as(NopAddCustomer.java:36)\r\n\tat ✽.User enter the email id as \"admin@yourstore.com\" and password as \"admin\"(file:///C:/Users/admin/eclipse-workspace/com.bdd.selenium/./Features/Customer.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the title as \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.verify_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the title as \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.verify_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the url as \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.user_add_the_url_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the email id as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.user_enter_the_email_id_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.apache.log4j.Logger.info(Object)\" because \"testSteps.NopAddCustomer.logger\" is null\r\n\tat testSteps.NopAddCustomer.user_enter_the_email_id_as_and_password_as(NopAddCustomer.java:36)\r\n\tat ✽.User enter the email id as \"admin@yourstore.com\" and password as \"admin\"(file:///C:/Users/admin/eclipse-workspace/com.bdd.selenium/./Features/Customer.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the title as \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.verify_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add the new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on customer tab",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_customer_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on sub customer tab",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_sub_customer_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on add new button",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the email id",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.enter_the_email_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the password",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.enter_the_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the first name",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.enter_the_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the last name",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.enter_the_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the comapny",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.enter_the_comapny()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.click_on_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the title as \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.verify_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.NopAddCustomer.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});