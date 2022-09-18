package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://form.jotformpro.com/42382403598964?");
	WebElement month=	driver.findElement(By.id("input_7_month"));
	WebElement day=driver.findElement(By.id("input_7_day"));
	WebElement year=driver.findElement(By.id("input_7_year"));
	String date="10-August-1990";
	String d[]=date.split("-");
	DropDownUtil.getDropdownValue(driver,day, d[0]);
	DropDownUtil.getDropdownValue(driver,month,d[1]);
	DropDownUtil.getDropdownValue(driver,year, d[2]);
	
	


	}

}
