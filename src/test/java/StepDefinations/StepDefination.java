package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("user is on netbaning landing page")
	public void user_is_on_netbaning_landing_page() {
		System.out.println("srikanth");
		System.out.println("srikanth1");
		System.out.println("srikanth2");
		System.out.println("srikanth3");
		System.out.println("srikanth11");
		System.out.println("srikanth21");
		System.out.println("srikanth31");
		
		
		
	}

	@When("user login to application with {string} and {string}")
	public void user_login_to_application_with_and(String string, String string2) {
		System.out.println(string + string2);
		System.out.println("srikanth");
		System.out.println("srikanth1");
		System.out.println("srikanth2");
		System.out.println("srikanth3");
		System.out.println("srikanth11");
		System.out.println("srikanth21");
		System.out.println("srikanth31");
	}

	@Then("home page is populated")
	public void home_page_is_populated() {
		System.out.println("chatu");
	}

	@And("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Srikanth");
	}

}