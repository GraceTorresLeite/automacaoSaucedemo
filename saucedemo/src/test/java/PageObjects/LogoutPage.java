package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	
	private static WebDriver driver;
	
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 public WebElement logoutButton(){
		 return this.driver.findElement(By.xpath("//nav[@class='bm-item-list']"
		 		+ "/a[@id='logout_sidebar_link']"));
	 }
	 
	 public WebElement menuLogouButton() {
		 return this.driver.findElement(By.className("bm-burger-button"));

	 }
	 
	 public WebElement logoHomeImage() {
		 return this.driver.findElement(By.className("login_logo"));
	 }

}
