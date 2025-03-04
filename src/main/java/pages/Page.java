package pages;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page {
 TestBase testBase = new TestBase();
 
 public WebDriver driver;

public Page(WebDriver dr) {
	this.driver = dr;
}


 
}
