package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PracticeFormPage;
import pages.ThanksForSubmitting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormTest extends TestCase {
	@Test
	public void submitDataSuccessfully() {
		String firstName = "Minh Anh";
		String lastName = "Vu";
		String email = "abencd@gmail.com";
		String gender = "Male";
		String mobile = "0129382011";
		String dateOfBirth = "17 March 1999";
		String subjects = "Maths";
		String hobbies = "Reading, Sports";
		String picture = System.getProperty("user.dir")+"\\testdata\\picture1.jpg";
		String currentAddress = "123 Xa Dan";
		String selectState = "NCR";
		String selectCity = "Noida";

//		testBase.driver.get("https://demoqa.com/automation-practice-form");
		PracticeFormPage practiceFormPage = new PracticeFormPage(testBase.driver);
		practiceFormPage.goToPracticeFormPage();
		ThanksForSubmitting thanksForSubmitting = practiceFormPage.inputData(firstName, lastName, email, gender,mobile, dateOfBirth, subjects, hobbies, picture, currentAddress, selectState, selectCity);
		Assert.assertEquals(thanksForSubmitting.getActualText(thanksForSubmitting.lbValue,"Student Name"), firstName + " " + lastName);
	}

}
