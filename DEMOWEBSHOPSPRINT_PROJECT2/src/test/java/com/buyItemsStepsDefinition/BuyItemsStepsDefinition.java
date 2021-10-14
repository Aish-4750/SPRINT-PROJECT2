package com.buyItemsStepsDefinition;

import com.Browser.Browser;
import com.Pages.Checkout;
import com.Pages.Home;
import com.Pages.ShippingDetails;
import com.demowebshopTestCases.TestCase_009;
import com.demowebshopTestCases.TestCase_014;
import com.demowebshopTestCases.TestCase_015;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyItemsStepsDefinition extends Browser {
	
	@Given("User is  on login page")
	public void user_is_on_login_page() throws Exception {
		System.out.println("Inside Step- User is on login page");
		setDriver();
		getUrl();
		Home.clickLogin();
		Home.enterCredentials();
		Home.clickLogin1();
		Home.shoppingcart_link();
		
	}

	@And("User enters the details")
	public void user_enters_the_details() {
		try {
		ShippingDetails.enterCountry();
		ShippingDetails.enterZip();
		
	}
		catch(Exception e) {
		}
		
	}

	@And("Clicks on Estimate shipping")
	public void clicks_on_estimate_shipping() {
		ShippingDetails.clickEstimateShipping();
	}

	@And("User check the box to accept the terms and services")
	public void user_check_the_box_to_accept_the_terms_and_services() {
		ShippingDetails.clickTerms();
	}

	@When("User clicks on checkout")
	public void user_clicks_on_checkout() {
		try {
		ShippingDetails.clickCheckout();
		}
		catch(Exception e) {
		}
		
	}
	

	@Then("user is navigated to the Checkout Page")
	public void user_is_navigated_to_the_checkout_page() {
		
		
	}

	@Given("User is on Checkout page")
	public void user_is_on_checkout_page() {
		Checkout.clickNewAddress();
	}

	@And("User enters the valid details in fields")
	public void user_enters_the_valid_details_in_fields() throws Exception {
		try {
		Checkout.selectCountry();
		Checkout.enterCity();
		Checkout.enterAddress1();
		Checkout.enterPostalCode();
		Checkout.enterPhoneNumber();
	}
		catch(Exception e) {
		}
		
	}

	@When("User hits enter on Continue button")
	public void user_hits_enter_on_continue_button() throws Exception {
		Checkout.enterBillingDetails();
	}

	@Then("user is able to proceed further")
	public void user_is_able_to_proceed_further() {
		
	}

	@Given("User landed on Checkout page")
	public void user_landed_on_checkout_page() {
	    
	}

	@And("User enters the alphanumeric details in First Name")
	public void user_enters_the_alphanumeric_details_in_first_name() throws Exception {
		try {
		TestCase_009.enterInvaildFirstName();
	}
		catch(Exception e) {
		}
		
	}

	@When("User press click on Continue button")
	public void user_press_click_on_continue_button() {
	    
	}

	@Then("user is able to go ahead")
	public void user_is_able_to_go_ahead() {
		
	}

	@Given("User gets on Checkout page")
	public void user_gets_on_checkout_page() {
	    
	}

	@And("User enters the valid First name, Last name")
	public void user_enters_the_valid_first_name_last_name() throws InterruptedException {
		try {
		TestCase_014.leaveEmailBlank();
	}
		catch(Exception e) {
		}
		
	}

	@When("User is proceed to click on Continue button")
	public void user_is_proceed_to_click_on_continue_button() {
	   
	}

	@Then("user gets a message displayed")
	public void user_gets_a_message_displayed() {
		
	}

	@Given("User is Checkout page")
	public void user_is_checkout_page() {
	    
	}

	@And("User enters the First name, Last name")
	public void user_enters_the_first_name_last_name() throws InterruptedException {
		try {
		TestCase_015.enterFNameandLName();
		
	}
		catch(Exception e) {
		}
		
	}

	@And("User enter the Email without special character {string}")
	public void user_enter_the_email_without_special_character(String string) throws InterruptedException {
		TestCase_015.emailWithoutSpecialCharacter();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    
	}

	@Then("user gets a message")
	public void user_gets_a_message() {
		
	}


}
