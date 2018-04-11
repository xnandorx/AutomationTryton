package Tecso.Tryton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserPO {
	private WebDriver driver;
	
	public UserPO(WebDriver driver) {
		this.driver = driver;
	} 
	
	public DataPO user() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement administracion = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[6]/td[1]/table/tbody/tr/td[1]"));
	    wait.until(ExpectedConditions.elementToBeClickable(administracion));
		administracion.click();
		
		WebElement usuarioUno = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[13]/td[1]/table/tbody/tr/td[1]"));
	    wait.until(ExpectedConditions.elementToBeClickable(usuarioUno));
		usuarioUno.click();
		
		WebElement usuarioDos = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[15]/td[1]/table/tbody/tr/td[2]/img"));
	    wait.until(ExpectedConditions.elementToBeClickable(usuarioDos));
	    usuarioDos.click();
	    
	    WebElement newMenu = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/nav/div/div[2]/ul/li[1]"));
	    wait.until(ExpectedConditions.elementToBeClickable(newMenu));
		newMenu.click();
	    driver.findElement(By.linkText("Nuevo")).click();
	    
		return new DataPO(driver);
	}
	
}

