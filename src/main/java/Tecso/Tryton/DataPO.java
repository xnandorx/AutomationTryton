package Tecso.Tryton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataPO {
	private WebDriver driver;
	
	public DataPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public DataPO data(String name, String user, String pass, String email) {

	    driver.findElement(By.id("ui-id-5")).clear();
	    driver.findElement(By.id("ui-id-5")).sendKeys(name);
	    driver.findElement(By.id("ui-id-10")).clear();
	    driver.findElement(By.id("ui-id-10")).sendKeys(user);
	    driver.findElement(By.id("ui-id-13")).clear();
	    driver.findElement(By.id("ui-id-13")).sendKeys(pass);
	    driver.findElement(By.id("ui-id-16")).clear();
	    driver.findElement(By.id("ui-id-16")).sendKeys(email);
	    	    	    
	    return this;
		
	}
}