package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.TestBase;

public class Dashboard extends TestBase{

	
	@FindBy(id ="menu_dashboard_index")
	static WebElement dasboardlink ;
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
	
	public CreateUser clickOnDashboard () {
		dasboardlink.click();
		return new CreateUser();
	}
	
}
