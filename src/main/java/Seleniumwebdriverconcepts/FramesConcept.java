package Seleniumwebdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		List<WebElement>totalframes=driver.findElements(By.tagName("frame"));
		System.out.println(totalframes.size());
		WebElement frameelement=driver.findElement(By.name("main"));
		driver.switchTo().frame(frameelement);
WebElement titleele=driver.findElement(By.xpath("//body//h2[contains(text(),'Title bar')]"));
System.out.println(titleele.getText());//Frame->title
driver.switchTo().defaultContent();
WebElement Examplepageele=driver.findElement(By.name("content"));
driver.switchTo().frame(Examplepageele);
WebElement examp=driver.findElement(By.xpath("//body//h1[contains(text(),'Example home page ')]"));
System.out.println(examp.getText());



		
		

	}

}
