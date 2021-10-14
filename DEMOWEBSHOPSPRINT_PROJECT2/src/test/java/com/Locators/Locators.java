package com.Locators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Browser.Browser;

public class Locators extends Browser {
	
	public static WebElement homeLoginlink()
	{
		WebElement home_login_link = driver.findElement(By.xpath("//a[@class='ico-login']"));
		return home_login_link;

	}

	public static WebElement loginEmailTextbox ()
	{
		WebElement login_email_textbox = driver.findElement(By.xpath("//input[@class='email' and @id='Email']"));
		return login_email_textbox;

	}

	public static WebElement loginPasswordTextbox ()
	{
		WebElement login_password_textbox = driver.findElement(By.xpath("//input[@class='password' and @id='Password']"));
		return login_password_textbox;

	}

	public static WebElement LoginButton() throws Exception
	{
//		WebElement login_login_button = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
//		return login_login_button;
		
			String filelocation = System.getProperty("user.dir") + "\\Application_Requirements\\config.properties";
			FileInputStream fis = new FileInputStream(filelocation);
			Properties prop = new Properties();
			prop.load(fis);
			String loginbtn = prop.getProperty("loginbtn");
			WebElement btn = driver.findElement(By.xpath(loginbtn));
			return btn;
		}

	
	
	public static WebElement homeShoppingCartLink()
	{
		WebElement home_shoppingcart_link = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
		return home_shoppingcart_link;
	}
	
	public static WebElement shippingSelectCountry()
	{
		WebElement testDropDown1 = driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));  
		Select country = new Select(testDropDown1);
		country.selectByVisibleText("India");
        return testDropDown1;
	}
	
	public static WebElement shippingEnterZip()
	{
		WebElement shoppingcart_select_Zip = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
		return shoppingcart_select_Zip;
	}
	public static WebElement shippingClickEstimateShipping()
	{
		WebElement shoppingcart_click = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
		return  shoppingcart_click;
	}
	public static WebElement shippingClickTerms()
	{
		WebElement shoppingcart_clickTerms = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
		return shoppingcart_clickTerms;
	}
	public static WebElement shippingclickCheckout()
	{
		WebElement home_shoppingcart_link = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
		return home_shoppingcart_link;
	}
	
	
	
	
}


