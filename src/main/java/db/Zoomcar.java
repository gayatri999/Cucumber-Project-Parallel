package db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Zoomcar {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following::div").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//div[@class='day']/div").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(4000);
		List<WebElement> listOfSearch = driver.findElementsByXPath("//div[@class='car-list-layout']/div[*]");
		List<Integer> priceList = null;
		for (int i = 1; i <= listOfSearch.size(); i++) {
			String price = driver.findElementByXPath("//div[@class='car-list-layout']/div["+i+"]//div[@class='price']").getText();
			String newPriceList = price.replaceAll("\\D", "");
			priceList = new ArrayList<Integer>();
			priceList.add(Integer.parseInt(newPriceList));
		}
		Collections.sort(priceList);
		String highestValue = priceList.get(0).toString();
		String brandName = driver.findElementByXPath("//*[contains(text(),'"+highestValue+"')]/preceding::h3").getText();
		System.out.println("BrandName of the car: "+brandName);
		driver.findElementByXPath("//*[contains(text(),'"+highestValue+"')]/following-sibling::button").click();
	}
}
