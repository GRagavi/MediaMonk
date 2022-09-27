package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageClasses.DashBoardPage;
import PageClasses.LoginPage;

public class CustomerLogin{
	
	 public WebDriver driver;
	 
	 
	 
	 
	 
	 @BeforeTest
	 public void setUp() {
		 System.setProperty("webdriver.chrome.driver","/Users/arul/MediaMonk/Cases/src/test/resources/driver/chromedriver");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	
	 }
	@Test
	public void Login() throws InterruptedException {
		
	LoginPage loginPage = new LoginPage(driver);
	PageFactory.initElements(driver,loginPage);
	DashBoardPage dashboardpage = new DashBoardPage(driver);
	PageFactory.initElements(driver, dashboardpage);
	
	
	loginPage.LaunchApplication();
	loginPage.CustomerLogin("user@phptravels.com","demouser");
	//dashboardpage.isUserDisplayed();
	}
	
	
}
