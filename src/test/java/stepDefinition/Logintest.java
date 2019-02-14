package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintest {
	public WebDriver driver;
	public Logintest() {
		driver = Hooks.driver;
	}

	@When("^user enter with usernmae \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_with_usernmae_something_and_password_something(String usr, String psd) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(usr);
		driver.findElement(By.name("password")).sendKeys(psd);
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^welcome page should be displayed$")
	public void welcome_page_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}


}
