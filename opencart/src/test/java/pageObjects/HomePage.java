package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="(//div[@class=\"navbar-right hidden-xs\"]/a)[2]") 
WebElement lnkRegister;

@FindBy(linkText = "(//div[@class=\"navbar-right hidden-xs\"]/a)[1]")   // Login link added in step5
WebElement linkLogin;

@FindBy(xpath="//input[@placeholder='Search']")  //For Search Product Test
WebElement txtSearchbox;

@FindBy(xpath="//div[@id='search']//button[@type='button']") //For Search Product Test
WebElement btnSearch;


public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}


public void clickLogin()    // added in step5
{
	linkLogin.click();
}

public void enterProductName(String pName)   //For Search Product Test
{
	txtSearchbox.sendKeys(pName);
}

public void clickSearch()  //For Search Product Test
{
	btnSearch.click();
}


}
