package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class CreateLeadPage  extends ProjectMethods {


	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement companyName;
	@And("Enter Company Name (.*)")
	public CreateLeadPage enterCompanyName(String comnyName){
		type(companyName, comnyName);
		return this;

	}

	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	@And("Enter First Name (.*)")
	public CreateLeadPage enterFirstName(String firstName){
		type(eleFirstName, firstName);
		return this;
	}

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	@And("Enter Last Name (.*)")
	public CreateLeadPage enterLastName(String lastName){
		type(eleLastName, lastName);
		return this;

	}

	@FindBy(className="smallSubmit")
	WebElement eleCreateLeadSubmit;
	
	@And("Click Create Lead Button")
	public ViewLeadPage clickCreateLeadSubmit(){
		click(eleCreateLeadSubmit);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeadPage enterEmail(String eMail){
		type(eleEmail, eMail);
		return this;
	}
}
