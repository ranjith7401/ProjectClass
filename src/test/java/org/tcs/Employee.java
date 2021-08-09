package org.tcs;

import java.awt.AWTException;
import java.awt.KeyEventPostProcessor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Employee extends EmployeeBaseClass{
	public static void main(String[] args) throws AWTException {
		EmployeeBaseClass e = new EmployeeBaseClass();
		e.browserLaunch("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		e.mouseOver(gmail);
		for (int i = 1; i <=6; i++) {
			e.keyboardDown();
					
		}
		e.keyboardEnter();	
	}
}
