package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Logg {
     
	public static  ChromeDriver driver;
	
	@Given("Launch the browser")
	public void loginCL() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	
	@And("type userName as (.*)")
	public void uname(String uname) {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	
	@And("type password as (.*)")
	public void pwd(String psd) {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("click SubmitButton")
	public void submit() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
}
