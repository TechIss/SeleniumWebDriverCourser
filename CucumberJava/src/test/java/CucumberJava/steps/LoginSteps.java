package CucumberJava.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		System.out.println("user_navigates_to_stackoverflow_website");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		System.out.println("user_clicks_on_the_login_button_on_homepage");

	}

	@Given("^User enters a correct username$")
	public void user_enters_a_correct_username() throws Throwable {
		System.out.println("user_enters_a_correct_username");

	}

	@Given("^User enters a correct password$")
	public void user_enters_a_correct_password() throws Throwable {
		System.out.println("user_enters_a_correct_password");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		System.out.println("user_clicks_on_the_login_button");
	}

	@Then("^User should be taken to the succesful login page$")
	public void user_should_be_taken_to_the_succesful_login_page() throws Throwable {
		System.out.println("user_should_be_taken_to_the_succesful_login_page");
	}
}
