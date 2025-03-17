package pages;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.crypto.SecretKeyFactorySpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormPage extends Page {

	
	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	public String genderStr = "//label[text()='@param']";
	public By txtMobile = By.id("userNumber");
	public By txtDateOfBirth = By.id("dateOfBirthInput");
	public By txtSubjects = By.id("subjectsInput");
	public String hobbiesStr = "//*[text()='@param']";
	public By txtPicture = By.id("uploadPicture");
	public By txtCurrentAddress = By.id("currentAddress");
	public By txtSelectState = By.id("react-select-3-input");
	public By txtSelectCity = By.id("react-select-4-input");
	public By txtSubmit = By.id("submit");
	
	
	public PracticeFormPage(WebDriver dr) {
		super(dr);
		testBase.driver = dr;
	}
	
	public ThanksForSubmitting inputData(String firstName, String lastName, String email, String gender, String mobile, String dateOfBirth, String subjects, String hobbies, String picture, String currentAddress, String selectState, String selectCity) {
		testBase.zoomPage(0.7f);
		testBase.inputText(txtFirstName, firstName);
		testBase.inputText(txtLastName, lastName);
		testBase.inputText(txtEmail, email);
		testBase.clickRadioOrCheckbox(genderStr, gender);
		testBase.inputText(txtMobile, mobile);
		testBase.clickOnElements(txtDateOfBirth);
		inputDate(dateOfBirth);
		testBase.inputText(txtSubjects, subjects);
		testBase.inputText(txtSubjects, Keys.ENTER);
		testBase.clickOnCheckbox(hobbiesStr, hobbies);
		testBase.inputText(txtPicture, picture);
		testBase.scrollToEndPage();
		testBase.inputText(txtCurrentAddress, currentAddress);
		testBase.inputText(txtSelectState, selectState);
		testBase.inputText(txtSelectState, Keys.ENTER);
		testBase.inputText(txtSelectCity, selectCity);
		testBase.inputText(txtSelectCity, Keys.ENTER);
		testBase.clickOnElements(txtSubmit);
		return new ThanksForSubmitting(driver);
	}
	
	public void inputDate(String dateOfBirth) {
		
		String[] dateOfBirthArr = dateOfBirth.split(" ");
		WebElement selectYearEle = testBase.driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(selectYearEle);
		selectYear.selectByVisibleText(dateOfBirthArr[2]);

		WebElement selectMonthEle = testBase.driver
				.findElement(By.xpath("//*[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(selectMonthEle);
		selectMonth.selectByVisibleText(dateOfBirthArr[1]);

		testBase.driver.findElement(By.xpath("//div[text()='"+dateOfBirthArr[0]+"']")).click();
	}
	

}
