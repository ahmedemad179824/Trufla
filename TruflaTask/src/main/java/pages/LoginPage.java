package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="Email")
	public WebElement emailField;
	
	@FindBy(id="Password")
	public WebElement passwordField;
	
	@FindBy(css ="button[class=\"button-1 login-button\"]")
	public WebElement loginBtn;

	public void setLoginEmail(String Email) {
		sendText(emailField, Email);
	}
	
	public void setLoginPassword(String Password) {
		sendText(passwordField, Password);
	}
	
	public void clickonLoginBtn() {
		loginBtn.click();
	}
	
}
