package Tecso.Tryton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPO {
		private WebDriver driver;
		private String texto;
		
	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public UserPO login(String user, String pass) {
		texto = "Test - ASOR_DEV [Peso argentino]";
		WebElement database = driver.findElement(By.id("login-database"));
		
		//Login
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
		
		
	    //Print Status
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"user-preferences\"]/a")));
		String currentMessage = driver.findElement(By.id("user-preferences")).getText();
				
		if (currentMessage.equals(texto)) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login No Successful");		
			}
		
	    return new UserPO (driver);
	}
	
	public ModifyUserPO loginAddUser (String user, String pass) {
		texto = "Test - ASOR_DEV [Peso argentino]";
		WebElement database = driver.findElement(By.id("login-database"));
		
		//Login
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
		
	    //Print Status
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"user-preferences\"]/a")));
		String currentMessage = driver.findElement(By.id("user-preferences")).getText();
		System.out.println(currentMessage);
		
		if (currentMessage.equals(texto)) {
			System.out.println("Login Successful");
		}else {
				System.out.println("Login No Successful");		
			}
	    
	    return new ModifyUserPO (driver);
	}
	
	
	
}