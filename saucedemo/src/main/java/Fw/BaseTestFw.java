package Fw;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTestFw {

	private WebDriver driver;
	private String URL = "https://www.saucedemo.com/index.html";
	
	public WebDriver getDriver() {
		
		this.driver = DriverManagerFw.setDriver(DriverTypeFw.CHROME);
		return this.driver;
	}
	@Before
	public void setup() {
		//report.setExtent();
		getDriver().get(URL);
	}
	
	@After
	public void teardown() {
		//report.endReport();
		DriverManagerFw.quitDriver();
	}
}
