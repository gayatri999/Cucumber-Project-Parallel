package wdmethods;

//import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods extends SeMethodss{
@BeforeMethod
	public  void loginPage() {
	
	startApp("firefox", "http://leaftaps.com/opentaps");
    type(locateElement("id", "username"), "DemoSalesManager");
    type(locateElement("id", "password"), "crmsfa");
    click(locateElement("class", "decorativeSubmit"));
    click(locateElement("linktext", "CRM/SFA"));
		}
@AfterMethod
public void closeBrowser() {
driver.close();

}
}
