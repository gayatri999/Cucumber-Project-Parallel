package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;


public class FindLeadsPage extends ProjectMethods  {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	public WebElement eleLeadLink;
	
	@And("Enter Update Name Field (.*)")
	public FindLeadsPage updateFirstName(String fname) {
		type(eleLeadLink, fname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	public WebElement eleLeadLinkbutton;
	
	@And("click FindLead Button")
	public FindLeadsPage clickFindLeadButton() throws InterruptedException {
		click(eleLeadLinkbutton);
		Thread.sleep(3000);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	public WebElement eleFirstLead;
	
	@And("Click on First Matching Link")
	public MyLeadsPage clickFirstLead() {
		click(eleFirstLead);
		return new MyLeadsPage(driver, test);
	}

	
	
}
