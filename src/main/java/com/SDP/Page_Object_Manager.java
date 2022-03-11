package com.SDP;

import org.openqa.selenium.WebDriver;

import com.Pom.Bookahotel_Page;
import com.Pom.Bookingconfirm_Page;
import com.Pom.Log_In;
import com.Pom.Search_Page;
import com.Pom.Selecthotel_Page;

public class Page_Object_Manager {
	public static WebDriver driver;
	
	private Log_In r;
	private Search_Page t;
	private Selecthotel_Page y;
	private Bookahotel_Page u;
	private Bookingconfirm_Page k;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Log_In getR() {
		r=new Log_In(driver);
		return r;
	}
	public Search_Page getT() {
	    t=new Search_Page(driver);
		return t;
	}
	public Selecthotel_Page getY() {
		 y=new Selecthotel_Page(driver);
		return y;
	}
	public Bookahotel_Page getU() {
		 u= new Bookahotel_Page(driver);
		return u;
	}
	public Bookingconfirm_Page getK() {
		 k=new Bookingconfirm_Page(driver);
		return k;
	}
	
}
