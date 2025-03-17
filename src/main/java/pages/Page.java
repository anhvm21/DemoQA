package pages;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page {
public TestBase testBase = new TestBase(); 
WebDriver driver;
//PracticeFormPage practiceFormPage;

public Page(WebDriver dr) {
	this.driver = dr;
	testBase.driver = dr;
}

public PracticeFormPage goToPracticeFormPage() {
driver.navigate().to("https://demoqa.com/automation-practice-form");
return new PracticeFormPage(driver);
}

}
