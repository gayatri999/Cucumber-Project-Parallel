package coding;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
   
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement ele1 = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement ele2 = driver.findElementByXPath("//span[text()='Apple']");
		WebElement ele3 = driver.findElementByXPath("//span[text()='OPPO']");
		Actions builder = new Actions(driver);
		builder.moveToElement(ele1).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele2));
		builder.click(ele2).perform();
		
		
		Thread.sleep(3000);
		builder.moveToElement(ele1).perform();
		wait.until(ExpectedConditions.visibilityOf(ele3));
		builder.click(ele3).perform();
		

	}

}






