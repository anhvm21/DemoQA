package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AutomationCheckBoxTest extends TestCase {
	@Test
	public void verifyCheckBoxCorrectly() {

		testBase.driver.get("https://demoqa.com/checkbox");
		testBase.driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();

	}
}
