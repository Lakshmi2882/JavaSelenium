package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
WebElement ele=driver.findElement(By.name("email"));
WebElement passwords=driver.findElement(By.name("password"));

Actions action=new Actions(driver);
action.sendKeys(ele, "sbharadwaj06@gmail.com").build().perform();
action.sendKeys(passwords,"bharadwaj23").build().perform();


	}

}
