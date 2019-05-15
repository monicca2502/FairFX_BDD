package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import base.Basepage;

public class CurrencycardStep extends Basepage {

	@Given("^User is on the Home page$")
	public static void user_is_on_the_Home_page() {
		launchbrowser();
		driver.get("http://www.fairfx.com");
	}

	@When("^User clicks on Travel Card$")
	public void user_clicks_on_Travel_Card() {
		driver.findElement(By.cssSelector(".topcentralmenu li a:nth-last-child(2)")).click();
	}

	@When("^User clicks on currency card$")
	public void user_clicks_on_currency_card() {
		driver.findElement(By.cssSelector(".dropdown-menu a[href^='/currency-']")).click();
	}

	@Then("^Currency card page is displayed$")
	public void currency_card_page_is_displayed() {
		Assert.assertEquals(driver.findElement(By.id("hero_mini_title")).getText(), "CURRENCY CARDS");
		driver.quit();
	}

	@When("^User clicks on Everywhere card$")
	public void user_clicks_on_Everywhere_card() {
		driver.findElement(By.cssSelector(".dropdown-menu a[href^='/everywhere-']")).click();

	}

	@Then("^Everywhere card page is displayed$")
	public void everywhere_card_page_is_displayed() {
		Assert.assertEquals(driver.findElement(By.id("hero_mini_title")).getText(), "EVERYWHERE CARD");
		driver.quit();
	}

	@Given("^User is on the Currency card page$")
	public void user_is_on_the_Currency_card_page() {
		user_is_on_the_Home_page();
		user_clicks_on_Travel_Card();
		user_clicks_on_currency_card();
	}

	@When("^User clicks on Dollar Card$")
	public void user_clicks_on_Dollar_Card() {
		driver.findElement(By.id("dollarCardTab")).click();
	}

	@When("^User clicks on order now button$")
	public void user_clicks_on_order_now_button() {
		driver.findElement(By.cssSelector(".btn-experimental")).click();
	}

	@Then("^amount page is displayed$")
	public void amount_page_is_displayed() {
		Assert.assertEquals(driver.getTitle(), "Currency Cards - Apply for a FairFX Prepaid Currency Card");
		driver.quit();
	}

	@When("^User enters amount$")
	public void user_enters_amount() {
		driver.findElement(By.id("amount-spending")).sendKeys("2000");
	}

	@When("^User clicks on continue button$")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.cssSelector((".btn-default"))).click();
	}

	@Then("^SignIn page is displayed$")
	public void signin_page_is_displayed() {
		Assert.assertEquals(driver.getTitle(), "Please enter your details");
		driver.quit();
	}

	@When("^User clicks on Euro Card$")
	public void user_clicks_on_Euro_Card() {
		driver.findElement(By.id("euroCardTab")).click();
	}

	@Given("^User is on amount page from Euro card$")
	public void user_is_on_amount_page_from_Euro_card() {
		user_is_on_the_Home_page();
		user_clicks_on_Travel_Card();
		user_clicks_on_currency_card();
		user_clicks_on_Euro_Card();
		user_clicks_on_order_now_button();
	}

	@Given("^User is on amount page from Dollar card$")
	public void user_is_on_amount_page_from_Dollar_card() {
		user_is_on_the_Home_page();
		user_clicks_on_Travel_Card();
		user_clicks_on_currency_card();
		user_clicks_on_Dollar_Card();
		user_clicks_on_order_now_button();
	}

	@Given("^enters value of £ \"([^\"]*)\"$")
	public void enters_value_of_£(String amt) {
		driver.findElement(By.id("calculator-has-money")).clear();
		driver.findElement(By.id("calculator-has-money")).sendKeys(amt);

	}

	String s;

	@Given("^clicks on Order now$")
	public void clicks_on_Order_now() {
		s = driver.findElement(By.id("calculator-wants-money")).getText();
		driver.findElement(By.id("order-button")).click();

	}

	@Then("^amount page is displayed with currency card page exchange rate$")
	public void amount_page_is_displayed_with_currency_card_page_exchange_rate() {
		Assert.assertEquals(driver.findElement(By.id("amount-buying")).getText(), s);
		driver.close();
	}

	@Given("^selects \"([^\"]*)\"$")
	public void selects(String CardType) {
		Select dselect = new Select(driver.findElement(By.id("calculator-wants-currency")));
		dselect.selectByVisibleText(CardType);
	}

	@Given("^enters value of get currency as \"([^\"]*)\"$")
	public void enters_value_of_get_currency_as(String currency) {
		driver.findElement(By.id("calculator-wants-money")).clear();
		driver.findElement(By.id("calculator-wants-money")).sendKeys(currency);
	}

}
