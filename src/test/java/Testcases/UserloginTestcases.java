package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
import com.orangehrm.pages.Userlogin;

public class UserloginTestcases extends TestBase {
	
	Userlogin userlogin;
	
	public UserloginTestcases() {
		super();
	}
	
	@Test(priority=1)
	public void LoginUserOneWithPassword() throws InterruptedException {
	      userlogin.login(prop.getProperty("userOne"), prop.getProperty("password"));
	      Thread.sleep(2000);
	      userlogin.clickonLeaveMenu();
	      userlogin.clickonApplyLeave();
	      Thread.sleep(2000);

	      userlogin.selectonLeaveType("FMLA US");
	      Thread.sleep(2000);
	      userlogin.FromdateofLeave("2019-12-01");
	      userlogin.TodateofLeave("2019-12-05");
//	      userlogin.clickonDurationDropdoewn("Full Day");
	      userlogin.ApplyButton();
	      System.out.println("Apply button is clickable");
          Thread.sleep(8000);
          userlogin.LogoutButton();
	     
			}
	 

//	@Test(priority=2)
//	public void LoginSecondUserWithPassword() throws InterruptedException {
//  userlogin.login(prop.getProperty(""), prop.getProperty(""));
//    Thread.sleep(2000);
//    userlogin.clickonLeaveMenu();
//    userlogin.clickonApplyLeave();
//    Thread.sleep(2000);
//    
//    userlogin.selectonLeaveType("FMLA US");
//    Thread.sleep(2000);
//    userlogin.FromdateofLeave("2019-01-01");
//    userlogin.TodateofLeave("2019-01-10");
////    userlogin.clickonDurationDropdoewn("Full Day");
//    userlogin.ApplyButton();
//    Thread.sleep(5000);
////    userlogin.LogoutButton();
   
//		}
	
	@BeforeMethod
	  public void setUp() {
	    initialization();
		userlogin = new Userlogin(); 
	}
	
	
	@AfterMethod
	  public void tearDown() {
//			driver.quit();
	  }

	

}
