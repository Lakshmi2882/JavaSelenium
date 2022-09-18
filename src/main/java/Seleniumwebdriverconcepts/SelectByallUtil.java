package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByallUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://form.jotformpro.com/42382403598964?");
		By country=By.id("input_5_country");
		
Selectby(driver,country,"United States","value");
	}
	public static void Selectby(WebDriver driver,By locator, String value , String type)
	{
	WebElement countries=	driver.findElement(locator);
	Select select=new Select(countries);
	switch (type) {
	case "index":
		select.selectByIndex(Integer.parseInt(value));
break;
	case "visible text":
		select.selectByVisibleText(value);
		break;
	case "value":
		select.selectByValue(value);
		break;
		default :
		{
			System.out.println("please pass correct one");
		}
		break;
	}

	
	}

}
