package Seleniumwebdriverconcepts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {
	public static void getDropdownValue( WebDriver driver,WebElement element, String text)
	{
		Select select=new Select(element);
	List<WebElement>valueslist=select.getOptions();
	for(int i=0;i<valueslist.size();i++)
	{
		String value=valueslist.get(i).getText();
		if(value.equals(text))
		{
			select.selectByValue(text);
		}
	
	}
	}

}
