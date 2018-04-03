package Tecso.Tryton;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CloseTest {
	WebDriver driver;
	
	public  CloseTest (WebDriver driver) {
		this.driver = driver;
	}
	
	public CloseTest close() {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
	    driver.findElement(By.xpath("//li[@id='nav-tab-1']/a/button/span")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[45]")).click();
	    driver.findElement(By.xpath("//div[@id='menu']/div[2]/div/table/tbody/tr[13]/td/table/tbody/tr/td/span")).click();
	    driver.findElement(By.xpath("//div[@id='menu']/div[2]/div/table/tbody/tr[6]/td/table/tbody/tr/td/span")).click();
	    */
	    driver.findElement(By.linkText("Cerrar sesión")).click();
		
		
		
		/*
		WebElement usuario = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li/a/button"));
	    wait.until(ExpectedConditions.elementToBeClickable(usuario));
	    usuario.click();
		
	    WebElement usuarioMenu = driver.findElement(By.xpath("/html/body/div[4]/div/form/div[2]/button[2]"));
	    wait.until(ExpectedConditions.elementToBeClickable(usuarioMenu));
	    usuarioMenu.click();
		
	    WebElement administracion = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[6]/td[1]/table/tbody/tr/td[1]"));
	    wait.until(ExpectedConditions.elementToBeClickable(administracion));
	    administracion.click();
	    
	    WebElement closeSesion = driver.findElement(By.id("user-logout"));
	    wait.until(ExpectedConditions.elementToBeClickable(closeSesion));
	    closeSesion.click();
	    */
		
		return this;
	}

	private Object function() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
