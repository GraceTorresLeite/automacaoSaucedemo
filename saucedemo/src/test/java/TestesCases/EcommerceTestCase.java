package TestesCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Fw.BaseTestFw;
import Fw.ScreenshotFw;
import Tasks.CheckoutCarrinhoTask;
import Tasks.LoginTask;
import Tasks.SelecionarProdutoTask;
import static Fw.Report.test;
import static Fw.Report.extent;

public class EcommerceTestCase extends BaseTestFw {

	private WebDriver driver = this.getDriver();

	@Test
	public void realizarCompra() throws InterruptedException {

		LoginTask login = new LoginTask(driver);
		SelecionarProdutoTask produto = new SelecionarProdutoTask(driver);
		CheckoutCarrinhoTask checkoout = new CheckoutCarrinhoTask(driver);

		try {

			test = extent.createTest("Compra com Sucesso");

			login.realizarLogin();
			login.validationHome();
			produto.SelecionarProduto();

		} catch (Exception e) {

			test.log(Status.ERROR, e.getMessage(), ScreenshotFw.takeScreenshot(driver));

		}
	}
}
