package db;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("mathavan.pec@gmail.com");
		driver.findElementById("pass").sendKeys("****");
		driver.findElementByXPath("//label[@id='loginbutton']/input").click();
		Thread.sleep(4000);
		driver.findElementByName("q").sendKeys("TestLeaf");
		driver.findElementByXPath("//button[@aria-label='Search']").click();
		Thread.sleep(4000);
		String txt = driver.findElementByXPath("(//div[text()='TestLeaf']/following::button[@type='submit'])[1]").getText();
		if(txt.equals("Liked")) {
			System.out.println("Already Liked");
		}else {
			driver.findElementByXPath("(//div[text()='TestLeaf']/following::button[@type='submit'])[1]").click();
			System.out.println("Liked the Page");
		}
		driver.findElementByLinkText("TestLeaf").click();
		String likeCount = driver.findElementByXPath("//div[contains(text(), 'people like this')]").getText();
		System.out.println(likeCount);
		driver.quit();
	}
}
