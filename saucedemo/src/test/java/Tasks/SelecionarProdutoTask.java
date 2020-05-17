package Tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import PageObjects.SelecionarProdutoPage;

public class SelecionarProdutoTask {
	
	private static WebDriver driver;
	private static SelecionarProdutoPage produtoPage;
	
	public SelecionarProdutoTask(WebDriver driver) {
		this.driver = driver;
		produtoPage = new SelecionarProdutoPage(driver);
	}
	
	public void SelecionarProduto() {
		produtoPage.productLabel().click();
		produtoPage.productCarLabel().click();
		validationProduto();
		produtoPage.addCarButton().click();
	}
	
	public void validationProduto() {
		
		String label = produtoPage.productLabel().getText();
		assertEquals(label, "Sauce Labs Onesie");
	}
}
