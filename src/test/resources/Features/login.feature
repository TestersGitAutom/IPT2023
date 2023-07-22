Feature: To validate the login  function of swaglabs application

@sc1
Scenario: To validate the swagnlabs login with valid credentails
		Given The user has to navigate to the login page of swaglabs
		When The user enter the username "username" and password "password" and click login button
		Then The user has to be in valid page of user login

@sc2		
Scenario: To verify the product name after select the paarticular product
    Given The user has to navigate to the login page of swaglabs
		When The user enter the username "username" and password "password" and click login button
		When User should slect "productname" product
		Then User should view the same product what selected in previous page
		
@sc3		
Scenario: To verify the product name after select the all product
    Given The user has to navigate to the login page of swaglabs
		When The user enter the username "username" and password "password" and click login button 
		Then User should slect every product and view the same product what selected in previous page