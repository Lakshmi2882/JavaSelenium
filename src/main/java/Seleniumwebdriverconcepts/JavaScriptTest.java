package Seleniumwebdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
////to get title driver.getTitle();
//JavaScriptUtil.getTitleByJS(driver);
JavascriptUtil js=new JavascriptUtil(driver);
driver.get("https://demo.opencart.com/");
WebElement ele=driver.findElement(By.id("logo"));
js.drawBorder(ele);
WebElement ser=driver.findElement(By.id("search"));
js.flash(ser);
System.out.println(js.getPageInnerText());
WebElement e=driver.findElement(By.xpath("//div[@class='image']//img[@title='Canon EOS 5D']"));
js.scrollIntoView(e);

	}

}
