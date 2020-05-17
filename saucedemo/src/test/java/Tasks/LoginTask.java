package Tasks;

import static org.junit.Assert.assertEquals;
import static java.lang.Thread.sleep;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class LoginTask {
	private static WebDriver driver;
	private static LoginPage login;
	
	public LoginTask(WebDriver driver) {
		this.driver = driver;
		login = new LoginPage(this.driver);
	}

	public void realizarLogin() {
		
		login.userTextField().sendKeys("standard_user");
		login.passwordTextField().sendKeys("secret_sauce");
		login.loginButton().click();
		sleep(3000);
	
		validationHome();
		
	}
	
	public void validationHome() {
		String label = login.pageInicialLabel().getText();
		assertEquals(label,"Products");
	}
}
