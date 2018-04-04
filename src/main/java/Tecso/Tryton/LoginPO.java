package Tecso.Tryton;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPO {
		private WebDriver driver;

		
	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public UserPO login(String user, String pass) {
		
		WebElement database = driver.findElement(By.id("login-database"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(database));
	    new Select(driver.findElement(By.id("login-database"))).selectByVisibleText("asor_test");
	    driver.findElement(By.id("login-database")).click();
	    driver.findElement(By.id("login-login")).click();
	    driver.findElement(By.id("login-login")).clear();
	    driver.findElement(By.id("login-login")).sendKeys("Automation");
	    driver.findElement(By.id("login-password")).clear();
	    driver.findElement(By.id("login-password")).sendKeys("tryton");
	    driver.findElement(By.id("login-password")).sendKeys(Keys.ENTER);
		
	    boolean present;
	    try {
	       driver.findElement(By.id("user-preferences"));
	       present = true;
	    } catch (NoSuchElementException e) {
	       present = false;
	    }
	    
	    if (present = true) {
	    	System.out.println("Test testLogin Salteño Succesfull");
	    }else {
	    	System.out.println("Test testLogin FAIL");
	    }
	    
		return new UserPO (driver);
	}
	

	
}