package stepdefinition;

import org.openqa.selenium.By;

import base.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import stepdefinition.CurrencycardStep;

public class InternationalTransferStep extends Basepage {
	CurrencycardStep c = new CurrencycardStep();

	@When("^User clicks InternationalTransfers link$")
	public void user_clicks_InternationalTransfers_link() {
		driver.findElement(By.cssSelector(".topcentralmenu a[href$='transfer']")).click();
	}

	@Then("^User is displayed with InternationalTransfers page$")
	public void user_is_displayed_with_InternationalTransfers_page() {
		Assert.assertEquals(driver.findElement(By.cssSelector(".no-space")).getText(), "FAIRFX MONEY TRANSFERS");
		driver.quit();
	}

	@Given("^User is on InternationalTransfers page$")
	public void user_is_on_InternationalTransfers_page() {
		CurrencycardStep.user_is_on_the_Home_page();
		user_clicks_InternationalTransfers_link();
	}

	@When("^User clicks on Transfers now button$")
	public void user_clicks_on_Transfers_now_button() {
		driver.findElement(By.cssSelector(".btn-transparent")).click();
	}

	@Then("^User is displayed with Amount page$")
	public void user_is_displayed_with_Amount_page() {
		Assert.assertEquals(driver.getTitle(), "Make an International Money Transfer");
		driver.quit();
	}

	@When("^User clicks on Buy now button$")
	public void user_clicks_on_Buy_now_button() {
		driver.findElement(By.cssSelector(".btn-default")).click();
	}

	@Given("^User is on Amount page$")
	public void user_is_on_Amount_page() {
		CurrencycardStep.user_is_on_the_Home_page();
		user_clicks_InternationalTransfers_link();
		user_clicks_on_Transfers_now_button();
		//user_clicks_on_Buy_now_button();

	}

	@Then("^User is displayed with SignIn page$")
	public void user_is_displayed_with_SignIn_page() {
		Assert.assertEquals(driver.findElement(By.cssSelector("#loginDetails > div.login-box > h4")).getText(), "CURRENCY CARDS");
		driver.quit();
	}
	
	@Then("^User is displayed with SignIn page for international Transfers$")
	public void user_is_displayed_with_SignIn_page_for_international_Transfers() {
		Assert.assertEquals(driver.findElement(By.cssSelector(".login-box h4")).getText(), "Already a customer?");
		driver.quit();
	}

}
