package tests;

//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.TestBase;

public class TestCase {
	TestBase testBase = new TestBase();

	@BeforeTest
	public void openWeb() {
		testBase.openBrowser2("https://demoqa.com/");
	}

//	@AfterTest
	public void closeWeb() {
		testBase.driver.quit();
	}
}
