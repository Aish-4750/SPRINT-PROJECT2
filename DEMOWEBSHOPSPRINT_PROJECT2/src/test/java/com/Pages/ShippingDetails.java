package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Browser.Browser;

public class ShippingDetails extends Browser {
	
	public static void enterCountry(){
        
		WebElement testDropDown1 = driver.findElement(By.id("CountryId"));  
		Select country = new Select(testDropDown1);
		country.selectByVisibleText("India");
	}
//	public static void enterState(){
//
//		WebElement testDropDown2 = driver.findElement(By.id("StateProvinceId"));  
//		Select state = new Select(testDropDown2);
//		state.selectByVisibleText("Other (Non US)");
//	}	

	public static void enterZip(){
		WebElement ZipCode = driver.findElement(By.className("zip-input"));
		ZipCode.clear();
		ZipCode.sendKeys("411033");
	}
	
	public static void clickEstimateShipping(){
		WebElement estimate_shipping = driver.findElement(By.name("estimateshipping"));
		estimate_shipping.click();
	}
	
	public static void clickTerms(){
		WebElement terms_and_conditions = driver.findElement(By.id("termsofservice"));
		terms_and_conditions.click();
	}
	
	public static void clickCheckout(){
		WebElement click_checkout = driver.findElement(By.id("checkout"));
		click_checkout.click();

		
	}

}
