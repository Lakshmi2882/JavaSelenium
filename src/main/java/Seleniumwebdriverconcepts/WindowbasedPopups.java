package Seleniumwebdriverconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowbasedPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://aquabottesting.com/index.html");
		driver.findElement(By.linkText("DISCOVER")).click();
		driver.findElement(By.xpath("//input[@id='text-change']")).click();
	Set<String> handles=	driver.getWindowHandles();
//	//Set does not store values in order
//	//set does not store duplicates
	Iterator<String> it=handles.iterator();
String parentID=it.next();
	System.out.println(parentID);
String childID=it.next();
System.out.println(childID);
	}

}
