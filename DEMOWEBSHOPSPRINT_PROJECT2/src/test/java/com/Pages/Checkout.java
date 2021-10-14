package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Browser.Browser;

public class Checkout extends Browser {
	
	public static void clickNewAddress() {

		// To enter the valid details in billing address

		WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));
		Select newAddress = new Select(testDropDown);
		newAddress.selectByVisibleText("New Address");
	}

	public static void selectCountry() {

		WebElement testDropDown2 = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select Country = new Select(testDropDown2);
		Country.selectByVisibleText("India");
	}

	public static void enterCity() throws Exception {
		Thread.sleep(1000);

		WebElement City = driver.findElement(By.id("BillingNewAddress_City"));
		City.sendKeys("Pune");
	}

	public static void enterAddress1() throws Exception {
		Thread.sleep(1000);
		WebElement Address1 = driver.findElement(By.id("BillingNewAddress_Address1"));

		Address1.sendKeys("Hinjawadi");

	}

	public static void enterPostalCode() throws Exception {

		Thread.sleep(1000);
		WebElement Zip = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));

		Zip.sendKeys("411033");
	}

	public static void enterPhoneNumber() throws Exception {
		Thread.sleep(1000);
		WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));

		phoneNumber.sendKeys("1209876543");
	}

	public static void enterBillingDetails() throws Exception {
		Thread.sleep(1000);
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		button1.click();
		Thread.sleep(1000);
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		button2.click();
		Thread.sleep(1000);
		WebElement button3 = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/div/div/ul/li[2]/div[1]/label"));
		button3.click();

		Thread.sleep(1000);
		WebElement button4 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
		button4.click();
		Thread.sleep(1000);
		WebElement button5 = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
		button5.click();
		Thread.sleep(1000);
		WebElement button6 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
		button6.click();

	}

}
