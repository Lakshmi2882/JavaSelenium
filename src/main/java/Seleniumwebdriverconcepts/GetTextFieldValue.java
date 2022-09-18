package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
WebElement ele=driver.findElement(By.id("login1"));
ele.sendKeys("bharadwaj06.com");
System.out.println(ele.getAttribute("value"));
	}

}
