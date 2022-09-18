package Seleniumwebdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jqueryDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//div//input[@id='justAnInputBox']")).click();
		jqueryDropdown.SelectDropdownlist(driver,"choice 1");
		

		
	}

public static void SelectDropdownlist(WebDriver driver, String value)
{
	driver.findElement(By.xpath("//div//input[@id='justAnInputBox']")).click();
	List<WebElement> choicelist=	driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
	for(int i=0;i<choicelist.size();i++)
{ String text=choicelist.get(i).getText();
	System.out.println(text);
	
	if(text.equals(value))
	{
		choicelist.get(i).click();
		break;
	}
	
}
}
}
