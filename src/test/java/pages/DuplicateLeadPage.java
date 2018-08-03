package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;


public class DuplicateLeadPage extends ProjectMethods  {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);		
	}

	@FindBy(how=How.NAME,using="submitButton")
	public WebElement elecreateLead;

	@And("Click Submit")
	public ViewLeadPage clickupdate() {
		click(elecreateLead);
		return new ViewLeadPage(driver, test);
	}





}
