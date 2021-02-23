package CucumberJava.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
		
	@Before()
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arend\\Documents\\Techgrounds\\Webdevelopment\\Techground_webdevelopment\\Testerspad\\Udemy Course\\SeleniumWebDriverCourser\\CucumberJava\\src\\test\\java\\CucumberJava\\resources\\geckodriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);		
	}
	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("https://stackoverflow.com/");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Log in')]")).click();
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
	
	
	
	
	@Given("^User navigates to stackoverflow website(\\d+)$")
	public void user_navigates_to_stackoverflow_website(int arg1) throws Throwable {
		System.out.println("user_navigates_to_stackoverflow_website2");
	}

	@Given("^User clicks on the login button on homepage(\\d+)$")
	public void user_clicks_on_the_login_button_on_homepage(int arg1) throws Throwable {
		System.out.println("user_clicks_on_the_login_button_on_homepage2");
	}

	@Given("^User enters a correct username(\\d+)$")
	public void user_enters_a_correct_username(int arg1) throws Throwable {
		System.out.println("user_enters_a_correct_username2");

	}

	@Given("^User enters a correct password(\\d+)$")
	public void user_enters_a_correct_password(int arg1) throws Throwable {
		System.out.println("user_enters_a_correct_password2");

	}

	@When("^User clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) throws Throwable {
		System.out.println("user_clicks_on_the_login_button2");
	}

	@Then("^User should be taken to the succesful login page(\\d+)$")
	public void user_should_be_taken_to_the_succesful_login_page(int arg1) throws Throwable {
		System.out.println("user_should_be_taken_to_the_succesful_login_page2");
	}

}


