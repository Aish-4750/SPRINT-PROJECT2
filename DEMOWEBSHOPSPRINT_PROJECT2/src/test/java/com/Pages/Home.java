package com.Pages;

import java.io.IOException;

import com.Browser.Browser;

public class Home extends Browser{
	
	//to click login link
			public static void clickLogin()
			{
				com.Locators.Locators.homeLoginlink().click();
			}

		//fill email and password
			public static void enterCredentials() throws IOException 
			{
				com.Locators.Locators.loginEmailTextbox().sendKeys(com.Excel.ReadExcelData.readExcel(0, 0));
				com.Locators.Locators.loginPasswordTextbox().sendKeys(com.Excel.ReadExcelData.readExcel(0, 1));
			}
			
			//click login button
			public static void clickLogin1() throws Exception
			{
				com.Locators.Locators.LoginButton().click();
			}
			
			//click shopping cart link
			public static void shoppingcart_link()
			{
				com.Locators.Locators.homeShoppingCartLink().click();
			}



}
