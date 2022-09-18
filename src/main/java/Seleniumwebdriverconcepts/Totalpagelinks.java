package Seleniumwebdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totalpagelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> list=driver.findElements(By.tagName("a"));
System.out.println(list.size());
for(int i=0;i<list.size();i++)
{String text=list.get(i).getText();
if(!text.equals(""))
{
	System.out.println(text);
}
}
	}

}
