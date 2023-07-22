package org.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pageobjects.LoginPage;
import org.pageobjects.ProductsPage;
import org.utilities.CommonUntility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;


public class LoginStep extends CommonUntility {
	
	static Logger Log = LogManager.getLogger(LoginStep.class);
	
	ProductsPage product;
	
	@Given("The user has to navigate to the login page of swaglabs")
	public void the_user_has_to_navigate_to_the_login_page_of_swaglabs() {
  assertEquals("verify the title of the page","Swag Labs", getTitle());	    
	    Log.info("The title was get and verified "+getTitle());
	}
	
	@When("The user enter the username {string} and password {string} and click login button")
	public void the_user_enter_the_username_and_password_and_click_login_button(String username, String password) {
	LoginPage l = new LoginPage();
		l.login(getProperty("username"), getProperty("password"));
		assertTrue("verify the user login",l.verifyUserLogin(getProperty("username"), getProperty("password")));
		 Log.info("The user Login completed");
//	   enterValue(l.getUsername(),"standard_user");
//	   
//	   enterValue(l.getPassword(), "secret_sauce");
//	   
//	   clickButton(l.getLoginButton());
//		Thread.sleep(3000);
	}

	@Then("The user has to be in valid page of user login")
	public void the_user_has_to_be_in_valid_page_of_user_login() {
		String url="https://www.saucedemo.com/inventory.html";
//		boolean urleq = driver.getCurrentUrl().equals(url);
		assertEquals("verify the inventory page url",url,driver.getCurrentUrl());
		 Log.info("The Login verification was completed");

	
	
	
	
//	String url ="https://www.saucedemo.com/inventory.html";
//	String currentUrl = driver.getCurrentUrl();
//	System.out.println(currentUrl);
//	
//	
//	Assert.assertEquals("verify the inventory page url",url,currentUrl);
//	closeBrowser();
	System.out.println("---------Test Completed---------");
	}
	
	@When("User should slect {string} product")
	public void user_should_slect_product(String prdocut) {
	   Log.info("User view the all product");
		product =new ProductsPage();
		product.selectParticularProduct(getProperty(prdocut));
		 Log.info("User view the "+product.productnme +"product"); 
		 Log.info("User view the "+product.getProductNameAfterSelect() +"product"); 
		 
	}
	

	@Then("User should view the same product what selected in previous page")
	public void user_should_view_the_same_product_what_selected_in_previous_page() {
		Log.info("The product are same"+"Before Select...."+product.productnme+" "+"After Select "
				 + product.getProductNameAfterSelect());
		 assertTrue("verify the productname",product.verifyTheProductareSame());
		 

}

@Then("User should slect every product and view the same product what selected in previous page")
public void user_should_slect_every_product_and_view_the_same_product_what_selected_in_previous_page() throws InterruptedException {
	product= new ProductsPage();
	List<String> before = product.getAllProductName();
  List<String> after = product.selectEveryProduct();
  product.verifyAllProductName();
	 Log.info("The product are same"+"Before Select...."+before+" "+"After Select "+ after);

}
}