package com.demowebshopTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Browser.Browser;

public class TestCase_015 extends Browser{
	
public static void enterFNameandLName() throws InterruptedException   { 
		

		WebElement FName = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]"));
		// WebElement FName2 =
		// driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]"));
		FName.clear();

		FName.sendKeys("Aishwarya");

		WebElement LName = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]"));
		// WebElement LName2 =
		// driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]"));
		LName.clear();
		LName.sendKeys("Dubey");
}
		
		public static void emailWithoutSpecialCharacter() throws InterruptedException   { 

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]"));
		Email.sendKeys("dubeyaishgmail.com");

		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		button.click();

	}

}
