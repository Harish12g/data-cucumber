package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.SDP.Page_Object_Manager;
import com.adactin.runner.Runner_Class;
import com.base_class.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
	public static WebDriver driver=Runner_Class.driver;
	public static Page_Object_Manager h =new Page_Object_Manager(driver);
	
	@Given("^user Will Launch The Url$")
	public void user_Will_Launch_The_Url() throws Throwable {
		geturl("https://adactinhotelapp.com/index.php");
		
	}

	@When("^enter The Name In The Username Field$")
	public void enter_The_Name_In_The_Username_Field() throws Throwable {
		keypasselement(h.getR().getUser(), "Harish12");
	}

	@When("^enter The Password In The Password Field$")
	public void enter_The_Password_In_The_Password_Field() throws Throwable {
		keypasselement(h.getR().getPass(), "1HYS80");
	}

	@Then("^click The Login Button To Get In The Homepage$")
	public void click_The_Login_Button_To_Get_In_The_Homepage() throws Throwable {
		elementclick(h.getR().getLogin());
	}

	@When("^select The Location In the Location Field$")
	public void select_The_Location_In_the_Location_Field() throws Throwable {
		keypasselement(h.getT().getLocation(), "Melbourne");
	}

	@When("^select The Hotel In The Hotels Field$")
	public void select_The_Hotel_In_The_Hotels_Field() throws Throwable {
		keypasselement(h.getT().getHotels(), "Hotel Sunshine");
	}

	@When("^select The Room Type In The Room Type Field$")
	public void select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		keypasselement(h.getT().getRoomtype(), "Deluxe");
	}

	@When("^select The Numbers Of Room In The Number Room Field$")
	public void select_The_Numbers_Of_Room_In_The_Number_Room_Field() throws Throwable {
		keypasselement(h.getT().getRoomnos(), "2 - Two");
	}

	@When("^enter The Date In The Check In Date Field$")
	public void enter_The_Date_In_The_Check_In_Date_Field() throws Throwable {
	}

	@When("^enter The Date In The Check Out Date Field$")
	public void enter_The_Date_In_The_Check_Out_Date_Field() throws Throwable {
	}

	@When("^select The Adults Per Room In The Adults Per Room Field$")
	public void select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
		keypasselement(h.getT().getAdultroom(), "2 - Two");
	}

	@When("^select The Children Per Room In The Children Per Room Field$")
	public void select_The_Children_Per_Room_In_The_Children_Per_Room_Field() throws Throwable {
	}

	@Then("^click The Search Button For The Next page$")
	public void click_The_Search_Button_For_The_Next_page() throws Throwable {
		elementclick(h.getT().getSearch());
	}

	@When("^click The Check Box In The Check Box Field$")
	public void click_The_Check_Box_In_The_Check_Box_Field() throws Throwable {
		elementclick(h.getY().getRadiobutton());
	}

	@Then("^click The Continue Button For The Next Page$")
	public void click_The_Continue_Button_For_The_Next_Page() throws Throwable {
		elementclick(h.getY().getContinues());
	}

	@When("^enter The Name In The First Name Field$")
	public void enter_The_Name_In_The_First_Name_Field() throws Throwable {
		keypasselement(h.getU().getFirstname(), "harish");
	}

	@When("^enter The Last Name In The Last Name Field$")
	public void enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		keypasselement(h.getU().getLastname(), "G");
	}

	@When("^enter The Address In The Billing Address Field$")
	public void enter_The_Address_In_The_Billing_Address_Field() throws Throwable {
		keypasselement(h.getU().getAddress(), "no 12, norway, norway norway");
	}

	@When("^enter The Credit Card Number In The Credit Card No Field$")
	public void enter_The_Credit_Card_Number_In_The_Credit_Card_No_Field() throws Throwable {
		keypasselement(h.getU().getCardnumber(), "1234567890123456");
	}

	@When("^select The Credit Card Type In The Credit Card Type$")
	public void select_The_Credit_Card_Type_In_The_Credit_Card_Type() throws Throwable {
		keypasselement(h.getU().getCardtype(), "American Express");
	}

	@When("^select The Month And Year In The Expiry Date Field$")
	public void select_The_Month_And_Year_In_The_Expiry_Date_Field() throws Throwable {
		keypasselement(h.getU().getExpirymonth(), "April");
		keypasselement(h.getU().getExpiryyear(), "2022");
	}

	@When("^enter The CVV Number In The CVV Number Field$")
	public void enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
		keypasselement(h.getU().getCvv(), "321");
	}

	@Then("^click The Book Now Button$")
	public void click_The_Book_Now_Button() throws Throwable {
		elementclick(h.getU().getBook());
	}

	@Then("^click The Logout Button$")
	public void click_The_Logout_Button() throws Throwable {
		elementclick(h.getK().getLogout());
	}

}
