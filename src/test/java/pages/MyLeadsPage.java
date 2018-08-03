package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;


public class MyLeadsPage extends ProjectMethods {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement elecreateLead;
	// Click Create Leads 
	
	@And("click Create Lead Link")
	public CreateLeadPage clickCreateLead(){
		click(elecreateLead);
		return new CreateLeadPage(driver, test);
	}

	/*@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement eleFindLead;
	// Click Create Leads 
	@And("click Find Link")
	public FindLeadsPage clickFindLeadPage(){
		click(eleFindLead);
		return new FindLeadsPage(driver, test);
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	public WebElement eleDuplicateLead;
	// Click Create Leads 
	@And("Click Duplicate Lead")
	public DuplicateLeadPage clickDuplicateLead(){
		click(eleDuplicateLead);
		return new DuplicateLeadPage(driver, test);
	}*/


	
	
	

}
