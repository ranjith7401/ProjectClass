package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmployeeBaseClass {
	static WebDriver driver;
	public void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RANJITH\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void mouseOver(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	public void keyboardDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public void keyboardEnter() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
		
	

}
