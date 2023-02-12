package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class AddBookToCartTest extends TestBase{

	LoginPage loginPageOpject;
	HomePage homePageObject;
	CartPage cartPageObject;

	String SortKey=ReadProperties.data.getProperty("SortKey");
	String Country=ReadProperties.data.getProperty("Country");
	String City=ReadProperties.data.getProperty("City");
	String Address=ReadProperties.data.getProperty("Address");
	String PostalCode=ReadProperties.data.getProperty("postalCode");
	String PhoneNumber = ReadProperties.data.getProperty("phoneNumber");



	@Test(priority = 0)
	public void UserCanLogin() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		loginPageOpject = new LoginPage(driver);


		wait.until(ExpectedConditions.visibilityOf(loginPageOpject.emailField));
		loginPageOpject.setLoginEmail(Email);
		loginPageOpject.setLoginPassword(Password);
		loginPageOpject.clickonLoginBtn();




	}

	@Test(priority = 1,dependsOnMethods = "UserCanLogin")
	public void BuyBook() 
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		homePageObject = new HomePage(driver);
		wait.until(ExpectedConditions.visibilityOf(homePageObject.booksBtn));
		homePageObject.clickOnBooksBtn();
		homePageObject.setSortList(SortKey);

		wait.until(ExpectedConditions.visibilityOf(homePageObject.itemTitle));
		String Title=homePageObject.itemTitle.getText();
		System.out.println(Title);

		wait.until(ExpectedConditions.elementToBeClickable(homePageObject.addToCartBtn));
		driver.navigate().refresh();
		homePageObject.clickonAddToCartBtn();

		homePageObject.clickOnCartBtn();

		cartPageObject= new CartPage(driver);

		Assert.assertTrue(cartPageObject.productNameField.getText().equalsIgnoreCase(Title));
		cartPageObject.clickOnTermsCheckBox();
		cartPageObject.clickOnCheckOutBtn();

		cartPageObject.setBillingData(Country,City,Address,PostalCode,Address);

		cartPageObject.clickOnContinueBtn1();

		wait.until(ExpectedConditions.elementToBeClickable(cartPageObject.continueBtn2));
		cartPageObject.clickOnContinueBtn2();

		wait.until(ExpectedConditions.elementToBeClickable(cartPageObject.continueBtn3));
		cartPageObject.clickOnContinueBtn3();

		wait.until(ExpectedConditions.elementToBeClickable(cartPageObject.continueBtn4));
		cartPageObject.clickOnContinueBtn4();

		wait.until(ExpectedConditions.elementToBeClickable(cartPageObject.confirmBtn));
		cartPageObject.clickOnConfirmBtn();

		

	}
	
	



}
