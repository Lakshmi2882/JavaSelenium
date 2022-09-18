package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		Actions action=new Actions(driver);
	WebElement ele=	driver.findElement(By.xpath("//a[@class='menulink']"));
		action.moveToElement(ele).build().perform();
		
		WebElement courseele=driver.findElement(By.xpath("//div//ul//li//a[contains(text(),'Courses')]"));
		courseele.click();
		
		

	}

}
