package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.Basepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class TravelcardStep extends Basepage {


@Given("^User is on the login page$")
public void user_is_on_the_login_page() {
	launchbrowser();
	driver.get("http://www.fairfx.com");
	driver.findElement(By.id("user-personal-sign-in")).click();
    driver.findElement(By.id("login_btn")).click();
}

@When("^User enters invalid credentials$")
public void user_enters_invalid_credentials() {
	driver.findElement(By.id("logEmail")).sendKeys("gfjhf@gmail.com");
    driver.findElement(By.id("login_password")).sendKeys("loginpswd");
    driver.findElement(By.id("recaptcha-checkbox-checkmark")).click();
    driver.findElement(By.id("login_btn")).click();    
}

@Then("^User is displayed with error validation message$")
public void user_is_displayed_with_error_validation_message() {
	Assert.assertEquals("* Incorrect email or password",driver.findElement(By.cssSelector(".error br")).getText());
}


}
 
