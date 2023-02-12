package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.Helper;
import data.ReadProperties;
import pages.HomePage;
import pages.RegistrationPage;

public class RegisterNewAccountTest extends TestBase{
	
	HomePage homePageObject;
	RegistrationPage regPageObject;
	
	
	String FirstName=ReadProperties.data.getProperty("FirstName");
	String LastName=ReadProperties.data.getProperty("LastName");
	
	String Day="1";
	String Month="7";
	String Year="1997";
	String CompanyName =ReadProperties.data.getProperty("CompanyName");
	
	
	
	@Test
	public void registerNewAccount()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		homePageObject = new HomePage(driver);
		wait.until(ExpectedConditions.visibilityOf(homePageObject.registerBtn));
		homePageObject.clickOnRegisterBtn();
		
		regPageObject =new RegistrationPage(driver);
		wait.until(ExpectedConditions.visibilityOf(regPageObject.genderRadioBtn));
		regPageObject.clickOnGenderRadioBtn();
		
		regPageObject.setFirstName(FirstName);
		regPageObject.setLastName(LastName);
		regPageObject.SetDateOfBirth(Day,Month,Year);
		regPageObject.setEmail(Email);
		regPageObject.setCompanyName(CompanyName);
		regPageObject.setPassword(Password);
		regPageObject.cliclkOnRegisterBtn();
		
		wait.until(ExpectedConditions.visibilityOf(regPageObject.LoginBtn));
		regPageObject.clickOnLoginBtn();
		
		
	}

}
