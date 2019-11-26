package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
import com.orangehrm.pages.Dashboard;
import com.orangehrm.pages.Login;
import com.orangehrm.pages.CreateUser;

public class CreateUserTestcases extends TestBase{
	
	Login login;
	Dashboard dashboard;
	CreateUser user;
	

	public CreateUserTestcases() {
		super();
	}
	
	@Test(priority=1)
	public void FirstAdduser() throws Exception {
		user.adminLinktab();
		user.usermanagementLink();
		user.userlinkclick();
		Thread.sleep(2000);
		user.addUserForm();
		Thread.sleep(2000);
		user.selectUserRole("ESS");
		user.employeName("John Smith");
		user.userName("qauser1");
		user.selectStatus("1");
		user.passwordField("abcd1234");
		user.confirmpasswordField("abcd1234");
		Thread.sleep(1000);
		user.saveButton();
}
	@Test(priority=2)
	public void SecondAddUser() throws Exception {
		user.adminLinktab();
		user.usermanagementLink();
		user.userlinkclick();
		Thread.sleep(2000);
		user.addUserForm();
		Thread.sleep(2000);
		user.selectUserRole("ESS");
		user.employeName("Robert Craig");
		user.userName("qauser2");
		user.selectStatus("1");
		user.passwordField("abcd1234");
		user.confirmpasswordField("abcd1234");
		user.saveButton();
}
	@BeforeMethod
	  public void setUp() {
	    initialization();
		login = new Login(); 
		dashboard = login.login(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
		dashboard = new Dashboard();
		user = new CreateUser();
	}
	
	
	@AfterMethod
	  public void tearDown() {
			driver.quit();
	  }


}
