package Tasks;

import static org.junit.Assert.assertTrue;
import static Fw.Report.test;
import static Fw.Report.extent;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Fw.ScreenshotFw;
import PageObjects.LogoutPage;

public class LogoutTask {
	
	private static WebDriver driver;
	private static LogoutPage logout;
	
	public LogoutTask(WebDriver driver) {
		this.driver = driver;
		logout = new LogoutPage(this.driver);
	}
	
	 public void realizaLogout() throws InterruptedException {
		 
	 logout.menuLogouButton().click();
     Thread.sleep(2000);
     logout.logoutButton().click();
     Thread.sleep(3000);
     validationLogout();
     
	 }
	
	 public void validationLogout(){
		 try{

	            boolean logo = logout.logoHomeImage().isDisplayed();
	            assertTrue(logo);
	            test.log(Status.PASS, "Logout realizado com Sucesso!", ScreenshotFw.takeScreenshot(driver));


	    }catch (Exception e){

	            test.log(Status.FAIL, "Logour não realizado", ScreenshotFw.takeScreenshot(driver));
	        }
	 }

}
