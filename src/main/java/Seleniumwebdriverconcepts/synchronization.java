package Seleniumwebdriverconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class synchronization {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/c/830303011");
		//Implicit wait
		//applied for all elements
		//dynamic wait
		//global wait
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//implicit wait is only for WebElements
		//Explicit wait, it will give Timeout Exception
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		for Explicit wait default wait is 500 milliseconds
		

	}

}
