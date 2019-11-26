package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.TestBase;

public class Login extends TestBase {
	
	@FindBy(id= "txtUsername")
	static WebElement username;
	
	@FindBy(id= "txtPassword")
	static WebElement password;
	
	@FindBy (id= "btnLogin")
	static WebElement Login;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[3]/div[1]/img") 
	WebElement orangehrmLogo;
	
	public Login () {
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginPageTittle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return orangehrmLogo.isDisplayed();
	}
	public Dashboard login (String un, String psword) {
	username.sendKeys(un);	
	password.sendKeys(psword);
	Login.click();
	
	return new Dashboard();
	}

}
