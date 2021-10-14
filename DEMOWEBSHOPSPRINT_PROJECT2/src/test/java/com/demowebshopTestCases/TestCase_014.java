package com.demowebshopTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Browser.Browser;

public class TestCase_014 extends Browser {
	
	public static void leaveEmailBlank() throws InterruptedException  {

		Thread.sleep(1000);
		WebElement btn8 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/p/a"));
		btn8.click();

		Thread.sleep(1000);
		WebElement btn9 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/p/a"));
		btn9.click();
		{

			WebElement FName = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]"));
			FName.clear();
			FName.sendKeys("Aishwarya");

			WebElement LName = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]"));
			 LName.clear();
			 LName.sendKeys("Dubey");

			WebElement Email = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]"));
			Email.clear();

			Thread.sleep(1000);
			WebElement btn10 = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
			btn10.click();
		}
	}

}
