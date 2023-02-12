package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends PageBase{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="gender-male")
	public WebElement genderRadioBtn;
	
	@FindBy(id="FirstName")
	public WebElement firstNameField;
	
	@FindBy(id="LastName")
	public WebElement lastNameField;
	
	@FindBy(css = "select[name=\"DateOfBirthDay\"]")
	public WebElement dayList;
	
	@FindBy(css = "select[name=\"DateOfBirthMonth\"]")
	public WebElement monthList;
	
	@FindBy(css = "select[name=\"DateOfBirthYear\"]")
	public WebElement yearList;

	@FindBy(id="Email")
	public WebElement emailField;
	
	@FindBy(id="Company")
	public WebElement companyField;
	
	@FindBy(id="Password")
	public WebElement passField;
	
	@FindBy(id="ConfirmPassword")
	public WebElement confirmPassField;
	
	@FindBy(id="register-button")
	public WebElement registerBtn;
	
	@FindBy(css = "a[class=\"ico-login\"]")
	public WebElement LoginBtn;
	
	
	public void clickOnGenderRadioBtn()
	{
		genderRadioBtn.click();
	}
	
	public void setFirstName(String FName) {
		sendText(firstNameField, FName);
	}
	
	public void setLastName(String LName) {
		sendText(lastNameField, LName);
	}
	
	public void SetDateOfBirth(String Day,String Month,String Year) {
		Select objSelect = new Select(dayList);
		objSelect.selectByValue(Day);
		
		 objSelect = new Select(monthList);
		objSelect.selectByValue(Month);
		
		objSelect = new Select(yearList);
		objSelect.selectByValue(Year);
	}
	
	public void setEmail(String Email) {
		sendText(emailField, Email);
	}
	
	public void setCompanyName(String Company) {
		sendText(companyField, Company);
	}
	
	public void setPassword(String Password) {
		sendText(passField, Password);
		sendText(confirmPassField, Password);
	}
	
	public void cliclkOnRegisterBtn() {
		registerBtn.click();
		
	}
	
	public void clickOnLoginBtn() {
		LoginBtn.click();
	}

}
