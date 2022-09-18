package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		By ele= By.name("email");//It is returning By class
		By pass=By.name("password");
		By loginbtn=By.xpath("//button[contains(text(),'Login')]");
		Util util=new Util(driver);
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
//		util.getElement(ele).sendKeys("sbharadwaj06@gmail.com");
//		util.getElement(pass).sendKeys("bharadwaj23");
//		util.getElement(loginbtn).click();
		util.DoSendkeys(ele, "sbharadwaj06@gmail.com");
		util.DoSendkeys(pass, "bharadwaj23");
		util.Doclick(loginbtn);
		
		

	}

}
