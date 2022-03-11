package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel_Page {
	public WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continues;
	
	public Selecthotel_Page(WebDriver egh) {
		this.driver=egh;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinues() {
		return continues;
	}

	

}
