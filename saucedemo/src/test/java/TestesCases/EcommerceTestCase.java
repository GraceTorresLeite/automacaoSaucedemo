package TestesCases;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Fw.BaseTestFw;
import Tasks.LoginTask;
import Tasks.SelecionarProdutoTask;

public class EcommerceTestCase extends BaseTestFw {
	
	private WebDriver driver = this.getDriver();
	

	@Test
	public void realizarCompra() throws InterruptedException{
		
		LoginTask login = new LoginTask(driver);
		SelecionarProdutoTask produto = new SelecionarProdutoTask(driver);
		
		login.realizarLogin();
		login.validationHome();
		produto.SelecionarProduto();
	}
}
