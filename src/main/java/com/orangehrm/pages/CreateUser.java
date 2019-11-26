package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.base.TestBase;

public class CreateUser extends TestBase {
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/a/b")
	static WebElement Admintab;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
	static WebElement usermanagementtab;
	
	@FindBy(xpath= "/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/ul/li/a")
      static WebElement userlink;
	
	@FindBy(name ="btnAdd")
	static WebElement adduser;
	 
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/select")
	static WebElement userrole;
//	/html/body/div[4]/ul/li
	
	@FindBy(xpath ="/html/body/div[4]/ul/li")
	static WebElement emplyeename;
	
	@FindBy(id = "systemUser_userName")
	static WebElement username;
	
	@FindBy(name = "systemUser[status]")
	static WebElement status;
	
	@FindBy(name = "systemUser[password]")
	static WebElement password;
	
	@FindBy(name = "systemUser[confirmPassword]")
	static WebElement confirmpassword;
	
	@FindBy(name ="btnSave")
	static WebElement saveBtn;
	
	
	public CreateUser() {
		PageFactory.initElements(driver, this);
	}
	
	public  void adminLinktab() {
		Admintab.click();
	}
	
	public  void usermanagementLink() {
		usermanagementtab.click();
	}
	
	public  void userlinkclick() {
		userlink.click();
	}
	
	public  void addUserForm() {
		adduser.click();
	}
	
	public  void selectUserRole(String userRole) {
		userrole.sendKeys(userRole);
		Select role = new Select(userrole);
	     role.selectByVisibleText(userRole);     
	}
	
	public  void employeName(String EmpName) {
		 emplyeename.sendKeys(EmpName);
	}
	
	public  void userName(String userName) {
		username.sendKeys(userName);
	}
	
	public void selectStatus(String userstatus) {
		status.sendKeys(userstatus);
		Select statuss = new Select(status);
	     statuss.selectByValue(userstatus);
	}
	
	public void passwordField(String paswrd) {
		password.sendKeys(paswrd);
	}
	
	public  void confirmpasswordField(String confrmpaswrd) {
		confirmpassword.sendKeys(confrmpaswrd);
	}
	
	public LeaveModule saveButton() {
		saveBtn.click();
		
		return new LeaveModule();
	}
	
}
