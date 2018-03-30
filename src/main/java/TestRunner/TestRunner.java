package TestRunner;

import Tecso.Tryton.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestRunner {
	private WebDriver driver;
	private LoginPO loginPage;
	private CloseTest closeTest;


	@Test 
	public void testLoginTrytonDemo() {
		loginPage = new LoginPO (driver);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		closeTest = new CloseTest(driver);
		
		loginPage
			.login("Automation", "tryton")
			.user()
			.data("Fernando","Auto", "tryton123", "fernando@gmail.com");
		
		closeTest
			.close();
	}

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/home/usuario/eclipse/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://rosario.tecso.coop:8000");
	}
	
	@After
	public void teardDown() {
		//driver.quit();
	}
	
}
