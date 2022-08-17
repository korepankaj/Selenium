package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage_zerodha 
{
    @FindBy(id = "pin") private WebElement PIN;
    
    @FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
    
    
    
    Pinpage_zerodha(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    public void sendpin()
    {
    	PIN.sendKeys("982278");
    }

    public void clickcontinue()
    {
    	ContinueButton.click();
    }
	

}
