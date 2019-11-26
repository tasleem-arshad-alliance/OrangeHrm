package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.base.TestBase;

public class LeaveModule extends TestBase{
	
	// Leave Entitlement form 
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[3]/a/b")
	static WebElement Leavetab;

	@FindBy(id= "menu_leave_Entitlements")
	static WebElement leaveEntitlement ;
	
	@FindBy(id= "menu_leave_addLeaveEntitlement")
	static WebElement AddleaveEntitlement ;
	
//	//*[@id="entitlements_employee_empName"]   
	@FindBy(xpath= "//*[@id=\'entitlements_employee_empName\']")
	static WebElement EntempName;
	
	@FindBy(id= "entitlements_leave_type")
	static WebElement EntLeaveType ;
	//*[@id="period"]
	
	@FindBy(xpath= "//*[@id=\"period\"]/option[2]")
	static WebElement LeavePeriod ;
	
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input[1]")
	static WebElement EntitlementNo ;
	
	@FindBy(id= "btnSave")
	static WebElement SaveButton ;
	
//	     -----------------------------------------------------------------------------------------------------------

	// Assign Leave 
	
	@FindBy(id = "menu_leave_assignLeave")
	static WebElement assignLink;
	
	@FindBy(id = "assignleave_txtEmployee_empName")
	static WebElement EmployeeName;
	
	@FindBy(id = "assignleave_txtLeaveType")
	static WebElement LeaveType;
	
	@FindBy(id = "assignleave_txtFromDate")
	static WebElement assignFromDate;
	
	@FindBy(id = "assignleave_txtToDate")
	static WebElement assignToDate;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input")
	static WebElement assignButton;
	
//  ---------------------------------------------------------------------------------------------------------
	

	public LeaveModule() {
		PageFactory.initElements(driver, this);
	}
//  ----------------------------------------------------------------------------------------------------------------
	//Leave Entitlement
	
	public void clickonLeaveTab() {
		Leavetab.click();
	}
	
	public void clickOnLeaveEntitlementButton() {
		leaveEntitlement.click();
	}
	
	public void clickonAddLeaveEntitlementButton() {
		AddleaveEntitlement.click();
	}
	
	public void EntitlementName(String empName) {
		EntempName.sendKeys(empName);
	}
 
	public void EntitlementLeaveType(String LeaveType) { 
		EntLeaveType.sendKeys(LeaveType);
		Select LeVetPe= new Select(EntLeaveType);
				LeVetPe.selectByValue(LeaveType);			
	}
	
	public void EntLeavePeriod() {
		LeavePeriod.click();
		
	}

	public void EntitlementNo(String No) {
		EntitlementNo.sendKeys(No);
	}
	
	public void clickSaveButton() {
		SaveButton.click();	
	}
	
//            -------------------------------------------------------------------------------------------------------
//	Assign Leave
	
	public void clickonAssignLeave() {
		assignLink.click();
	}
	
	public void EmployeNme(String name) {
		EmployeeName.sendKeys(name);
	}
	
	public void SelectLeaveType(String TypeofLeave) {
		LeaveType.sendKeys(TypeofLeave);
		Select levetype= new Select (LeaveType);
		levetype.selectByValue(TypeofLeave);
	}
	
	public void Fromdate (String frmdate) {
		assignFromDate.clear();
		assignFromDate.sendKeys(frmdate);
	}
	
	public void ToDate (String todate) {
		assignToDate.clear();
		assignToDate.sendKeys(todate);
	}
	
	public void AssignButton () {
		assignButton.sendKeys();
		
		
	}
	
}
