package TestRunner;

import Tecso.Tryton.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRunner {
	private WebDriver driver;
	private LoginPO loginPage;
	private CloseTest closeTest;

	@Test 
	public void testLogin() {
		loginPage = new LoginPO (driver);
		closeTest = new CloseTest (driver);
		//Test
		loginPage
			.login("Automation", "tryton");
	}

	@Test
	public void addUser() {
		loginPage = new LoginPO (driver);
		closeTest = new CloseTest (driver);
		//Test
		loginPage
			.login("Automation", "tryton")
			.user() //Navigation
			.data("Fernando","Auto", "tryton123", "fernando@gmail.com"); //Test Data
	}
	
	@Test 
	public void modifyUser() {
		loginPage = new LoginPO (driver);
		closeTest = new CloseTest (driver);
		//Test
		loginPage
			.loginAddUser("Automation", "tryton") //Login
			.modifyUser(); //CheckUser Created
	}

	@Before
	public void setUp() {
		/*
		System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		*/
		
		System.setProperty("webdriver.gecko.driver", "c:\\ChromeDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://rosario.tecso.coop:8000");
	}
	
	@After
	public void teardDown() {
		closeTest
		.close();
		driver.quit();
	}
	
}
