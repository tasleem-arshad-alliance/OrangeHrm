package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.base.TestBase;

public class Userlogin extends TestBase{
	
	@FindBy(id= "txtUsername")
	 WebElement username;
	
	@FindBy(id= "txtPassword")
	 WebElement password;
	
	@FindBy (id= "btnLogin")
	static WebElement Login;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[3]/div[1]/img") 
	WebElement orangehrmLogo;
	
	//-----------------------------------------------------------------------------------------------------------
	//Leave apply 
	
	@FindBy(id= "menu_leave_viewLeaveModule")
	WebElement leaveMenu;
	
	@FindBy(id= "menu_leave_applyLeave")
	WebElement applyLeave;
//	//*[@id="applyleave_txtLeaveType"]
	@FindBy(xpath= "//*[@id=\"applyleave_txtLeaveType\"]")
	WebElement LeaveType;
	
	@FindBy(id= "applyleave_txtFromDate")
	WebElement FromDate;
	
	@FindBy(id= "applyleave_txtToDate")
	WebElement ToDate;
	
	@FindBy(id= "applyleave_duration_duration")
	WebElement Duration;
	
	@FindBy(id= "applyBtn")
	WebElement ApplyButn; 
	
	// ------------------------------------------------------------------------------------------------------
	
	public Userlogin () {
		PageFactory.initElements(driver, this);
	}
	
	// ----------------------------------------------------------------------------------------------------------
	public void login (String uName, String Upsword) {
	username.sendKeys(uName);	
	password.sendKeys(Upsword);
	Login.click();
}
//	-----------------------------------------------------------------------------------------------------------
	
	// Apply Leave 
	
	public void clickonLeaveMenu () {
		leaveMenu.click();	
	}
	
	public void clickonApplyLeave () {
		applyLeave.click();	
	}
	
	public void selectonLeaveType (String Lvetype) {
		LeaveType.sendKeys();	
//		Select Typeofleave= new Select (LeaveType);
//		Typeofleave.selectByVisibleText(Lvetype);
	}
	
	public void FromdateofLeave (String frmdte) {
		FromDate.sendKeys();	
	}
	
	public void TodateofLeave (String todte) {
		ToDate.sendKeys();
	}
	
	public void clickonDurationDropdoewn (String durtion) {
		Duration.sendKeys();	
		Select durationDropdown = new Select (Duration);
		durationDropdown.selectByValue(durtion);
	}
	
	public void ApplyButton () {
		ApplyButn.click();	
	}
}
