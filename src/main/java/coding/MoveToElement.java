package coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		
		StringBuffer  str = new StringBuffer();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Load URL 
		driver.get("https://www.flipkart.com/");
		//Closing the popup 
		driver.findElementByXPath("//button[text()='✕']").click();
		//Using Action class
		Actions act = new Actions(driver);
		//webElement that we need to move
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		act.moveToElement(electronics).perform();
		//Using Thread.sleep
		Thread.sleep(2000);
		//clicking on Apple
		driver.findElementByXPath("//span[text()='Apple']").click();
		
		
		
		
		
		
		
		
		
		
		
		











	}

}
