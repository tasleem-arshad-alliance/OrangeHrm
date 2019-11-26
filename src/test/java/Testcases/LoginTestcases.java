package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
import com.orangehrm.pages.Dashboard;
import com.orangehrm.pages.Login;
public class LoginTestcases extends TestBase{

	Login login; 
	Dashboard dashboard;
	 
		public LoginTestcases() {
			super();
		}
	
		
		@Test(priority=1)
			public void verifypageTittle() {
		String tittle = login.validateloginPageTittle();
		Assert.assertEquals(tittle, "OrangeHRM");
		}
		
		@Test(priority=2)
		public void verifyOrangehrmLogo() {
	   boolean logo=  login.validateLogo();
	   Assert.assertTrue(logo);
	}
		

		@Test(priority=3)
		public void verifyvalidUsernameAndPassword() throws InterruptedException {
		      dashboard = login.login(prop.getProperty("adminusername"), prop.getProperty("adminpassword"));
		      Thread.sleep(3000);
				}
		
		
		@BeforeMethod
		  public void setUp() {
		    initialization();
			login = new Login(); 
		}
		
		
		@AfterMethod
		  public void tearDown() {
				driver.quit();
		  }


}
