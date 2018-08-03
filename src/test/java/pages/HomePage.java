package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;


public class HomePage extends ProjectMethods  {

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver= driver;
		this.test= test; 
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(how=How.XPATH,using="//h2")
	public WebElement eleLoggedName;

	@Then("verify Username (.*)")
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}*/

	@FindBy(linkText="CRM/SFA")
	WebElement eleCrmLink;
	// Click Leads 
	@And("click CRM/SFA")
	public MyHomePage clickCRMSFA(){
		click(eleCrmLink);
		return new MyHomePage(driver, test);
	}

}







