package searchBooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.drive", "D:\\new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		driver.getTitle();
		String MyTitle = driver.getTitle();
		System.out.println(MyTitle);

		List<WebElement> MyOptions = driver.findElements(By.tagName("option"));

		for (int i = 0; i < MyOptions.size(); i++) {

			System.out.println(MyOptions.get(i).getText());
		}

	}

}
