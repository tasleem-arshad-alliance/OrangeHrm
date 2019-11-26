package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
import com.orangehrm.pages.Dashboard;
import com.orangehrm.pages.LeaveModule;
import com.orangehrm.pages.Login;
import com.orangehrm.pages.CreateUser;

public class LeaveModuleTestcases extends TestBase {
	
	Login login;
	Dashboard dashboard;
	CreateUser user;
	LeaveModule leave;
	

	public LeaveModuleTestcases() {
		super();
	}
	
	@Test(priority=1)
	public void AddLeaveEntitlementAndAssignLeave() throws Exception {
		leave.clickonLeaveTab();
		leave.clickOnLeaveEntitlementButton();
		leave.clickonAddLeaveEntitlementButton();
		Thread.sleep(1000);
		leave.EntitlementName("John Smith");
		leave.EntitlementLeaveType("1");
		leave.EntLeavePeriod();
		leave.EntitlementNo("10");
		leave.clickSaveButton();
		
        Thread.sleep(3000);
        
	    	leave.clickonAssignLeave();
	    	leave.EmployeNme("John Smith");
	    	leave.SelectLeaveType("1");
	        leave.Fromdate("2019-11-25");
	    	leave.ToDate("2019-11-30");
	     	leave.AssignButton();
   }
	
	
	@BeforeMethod
	  public void setUp() {
		initialization();
		login = new Login(); 
		dashboard = login.login(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
		dashboard = new Dashboard();
		leave = new LeaveModule();
	}
	
	@AfterMethod
	  public void tearDown() {
//		driver.quit();
	  }

}
