package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("sbharadwaj06@gmail.com");
	driver.findElement(By.id("password")).sendKeys("bharadwaj23!");
	driver.findElement(By.name("proceed")).click();
String text=driver.findElement(By.id("div_login_error")).getText();
System.out.println(text);
	}

}
