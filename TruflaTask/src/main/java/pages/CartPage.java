package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(css= "a[class=\"product-name\"]")
	public WebElement productNameField;
	
	@FindBy(id="checkout")
	public WebElement checkOutBtn;
	
	@FindBy(css="button[class=\"ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close\"]")	
	public WebElement alertClseBtn;
	
	@FindBy(id="termsofservice")
	WebElement termsCheckBox;
	
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countryList;
	
	@FindBy(id="BillingNewAddress_City")
	WebElement cityField;
	
	@FindBy(id="BillingNewAddress_Address1")
	WebElement addressField;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement postalCodeField;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phoneNumberField;
	
	@FindBy(css= "button[name=\"save\"][class=\"button-1 new-address-next-step-button\"]")
	WebElement continueBtn1;
	
	@FindBy(css= "button[class=\"button-1 shipping-method-next-step-button\"]")
	public WebElement continueBtn2;
	
	@FindBy(css= "button[class=\"button-1 payment-method-next-step-button\"]")
	public WebElement continueBtn3;
	
	@FindBy(css= "button[class=\"button-1 payment-info-next-step-button\"]")
	public WebElement continueBtn4;
	
	@FindBy(css= "button[class=\"button-1 confirm-order-next-step-button\"]")
	public WebElement confirmBtn;
	
	
	@FindBy(css= "div[class=\"title\"]")
	public WebElement confirmTxtMessage;
	
	
	public void clickOnCheckOutBtn() {
		checkOutBtn.click();
	}
	
	
	
	public void clickOnTermsCheckBox() {
		termsCheckBox.click();
	}
	
	public void setBillingData(String Country,String City,String Address,String PostalCod,String Phone) {
		Select objSelect = new Select(countryList);
		objSelect.selectByVisibleText(Country);
		
		sendText(cityField, City);
		sendText(addressField, Address);
		sendText(postalCodeField, PostalCod);
		sendText(phoneNumberField, Phone);
	}
	
	public void clickOnContinueBtn1() {
		continueBtn1.click();
	}
	
	public void clickOnContinueBtn2() {
		continueBtn2.click();
	}
	
	public void clickOnContinueBtn3() {
		continueBtn3.click();
	}
	
	public void clickOnContinueBtn4() {
		continueBtn4.click();
	}
	
	public void clickOnConfirmBtn() {
		confirmBtn.click();
	}


}
