package HashMapandHashTable;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		Map <String,String> UserMap=new HashMap<String,String>();
		UserMap.put("Lakshmi", "sbharadwaj06@gmail.com:bharadwaj23");
		UserMap.put("Raghuram", "eddanapudir@gmail.com:evr123");
		UserMap.put("Swaraj","swaraj12@gmail.com:swar123");
		UserMap.put("Bharadwaj","bharadwaj06@gmail.com:bhar123");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
LoginPage.Dologin(driver, "Bharadwaj", UserMap);
	}
public static void Dologin(WebDriver driver, String userkey,Map<String,String> UserMap)
{
	driver.findElement(By.name("email")).sendKeys(UserMap.get(userkey).split(":")[0]);
	driver.findElement(By.name("password")).sendKeys(UserMap.get(userkey).split(":")[1]);
	
}
}
