package com.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {
	public static WebDriver driver;
	public static String values;
	public static void geturl(String url) {
	driver.get(url);
	}
	
	public static WebDriver getbrowser(String type) {
    if (type.equalsIgnoreCase("chrome")) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10.3\\eclipse-workspace\\Cucumber\\chrome\\chromedriver.exe");
	   driver= new ChromeDriver();
	}
    else if (type.equalsIgnoreCase("firefox")) {
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Chrome\\chromedriver.exe");
	    driver= new FirefoxDriver();
	}
		return driver;
	}
    
	public static void keypasselement(WebElement user, String value) {
    user.sendKeys(value);
	}
	
	public static void elementclick(WebElement use) {
    use.click();
	}
	
	public static void toclose() {
        driver.close();
	}
	
	public static void navigateotherpage(String url) {
		driver.navigate().to(url);

	}
	
	public static void navigatetoprevious() {
		driver.navigate().back();
		
	}
	
	public static void navigatetoforward() {
        driver.navigate().forward();
	}
	
	public static void refreshing() {
       driver.navigate().refresh();
	}
	
	public static void currenturl() {
     System.out.println(driver.getCurrentUrl());
	}
	
	public static void title() {
     System.out.println(driver.getTitle());
	}
	
	public static void text(WebElement text) {
		System.out.println(text.getText());
	}
	
	public static void action(WebElement name, String type) {
     Actions ha = new Actions(driver);
     if (type.equalsIgnoreCase("click")) {
		ha.click(name).build().perform();
	}
     
     else if (type.equalsIgnoreCase("context click")) {
    	 ha.contextClick(name).build().perform();
		
	}
     else if (type.equalsIgnoreCase("double click")) {
		ha.doubleClick(name).build().perform();
	}
     else if (type.equalsIgnoreCase("move to element")) {
		ha.moveToElement(name).build().perform();
	}
     else if (type.equalsIgnoreCase("drag and drop")) {
		ha.dragAndDrop(name, name).build().perform();
	}
	}
	public static void acceptalert() {
			driver.switchTo().alert().accept();	
	}
	public static void dismissalert() {
		driver.switchTo().alert().dismiss();

	}
	public static void robotdown() throws AWTException {
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);

	}
   public static void robotenter() throws AWTException {
	   Robot a=new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
   
}
   public static void sleep(int seconds) throws InterruptedException {
	   Thread.sleep(seconds);

}
   public static void implicitwait(int time) {
	   driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}
   public static void frame(int number) {
	   driver.switchTo().frame(number);

}
   public static void radiobutton(WebElement name) {
	   name.click();

}
   public static void screenshot(String path) throws IOException {
     TakesScreenshot h= (TakesScreenshot) driver;
     File src=h.getScreenshotAs(OutputType.FILE);
     File des=new File(path);
     FileUtils.copyFile(src, des);
}
   public static void javascriptdown() {
	   JavascriptExecutor h= (JavascriptExecutor) driver;
	   h.executeScript("window.scrollBy(0,3000);");
	   h.executeScript("window.scrollBy(0,9000);");

}
   public static void javascriptup() {
	   JavascriptExecutor h= (JavascriptExecutor) driver;
	   h.executeScript("window.scrollBy(0,-4500);");
	   

}
   public static void clear(WebElement name) {
	  name.clear();

}
   public static void windowhandle() {
	   String h= driver.getWindowHandle();
	   System.out.println(h);

}
   public static void windowhandles() {
	   Set<String> har = driver.getWindowHandles();
	   for (String ish : har) {
		System.out.println(ish);
	}
	   
	 

}

}
