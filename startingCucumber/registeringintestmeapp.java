package casestudy1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class registeringintestmeapp {
WebDriver driver;

	@Given("url for testmeapp {string}")
	public void url_for_testmeapp(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String chromepath = "C:\\NexGen Testing Stream\\seleniumprjct\\jarfolder\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", chromepath);
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(string);
		  
	}
	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    
	}

	@When("user clicks on username and gives {string} as username")
	public void user_clicks_on_username_and_gives_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(string);
		}

	@When("user clicks on firstname and gives {string} as firstname")
	public void user_clicks_on_firstname_and_gives_as_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("user clicks on lastname and gives {string} as lastname")
	public void user_clicks_on_lastname_and_gives_as_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@When("user clicks on password and gives {string} as password")
	public void user_clicks_on_password_and_gives_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks on confirmpassword and gives {string} as confirmpassword")
	public void user_clicks_on_confirmpassword_and_gives_as_confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@When("user selects male and gives {string}as gender")
	public void user_selects_male_and_gives_as_gender(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[value='Male']")).click();
	}

@When("user clicks on email and gives {string} as email")
public void user_clicks_on_email_and_gives_as_email(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("emailAddress")).sendKeys(string);
}
@When("user clicks on mobilenumber and gives {string} as mobilenumber")
public void user_clicks_on_mobilenumber_and_gives_as_mobilenumber(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("mobileNumber")).sendKeys("9160202926");
}
@When("user clicks on dateofbirth and gives {string} as dateofbirth")
public void user_clicks_on_dateofbirth_and_gives_as_dateofbirth(String string) {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("dob")).sendKeys("21/01/1998");
}
@When("user clicks on address and gives {string} as address")
public void user_clicks_on_address_and_gives_as_address(String string) {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("address")).sendKeys("bangalore");
}

@When("user clicks on placeofbirth and gives {string} as placeofbirth")
public void user_clicks_on_placeofbirth_and_gives_as_placeofbirth(String string) {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("answer")).sendKeys("visakhapatnam");
}
@Then("user clicks on register")
public void user_clicks_on_register() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
}

}




