import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightofleftof {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
		
WebElement ele=driver.findElement(By.linkText("Puerto Aysen, Chile"));
String AQInumber=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
System.out.println(AQInumber);
	}

}
