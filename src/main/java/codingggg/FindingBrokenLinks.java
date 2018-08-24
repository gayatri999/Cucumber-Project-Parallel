package codingggg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zlti.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String homePage ="http://www.zlti.com";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		List<WebElement> allLinks = driver.findElementsByTagName("a");
		System.out.println(allLinks.size());
		Iterator<WebElement> iterator = allLinks.iterator();

		while(iterator.hasNext()){

			url = iterator.next().getAttribute("href");

			System.out.println(url);

			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if(!url.startsWith(homePage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			huc = (HttpURLConnection)(new URL(url).openConnection());
			 huc.setRequestMethod("HEAD");
             
             huc.connect();
             
             respCode = huc.getResponseCode();
             
             if(respCode >= 400){
                 System.out.println(url+" is a broken link");
             }
             else{
                 System.out.println(url+" is a valid link");
             }

	}












		}

	}










