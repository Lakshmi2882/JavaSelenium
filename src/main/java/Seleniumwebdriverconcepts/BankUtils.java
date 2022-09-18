package Seleniumwebdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankUtils {
	public static void Bank(WebDriver driver,  String locator)
	{
		List<WebElement> valueslist=driver.findElements(By.xpath(locator));
		for(int i=0;i<valueslist.size();i++)
		{
			if(valueslist.get(i).equals(valueslist.get(0)))
					{
				valueslist.get(i).click();
					}
		}
	}

}
