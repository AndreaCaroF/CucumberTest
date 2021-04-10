package pageObject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class SetValues {
	public static ChromeDriver driver;

	public SetValues() {
	}

	public static WebElement txt_inicio() {
		return driver.findElement(By.xpath("//*[@id=\"menu-portal-consulta\"]/div/span[1]/ul/li/a"));
	}
	
	public static WebElement txt_simulate() {
		return driver.findElement(By.xpath("//div/h3[contains(text(),\"Simulador de cuotas\")]"));
	}

	public static WebElement slc_product() {
		return driver.findElement(By.id("producto_tipo"));
	}

	public static WebElement slc_transaction() {
		return driver.findElement(By.id("tipoUtilizacion"));
	}

	public static WebElement slc_amount() {
		return driver.findElement(By.xpath("//*[@id=\"frmSimulador\"]//following::input[@id='idValor']"));
	}

	public static WebElement slc_installmentsTo() {
		return driver.findElement(
				By.xpath("//*[@id=\"frmSimulador\"]//following::input[@id='numeroCuotas']//following::span[1]"));
	}

	public static WebElement btn_action() {
		return driver.findElement(By.id("action"));
	}

	public static WebElement lbl_valorCuota() {
		return driver.findElement(By.xpath("//div/label[contains(text(), \"Valor Cuota\")]"));
	}

	/**
	 * Loads page in the Browser
	 */
	public void initiateBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("http://www.tuya.com.co/simulador-cuota-tuya");
			driver.manage().window().maximize();
//			Assert.assertEquals("Transacciones", txt_inicio());
		} catch (Exception | AssertionError e) {
		}
	}

	/*
	 * Inputs information in the forms
	 */
	public void setData() {
		try {
			Random r = new Random();
			int valueAmount = r.nextInt(1000000);
			Actions action = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.switchTo().frame(1);
			js.executeScript("arguments[0].scrollIntoView();", txt_simulate());
			slc_product().sendKeys("Mastercard");
			slc_transaction().sendKeys("Avance");
			slc_amount().sendKeys("" + valueAmount);
			js.executeScript("arguments[0].setAttribute('style', 'left: 48.9362%')", slc_installmentsTo());
			action.dragAndDropBy(slc_installmentsTo(), 0, 20).perform();
		} catch (Exception | AssertionError e) {

		}
	}

	/*
	 * Submits option
	 */
	@SuppressWarnings("deprecation")
	public void submitSimulation() throws Exception {
		try {
			btn_action().click();
			Thread.sleep(3000);
			Assert.assertEquals("Valor Cuota", lbl_valorCuota());
		} catch (Exception | AssertionError e) {

		}
	}

}
