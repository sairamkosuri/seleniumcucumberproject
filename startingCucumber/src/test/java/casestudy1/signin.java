package casestudy1;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signin {
	WebDriver driver;
	@Given("url for testmeapp is {string}")
	public void url_for_testmeapp_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String chromepath = "C:\\NexGen Testing Stream\\seleniumprjct\\jarfolder\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", chromepath);
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(string);
		  
	}
	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.cssSelector("input[type=\'submit\']")).click();
	}

	@Then("user will be in homepage")
	public void user_will_be_in_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("Home",driver.getTitle());
	}


}
