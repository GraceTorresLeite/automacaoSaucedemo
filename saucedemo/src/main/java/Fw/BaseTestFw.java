package Fw;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static Fw.Report.endReport;
import static Fw.Report.setExtent;


public class BaseTestFw {

	private WebDriver driver;
	private String URL = "https://www.saucedemo.com/index.html";
	
	public WebDriver getDriver() {
		
		this.driver = DriverManagerFw.setDriver(DriverTypeFw.CHROME);
		return this.driver;
	}
	@Before
	public void setup() {
		setExtent();
		getDriver().get(URL);
	}
	
	@After
	public void teardown() {
		endReport();
		DriverManagerFw.quitDriver();
	}
}
