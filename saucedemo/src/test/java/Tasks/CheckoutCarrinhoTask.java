package Tasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import static Fw.Report.test;
import static Fw.Report.extent;
import Fw.ScreenshotFw;
import PageObjects.CheckoutCarrinhoPage;

public class CheckoutCarrinhoTask {

	private static WebDriver driver;
	private static CheckoutCarrinhoPage checkoutPage;

	public CheckoutCarrinhoTask(WebDriver driver) {
		// super;
		this.driver = driver;
		checkoutPage = new CheckoutCarrinhoPage(this.driver);
	}

	public void addCarrinho() throws InterruptedException {

		checkoutPage.carImage().click();
		Thread.sleep(2000);
		validationCar();
		checkoutPage.checkoutButton().click();
		validationCheckoutInfo();
		checkoutPage.firstNameTextField().sendKeys("Grace");
		checkoutPage.lastNameTextField().sendKeys("Torres");
		checkoutPage.postalCodeTextField().sendKeys("(51)983149202");
		Thread.sleep(2000);
		checkoutPage.continueButton().click();
		Thread.sleep(2000);
		validationCheckoutOverview();
	
		validationItemOverview();
	
		checkoutPage.finishButton().click();
		validationFinish();


	}

	public void validationCar() {
		try {
			String label = checkoutPage.carQuantidadeTextField().getText();
			assertEquals(label, "1");
			test.log(Status.PASS, "Validação do carrinho", ScreenshotFw.takeScreenshot(driver));
		} catch (Exception e) {
			test.log(Status.FAIL, "Não carregou Carrinho", ScreenshotFw.takeScreenshot(driver));
		}
	}

	public void validationCheckoutInfo() {
		try {
			String label = checkoutPage.subHeaderLabel().getText();
			assertEquals(label, "Checkout: Your Information");
			test.log(Status.PASS, "Pagina Checkout carregada", ScreenshotFw.takeScreenshot(driver));
		} catch (Exception e) {
			test.log(Status.FAIL, "não carregou página de checkout", ScreenshotFw.takeScreenshot(driver));
		}
	}

	public void validationCheckoutOverview() {
		try {
			String label = checkoutPage.subHeaderLabel().getText();
			assertEquals(label, "Checkout: Overview");
			test.log(Status.PASS, "Pagina checkout Overview carregado", ScreenshotFw.takeScreenshot(driver));
		} catch (Exception e) {
			test.log(Status.FAIL, "não carregou página de checkout Overview",
					ScreenshotFw.takeScreenshot(driver));
		}
	}

	public void validationItemOverview() {
		try {
			boolean item = checkoutPage.itemOverViewLabel().isDisplayed();
			assertTrue(item);
			test.log(Status.PASS, "Pagina checkout Item Overview carregado",
					ScreenshotFw.takeScreenshot(driver));
		} catch (Exception e) {
			test.log(Status.FAIL, "não carregou página de checkout Overview Item ",
					ScreenshotFw.takeScreenshot(driver));
		}
	}

	public void validationFinish() {
		try {
			String label = checkoutPage.finishTextLabel().getText();
			assertEquals(label,
					"Your order has been dispatched, " 
			+ "and will arrive just as fast as the pony can get there!");
			test.log(Status.PASS, "Pedido realizado com sucesso",
					ScreenshotFw.takeScreenshot(driver));
		} catch (Exception e) {
			test.log(Status.FAIL, "Não foi realizado o pedido",
					ScreenshotFw.takeScreenshot(driver));
		}

	}

}
