package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	
	public WebElement userTextField() {
//		WebElement userTextField = this.driver.findElement(By.id("user-name"));
//		return userTextField;
		return this.driver.findElement(By.id("user-name"));
		
	}
	
	public WebElement passwordTextField() {
		return this.driver.findElement(By.id("password"));
	}
	public WebElement loginButton() {
		return this.driver.findElement(By.className("btn_action"));
	}
	public WebElement pageInicialLabel() {
		return this.driver.findElement(By.className("product_label"));
	}
	
}
