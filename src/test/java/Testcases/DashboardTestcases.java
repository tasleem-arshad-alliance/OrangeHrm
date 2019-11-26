package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
import com.orangehrm.pages.Dashboard;
import com.orangehrm.pages.Login;

public class DashboardTestcases extends TestBase {
	
	Login login;
	Dashboard dashboard;
	
	public DashboardTestcases () {
		super();
	}
	
	
	@Test(priority=1)
	public void verifyclickOnDashboard() {
		dashboard.clickOnDashboard();
}
	
	@BeforeMethod
	  public void setUp() {
	    initialization();
		login = new Login(); 
		dashboard = login.login(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
		dashboard = new Dashboard();
	}
	
	
	@AfterMethod
	  public void tearDown() {
			driver.quit();
	  }



}
