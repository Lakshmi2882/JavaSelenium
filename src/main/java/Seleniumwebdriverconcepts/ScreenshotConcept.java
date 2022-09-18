package Seleniumwebdriverconcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	WebElement ele=	driver.findElement(By.name("email"));
	WebElement pass=driver.findElement(By.name("password"));
	WebElement loginbtn=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	Actions action=new Actions(driver);
	action.sendKeys(ele,"sbharadwaj06@gmail.com").build().perform();
	Screenshot(driver,"username");
	action.sendKeys(pass,"bharadwaj23").build().perform();
	Screenshot(driver,"Password");
	action.click(loginbtn).build().perform();
	Screenshot(driver,"login");
	ElementScreenshot(ele,"login");//StaleElement reference exception
	//screenshot for specific webElement using Selenium4
	

	}
	public static void Screenshot(WebDriver driver,String filename)
	{
		File sourcefile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(sourcefile, new File("./target/Screenshot/"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 public static void ElementScreenshot(WebElement element, String filename)
 {
	File src= ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(src, new File("./target/ElementScreenshot/"+filename+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
