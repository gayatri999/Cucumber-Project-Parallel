package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;



public class MyHomePage extends ProjectMethods {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Leads")
	WebElement eleLeadLink;
	// Click Leads 
	@And("click Leads")
	public MyLeadsPage clickLeadLink(){
		click(eleLeadLink);
		return new MyLeadsPage(driver, test);
	}


}
