package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AutomationTextBoxTest extends TestCase {
//	@Test
	public void submitSuccessfully() {
		String fullName = "Minh Anh Vu";
		String email = "abencd@gmail.com";
		String currentAddress = "175 Lê Duẩn";
		String permanentAddress = "123 Khâm Thiên";

//		testBase.driver.get("https://demoqa.com/text-box");
//		testBase.options.addArguments("--start-maximized");
		testBase.driver.findElement(By.id("userName")).sendKeys(fullName);
		testBase.driver.findElement(By.id("userEmail")).sendKeys(email);
		testBase.driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
		testBase.driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);

		testBase.driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	}
}
