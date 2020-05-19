package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCarrinhoPage {
	
	private WebDriver driver;

	public CheckoutCarrinhoPage(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	
	public WebElement carImage() {
		return this.driver.findElement(By.xpath("//div[@id='shopping_cart_container']"
				+ "/a[@class='shopping_cart_link fa-layers fa-fw']"));
	}
	
	public WebElement carQuantidadeTextField() {
		return this.driver.findElement(By.className("cart_quantity"));
		
	}
	
	public WebElement checkoutButton() {
		return this.driver.findElement(By.xpath("//div[@class='cart_footer']"
				+ "/a[@class='btn_action checkout_button']"));
	}

	public WebElement subHeaderLabel() {
		return this.driver.findElement(By.className("subheader"));

	}
	
	public WebElement firstNameTextField() {
		return this.driver.findElement(By.id("first-name"));
	}
	
	public WebElement lastNameTextField() {
		return this.driver.findElement(By.id("last-name"));
	}
	
	public WebElement postalCodeTextField() {
		return this.driver.findElement(By.id("postal-code"));
	}
	
	public WebElement continueButton() {
		return this.driver.findElement(By.xpath("//div[@class='checkout_buttons']"
				+ "/input[@class='btn_primary cart_button']"));
	}
	
	public WebElement itemOverViewLabel() {
		return this.driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	}
	
	public WebElement finishButton(){
		return this.driver.findElement(By.xpath("//div[@class='cart_footer']"
				+ "/a[@class='btn_action cart_button']"));
	}
	
	public WebElement finishTextLabel() {
		return this.driver.findElement(By.xpath("//div[@class='complete-text']"));
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
