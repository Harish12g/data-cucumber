package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirm_Page {
	public WebDriver driver;
	
	@FindBy(name="logout")
	private WebElement logout;
	
	
	
	public WebElement getLogout() {
		return logout;
	}



	public Bookingconfirm_Page(WebDriver lmno) {
		this.driver=lmno;
		PageFactory.initElements(driver, this);
	}

	

}
