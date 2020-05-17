package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionarProdutoPage {
	
	private WebDriver driver;

	public SelecionarProdutoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement productLabel() {
		return this.driver.findElement(By.id("item_2_litle_link"));
	}
	
	
	public WebElement productCarLabel() {
		return this.driver.findElement(By.className("inventory_details_name"));
	}
	
	public WebElement addCarButton() {
		return this.driver.findElement(By.className("btn_primary btn_inventory"));
	}

}
