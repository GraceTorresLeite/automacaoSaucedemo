package Tasks;


import static java.lang.Thread.sleep;
import static Fw.Report.test;
import static Fw.Report.extent;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Fw.ScreenshotFw;
import PageObjects.LoginPage;

public class LoginTask {
	private  WebDriver driver; // complicou com o static, por isso foi tirado
	private  LoginPage login;  // complicou com o static, por isso foi tirado

	public LoginTask(WebDriver driver) {
		this.driver = driver;
		login = new LoginPage(this.driver);
	}

	public void realizarLogin() throws InterruptedException {

		login.userTextField().sendKeys("standard_user");
		login.passwordTextField().sendKeys("secret_sauce");
		login.loginButton().click();
		try {
			Thread.sleep(3000);  // pediu um try catch
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		validationHome();

	}

	public void validationHome() {

		try {

			String label = login.pageInicialLabel().getText();
			assertEquals(label, "Products");
			test.log(Status.PASS, "Pagina Home Carregada com Sucesso! ", ScreenshotFw.capture64(driver));
			
		} catch (Exception e) {
			
			test.log(Status.FAIL, e.getMessage(), ScreenshotFw.capture64(driver));
		}
	}
}
