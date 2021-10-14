package com.buyItemsStepsDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pc\\eclipse-workspace\\SPRINT_PROJECT\\src\\test\\java\\BuyItemsFeatures\\BuyItems.feature", glue = {
		"com.buyItemsStepsDefinition" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReports",
				"junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json" }, strict = true)

public class BuyItemsTestRunner {

}
