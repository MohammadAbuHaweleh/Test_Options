package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_Signup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdrive.chrome.drive", "D:\\new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String testRegister = "sweay48021@gmail.com";
		String testPassword = "testPass@11";
		String testConfirmPassword = "testPass@11";

		driver.get("https://www.booking.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/a[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(testRegister);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys(testPassword);
		driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys(testConfirmPassword);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"))
				.click();
		

	}

}
