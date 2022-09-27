package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends LoginPage {
	public LoginPage loginpage;
	public DashBoardPage(WebDriver driver) {
		super(driver);
		loginpage = new LoginPage(driver);
		PageFactory.initElements(driver, loginpage);
		// TODO Auto-generated constructor stub
	}
	//Initializing the Page Objects:
	
	
	
		@FindBy(xpath="//*[@class='author__title']//strong[text()='Demo']")
		public WebElement User;
		
		public Boolean isUserDisplayed() {
			
			String nameDisplayed = User.getAttribute("linkText");
			return nameDisplayed.equalsIgnoreCase("Demo");
				
		}
		
		
	

	
}
