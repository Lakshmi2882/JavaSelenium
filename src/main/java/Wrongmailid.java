import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrongmailid {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.findElement(By.id("email")).sendKeys("sbha@rad@gmail.com");
	driver.findElement(By.id("email")).sendKeys(Keys.TAB);
	driver.findElement(By.cssSelector("form-group form-error")).isDisplayed();

	}

}
