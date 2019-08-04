package com.lacoste.com.steps;

import 	com.lacoste.com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeSteps {
	@Given("^user is on lacoste website$")
	public void user_is_on_lacoste_website()  {

		HomePage homepage = new HomePage();
	}
	@Then("^user clicks on go to my account$")
	public void user_clicks_on_go_to_my_account() {
	   
	}
}
