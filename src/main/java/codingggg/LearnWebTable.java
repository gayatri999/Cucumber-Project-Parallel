package codingggg;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		Thread.sleep(3000);
		boolean selected = driver.
				findElementById("chkSelectDateOnly").isSelected();
		// check CheckBox 
		Thread.sleep(3000);
		if (selected== true) {
			driver.findElementById("chkSelectDateOnly").click();
		}
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> tr = table.findElements(By.tagName("tr"));

		for (WebElement eachTr : tr) {
			String text = eachTr.findElements(By.tagName("td")).get(1).getText();
			System.out.println(text);
		}

		/*System.out.println(tr.size());
			WebElement firstRow = tr.get(0);
			List<WebElement> td = firstRow.findElements(By.tagName("td"));
			String text = td.get(1).getText();
			System.out.println(text);
		 */
		//WebElement ele = driver.findElementById("chkSelectDateOnly");


	}





}
