package Tecso.Tryton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifyUserPO {
	private WebDriver driver;
	
	public ModifyUserPO(WebDriver driver) {
		this.driver = driver;
	}

	public ModifyUserPO modifyUser() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String nombre = "Automation";
		
		WebElement administracion = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[6]/td[1]/table/tbody/tr/td[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(administracion));
		administracion.click();
		
		WebElement usuarioUno = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[13]/td[1]/table/tbody/tr/td[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(usuarioUno));
		usuarioUno.click();
		
		WebElement usuarioDos = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/table/tbody/tr[15]/td[1]/table/tbody/tr/td[2]/img"));
		wait.until(ExpectedConditions.elementToBeClickable(usuarioDos));
		usuarioDos.click();
		
				
		WebElement buscarUser = driver.findElement(By.xpath("//div[@id='tab-1']/div/div[3]/form/div/div/div/input"));
		wait.until(ExpectedConditions.elementToBeClickable(buscarUser));
		buscarUser.click();
		buscarUser.clear();
		buscarUser.sendKeys("Automation");
		buscarUser.sendKeys(Keys.ENTER);
	    
		driver.findElement(By.xpath("//a[@id='switch']/span[2]")).click();
		WebElement confirmacion = driver.findElement(By.id("ui-id-53"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("ui-id-53")));
		if (!confirmacion.getText().contains("Automation")){
			System.out.println("Hubo un error");
			}else {
			System.out.println("Registro completado!");
		}
		
    return this;
	
	}
}
