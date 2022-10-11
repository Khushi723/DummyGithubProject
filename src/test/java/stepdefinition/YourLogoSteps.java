package stepdefinition;

import driversteup.DriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.YourLogo;
import utils.WebElementExtensions;

public class YourLogoSteps {
public YourLogo yourlogo;
	
	@Given("User is on the Home page of the application")
	public void user_is_on_the_home_page_of_the_application() {
	  
	}

	@When("User clicks on the {string} label")
	public void user_clicks_on_the_label(String mainLabel) {
		  yourlogo = new YourLogo(DriverSetup.driver);
		    yourlogo.clickMainLabel(mainLabel);
	}

	@When("Opens a pop-up to select further options")
	public void opens_a_pop_up_to_select_further_options() {
	   
	}

	@Then("User select the {string}")
	public void user_select_the(String options) {
	    yourlogo.clickMenuOptions(options);
	}

	@Then("Opens the similar page for the user")
	public void opens_the_similar_page_for_the_user() {
	   
	}
	
	@When("User scroll down the page to see color filter")
	public void user_scroll_down_the_page_to_see_color_filter() {
		yourlogo = new YourLogo(DriverSetup.driver);
	    WebElementExtensions.scrollToElement(DriverSetup.driver, yourlogo.colorLabelElement());
	}

	@When("User select the {string} color filter")
	public void user_select_the_color_filter(String color) {
		yourlogo.colorElementClick(color);
	}

	@When("Opens the {string} dresses for the user")
	public void opens_the_for_the_user(String dressesColor) {
		System.out.println(yourlogo.fetchBreadcrumb());
		System.out.println(dressesColor);
	}

	@Then("Sort the dresses by {string}")
	public void sort_the_dresses_by(String visibletext) {
	    yourlogo.clickSortingDropdown();
	    yourlogo.selectDropdownValue(visibletext);
	}

	@Then("Dresses appears in the ascending order of price")
	public void dresses_appears_in_the_ascending_order_of_price() {
	    
	}

}
