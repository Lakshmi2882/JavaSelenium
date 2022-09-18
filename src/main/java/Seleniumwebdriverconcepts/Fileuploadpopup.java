package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploadpopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.findElement(By.xpath("//input[@name='userfile']")).sendKeys("C:\\Users\\eddan");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
