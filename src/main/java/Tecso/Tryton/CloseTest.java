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
	    driver.findElement(By.linkText("Cerrar sesión")).click();
	return this;
	}
	
}
