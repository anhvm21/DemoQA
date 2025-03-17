package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public WebDriver driver;
	public ChromeOptions options;
//	= getDefaultChromeOptions();

	public void openBrowser1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\01AutomationClass\\02Practices\\DemoQA\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openBrowser2(String url) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get(url);
	}
	
	public void inputText(By locator, CharSequence... value) {
		driver.findElement(locator).sendKeys(value);
	}
	
	public By replaceXpath(String originalXpath, String value) {
		By result = null;
		String newStr = originalXpath.replace("@param", value);
		result = By.xpath(newStr);
		return result;
	}
	
	public void clickRadioOrCheckbox(String originalXpath, String value) {
		By locator = replaceXpath(originalXpath, value);
		driver.findElement(locator).click();
	}
	
	public void clickOnElements(By locator) {
		driver.findElement(locator).click();
	}
	
	public void clickOnCheckbox(String checkBoxStr, String checkBoxOptions) {
		String[] optionsList = checkBoxOptions.split(",");
		for(int i=0; i<optionsList.length; i++) {
			clickRadioOrCheckbox(checkBoxStr, optionsList[i].trim());
		}
	}	
	
	public void zoomPage(float screenSize) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.body.style.zoom = '"+screenSize+"'");
	}
	
	public void scrollToEndPage() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
