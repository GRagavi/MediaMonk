package PageClasses;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
//Initializing the Page Objects:
	
	
	
	@FindBy(id="ACCOUNT")
	public WebElement Account;
	

	@FindBy(linkText="Customer Login")
	public WebElement CustomerLogin;
	

	@FindBy(name="email")
	public WebElement Username;
	
	@FindBy(name="password")
	public WebElement Password;
	
	@FindBy(xpath="//span[text()='Login']")
	public WebElement LoginButton;
	
	public LoginPage(WebDriver driver){
		//unbloc this to execut ecorrectly//super(driver);
		this.driver = driver; ///block this to execute correctly
		//PageFactory.initElements(driver,this);
	}
	
///////**********Launch Application***************//////////
	
		public void LaunchApplication() {
			driver.get("https://phptravels.net/");
			//return PageFactory.initElements(driver,LoginPage.class);
		}
		public DashBoardPage CustomerLogin(String username,String password) throws InterruptedException {
			
			Account.click();
			Thread.sleep(2000);
			CustomerLogin.click();
			Username.sendKeys(username);
			Password.sendKeys(password);
			LoginButton.click();
			return PageFactory.initElements(driver,DashBoardPage.class);
			
			//return new DashBoardPage(driver) ;
		}
		
		
	

}
