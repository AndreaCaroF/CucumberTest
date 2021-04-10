package pageObject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidatesData extends SetValues {

	public ValidatesData() {

	}

	public static WebElement tbl_data1(String label) {
		return driver.findElement(By.xpath("//div/h6[contains(text(), \"Producto\")]//following::div[\" + label +\"]"));
	}

	public static HashMap<String, Object> shareData;

	/**
	 * Closes browser
	 */
	public void closeBrowser() {
		driver.close();
	}

	/*
	 * Validates value tables in the pages
	 */
//	public static WebElement getCellByColumn(String value, String name) {
//		try {
//			int column = 1;
//			String label = "";
//			for (WebElement header : driver.findElement(By.xpath("//div/h6[contains(text(), \"Producto\")]//following::div[\" + label +\"]")) {
//				if (header.getText().equals(name)) {
//					break;
//				}
//				column++;
//			}
//			return tbl_data1(label);
//		}catch (Exception | AssertionError e)
//	{
//
//	}
//}
}
