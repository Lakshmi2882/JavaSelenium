package Seleniumwebdriverconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertpopHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//driver.findElement(By.id("login1")).sendKeys("sbharadwaj06@gmail.com");
//driver.findElement(By.id("password")).sendKeys("Bharadwaj23");
driver.findElement(By.name("proceed")).click();
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();

	}

}
