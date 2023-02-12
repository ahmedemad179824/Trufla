package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	public WebElement registerBtn;
	
	@FindBy(linkText = "Log in")
	public WebElement loginBtn;
	
	@FindBy(css = "a[href=\"/books\"]")
	public WebElement booksBtn;
	
	@FindBy(id="products-orderby")
	public WebElement sortByList;
	
	@FindBy(css = "h2[class=\"product-title\"]>a[href=\"/pride-and-prejudice\"]")
	public WebElement itemTitle;
	
	@FindBy(xpath  = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
	public WebElement addToCartBtn;
	
	@FindBy(id="topcartlink")
	public WebElement cartBtn;
	
	
	
	public void clickOnRegisterBtn()
	{
		registerBtn.click();
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	public void clickOnBooksBtn() {
		booksBtn.click();
	}
	
	public void setSortList(String SortKey) {
		Select objSelect = new Select(sortByList);
		objSelect.selectByVisibleText(SortKey); 
	}
	
	public void clickonAddToCartBtn() {
		addToCartBtn.click();
	}
	
	public void clickOnCartBtn() {
		cartBtn.click();
	}
	
	

}
