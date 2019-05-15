package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import base.Basepage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TravelcashStep extends Basepage {
	
	@When("^User clicks on Travelcash$")
	public void user_clicks_on_Travelcash() {
	driver.findElement(By.cssSelector(".topcentralmenu a[href$='cash']")).click();	
	    
	}

	@Then("^Travelcash page is displayed$")
	public void travelcash_page_is_displayed() {
		Assert.assertEquals(driver.findElement(By.cssSelector(".col-md-8 h1")).getText(), "TRAVEL CASH");
		driver.quit();
	    
	}
	
	@Given("^User is on the Travelcash page$")
	public void user_is_on_the_Travelcash_page() {
		CurrencycardStep.user_is_on_the_Home_page();
		user_clicks_on_Travelcash();
	}

	@When("^currency value is entered for different currency$")
	public void currency_value_is_entered_for_different_currency(DataTable dcurrencies) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = dcurrencies.raw();
		//driver.findElement(By.id("spend-amount-post")).clear();
		//System.out.println(data.get(0).get(0));
		//driver.findElement(By.id("spend-amount-post")).clear();
		//driver.findElement(By.id("spend-amount-post")).sendKeys(data.get(0).get(0));
		Select svalue = new Select(driver.findElement(By.id("buy-currency-post")));
		svalue.selectByVisibleText(data.get(0).get(0));
		
	}

	@Then("^Travelcash amount page is displayed$")
	public void travelcash_amount_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.cssSelector(".col-md-8 h1")).getText(), "TRAVEL CASH");
		driver.quit();
	    
	}


@When("^clicks on Order now for Travelcash$")
public void clicks_on_Order_now_for_Travelcash(){
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
}

@Then("^order Travelcash page is displayed$")
public void order_Travelcash_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(driver.findElement(By.cssSelector("#travelCashPatch h2")).getText(), "Order travel cash");
	driver.quit();
    
}
@When("^currency is selected$")
public void currency_is_selected(DataTable currencyt) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	for (Map<String, String> data : currencyt.asMaps(String.class,String.class)) {
		driver.findElement(By.id("spend-amount-post")).click();
		driver.findElement(By.id("spend-amount-post")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.findElement(By.id("spend-amount-post")).sendKeys(data.get("value"));
		driver.findElement(By.id("buy-currency-post")).click();
		Select svalue = new Select(driver.findElement(By.id("buy-currency-post")));
		svalue.selectByVisibleText(data.get("Currency"));
		driver.findElement(By.cssSelector(".form-row .btn-default")).click();     
		     
		 }
}




}
