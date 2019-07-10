package casestudy1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy4 {
	WebDriver driver;
	@Given("url for TESTMEAPP {string}")
	public void url_for_TESTMEAPP(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String chromepath = "C:\\NexGen Testing Stream\\seleniumprjct\\jarfolder\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", chromepath);
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(string);
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters username field {string}")
	public void user_enters_username_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enters password field {string}")
	public void user_enters_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.cssSelector("input[type=\'submit\']")).click();
	}

	@When("user clicks search button and types{string}")
	public void user_clicks_search_button_and_types(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("HeadPhone");
	}

	@When("user clicks find details")
	public void user_clicks_find_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
//		Assert.assertTrue(driver.findElement(By.cssSelector("a[href='displayCart.htm']")).isDisplayed());
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	
	@Then("user checks for cart symbol")
	public void user_checks_for_cart_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.findElement(By.cssSelector("a[href='displayCart.htm']")).isDisplayed());
	}
}
