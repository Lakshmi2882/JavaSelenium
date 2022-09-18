package Seleniumwebdriverconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {
 public static void getvalues(WebElement element, String value)
 { 
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<list.size();i++)
		{
		String text=	list.get(i).getText();
		ar.add(text);
		}
//		select.selectByValue(value);
//		Select select1=new Select(element);
//		select1.selectByValue(value);
	 
 }
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 WebElement firstdropdown=driver.findElement(By.id("first"));
			WebElement animals=driver.findElement(By.id("animals"));
		
		DropdownHandling.getvalues(firstdropdown,"Google");
		DropdownHandling.getvalues(animals,"Baby cat");
		
		
	}

}
