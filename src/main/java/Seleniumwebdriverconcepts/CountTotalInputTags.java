package Seleniumwebdriverconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountTotalInputTags {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
List<WebElement> Inputlist	=	driver.findElements(By.tagName("input"));
System.out.println(Inputlist.size());
List<WebElement> textlist=driver.findElements(By.xpath("//input[@type='text']"));
System.out.println(textlist.size());
ArrayList<String> ar=new ArrayList<String>(Arrays.asList("lakshmi","sbharadwaj06@gmail.com","bharadwaj","98456789","34567"));

for(int i=0;i<textlist.size();i++)
{  if(!textlist.get(i).equals(""))
{
	String text= ar.get(i);
 textlist.get(i).sendKeys(text);
}
}

	}

}
