package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CreateTC {
public static  ChromeDriver driver;
	
	@Given("Launch url")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	
	@And("enter userName as (.*)")
	public void username(String uname) {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	
	@And("enter password as (.*)")
	public void password(String psd) {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("click on Submit Button")
	public void loginbutton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click crmsfa")
	public void crmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click CreateLead link")
	public void createlead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("enter companyname as (.*)")
	public void companyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@And("enter firstname as (.*)")
	public void firstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("enter lastname as (.*)")
	public void lastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@And("click on createbutton")
	public void clickSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
}
