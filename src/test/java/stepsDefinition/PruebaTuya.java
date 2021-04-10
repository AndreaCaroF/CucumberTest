package stepsDefinition;

import java.util.HashMap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SetValues;
import pageObject.ValidatesData;

public class PruebaTuya {

	SetValues setValues;
	ValidatesData validatesData;

	@Given("I succesfully load the page")
	public void load_page() throws Throwable {
		setValues = new SetValues();
		setValues.initiateBrowser();
	}

	@Given("I set the information for data type")
	public void set_information() throws Throwable {
		setValues = new SetValues();
		setValues.setData();
	}

	@When("I select the option by simulation")
	public void select_option() throws Throwable {
		setValues = new SetValues();
		setValues.submitSimulation();
	}

	@Then("I should be able to validate the data for the simulation")
	public void validate_data() throws Throwable {
		validatesData = new ValidatesData();
		validatesData.closeBrowser();
	}
}
