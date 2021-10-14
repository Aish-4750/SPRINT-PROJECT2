package com.demowebshopTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Browser.Browser;

public class TestCase_009 extends Browser {

	public static void enterInvaildFirstName() throws InterruptedException {

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/p/a"));
		btn.click();

		Thread.sleep(1000);
		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/p/a"));
		btn1.click();

		Thread.sleep(1000);
		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/p/a"));
		btn2.click();

		Thread.sleep(1000);
		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/p/a"));
		btn3.click();

		Thread.sleep(1000);
		WebElement btn4 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/p/a"));
		btn4.click();
		{

			WebElement fName = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]"));
			fName.clear();
			fName.sendKeys("Aish1234");

			Thread.sleep(1000);
			WebElement btn5 = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
			btn5.click();

			Thread.sleep(1000);
			WebElement btn6 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
			btn6.click();
		}

	}

}
