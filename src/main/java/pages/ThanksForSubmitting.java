package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksForSubmitting extends Page {
	public String lbValue = "//td[text()='@param']/following-sibling::td";

	public ThanksForSubmitting(WebDriver dr) {
		super(dr);
	}

	public String getActualText(String xpath, String fieldName) {
		By valueElement = testBase.replaceXpath(xpath, fieldName);
		String actualResult = driver.findElement(valueElement).getText();
		return actualResult;
	}
}
