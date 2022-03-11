package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\File.feature", glue = "com.adactin.stepdefinition")
public class Runner_Class {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		driver=Base_Class.getbrowser("chrome");

	}
	@AfterClass
	public static void teardown() {
		driver.close();

	}

}
