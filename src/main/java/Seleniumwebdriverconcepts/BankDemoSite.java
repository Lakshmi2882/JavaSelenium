package Seleniumwebdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BankDemoSite {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	List<WebElement> list=	driver.findElements(By.xpath("//button[@class='btn btn-primary btn-lg']"));
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).equals(list.get(1)))
		{
			list.get(i).click();
		}
	}


	}

}
