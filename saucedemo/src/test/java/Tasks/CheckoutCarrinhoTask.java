package Tasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutCarrinhoPage;

public class CheckoutCarrinhoTask {
	
	private static WebDriver driver;
	private static CheckoutCarrinhoPage checkoutPage;
	
	
	public CheckoutCarrinhoTask(WebDriver driver){
		//super;
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
	        checkoutPage.menuLogouButton().click();
	        Thread.sleep(2000);
	        checkoutPage.logoutButton().click();
	        Thread.sleep(3000);
	        validationLogout();

	    }
	 
	 public void validationCar() {
		 String label = checkoutPage.carQuantidadeTextField().getText();
		 assertEquals(label, "1");
	 }
	 
	 public void validationCheckoutInfo(){
		 String label = checkoutPage.subHeaderLabel().getText();
	        assertEquals(label, "Checkout: Your Information");
	 }
	 
	 public void validationCheckoutOverview(){
		 String label = checkoutPage.subHeaderLabel().getText();
	        assertEquals(label, "Checkout: Overview");
	 }
	 
	 public void validationItemOverview(){
		 boolean item = checkoutPage.itemOverViewLabel().isDisplayed();
	        assertTrue(item);
	 }
	 
	 public void validationFinish(){
		 String label = checkoutPage.finishTextLabel().getText();
	        assertEquals(label, "Your order has been dispatched, "
	        		+ "and will arrive just as fast as the pony can get there!");
	 }
	 
	 public void validationLogout(){
		 boolean logo = checkoutPage.logoHomeImage().isDisplayed();
	        assertTrue(logo);
	 }


}
