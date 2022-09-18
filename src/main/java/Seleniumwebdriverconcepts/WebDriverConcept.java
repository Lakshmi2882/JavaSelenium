package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//if link is not working properly. get no such element exception
		//driver.findElement(By.xpath("//div[@class='signup-link']")).click();
		driver.findElement(By.id("username")).sendKeys("sbharadwaj06@gmail.com");
		driver.findElement(By.id("password")).sendKeys("bharadwaj23");
		//input is HTML tag, id is attribute,username is attribute value
		
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	}

}
