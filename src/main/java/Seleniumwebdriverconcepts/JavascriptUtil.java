package Seleniumwebdriverconcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	public WebDriver driver;
 public JavascriptUtil(WebDriver driver)
 {
	 this.driver=driver;
 }
 public void flash(WebElement element)
 {
	 String BackGroundColor=element.getCssValue("backgroundColor");
	 for(int i=0;i<25;i++)
	 {
		 changeColor("rgb(0,200,0)",element);
		 changeColor(BackGroundColor,element);
		 
	 }
 }
 public void changeColor(String colour, WebElement element)
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("arguments[0].style.backgroundColour='"+colour+"'", element);
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public String getTitleByJS()
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	return js.executeScript("return document.title;").toString();
 }
 public void refreshBrowserByJS()
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("history.go(0)");
 }
 public void generateAlert(String message)
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("alert('"+message+"')");
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public String getPageInnerText()
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	return js.executeScript("return document.documentElement.innerText;").toString();
 }
 public void sendkeysById(String id,String value)
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("document.getElementById('"+id+"').value='"+value+" '");
 }
 public void scrollpageDown()
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 }
 public void scrollpageDown(String height)
 {
	 JavascriptExecutor js=((JavascriptExecutor)driver);
	 js.executeScript("window.scrollTo(0,'"+height+"'");
 }
 public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void drawBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

}
