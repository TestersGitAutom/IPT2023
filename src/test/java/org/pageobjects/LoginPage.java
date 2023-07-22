package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.CommonUntility;

public class LoginPage extends CommonUntility{

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="user-name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
//	public WebElement getUsername() {
//		return driver.findElement(By.id("user-name"));
//	
//	}
//	public WebElement getPassword() {
//		WebElement el = driver.findElement(By.id("password"));
//		return el;
//
//	}
//	public WebElement getLoginButton() {
//		WebElement el = driver.findElement(By.id("login-button"));
//		return el;
//	}
	
	
	//----------------------------------------------//
	static String user1;
	static String pass1;
	
	
	public void login(String user, String pass)  {
		enterValue(username, user);
	 user1 = getAttribute(username);
		
		
		enterValue(password, pass);
	 pass1 = getAttribute(password);
	    clickButton(getLoginButton());
	}

//	public boolean verifyUserLogin(String expectUsername, String expectpassword) {
// boolean flag =false;
//		if(expectUsername.equals(usernname)&&expectpassword.equals(password1)){
// return true;
//	}
//return flag;
//}

	
	public boolean verifyUserLogin(String expectUsername, String expectpassword) {
		 boolean flag =false;
				if(expectUsername.equals(user1)&&expectpassword.equals(pass1)){
		 flag= true;
			}
		return flag;
		}
	
	}
