package Tecso.Tryton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataPO {
	private WebDriver driver;
	
	public DataPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public DataPO data(String name, String user, String pass, String email) {

		/*
		WebElement nombre = driver.findElement(By.id("ui-id-5"));
	    //nombre.clear();
	    nombre.sendKeys(name);
	    
	    WebElement usuario = driver.findElement(By.id("ui-id-10"));
	    usuario.clear();
	    usuario.sendKeys(user);
	    
	    WebElement passw = driver.findElement(By.id("ui-id-13"));
	    //passw.clear();
	    passw.sendKeys(pass);
	    
	    WebElement mail = driver.findElement(By.id("ui-id-16"));
	    mail.clear();
	    mail.sendKeys(email);
	    */
	    
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
