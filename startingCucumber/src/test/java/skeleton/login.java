package skeleton;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class login {
	WebDriver driver;
	
	@Before
	public void init()
	{
		String chromepath = "C:\\NexGen Testing Stream\\seleniumprjct\\jarfolder\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", chromepath);
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   PageFactory.initElements(driver, loginpage.class);
	}
	
	@Given("url for demowebshop {string}")
	public void url_for_demowebshop(String string) {
	   
	   driver.get(string);
	   System.out.println("hai");
	   
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.email.sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	  loginpage.password.sendKeys(string);
	}

	@Then("user is in webshop as {word}")
	public void user_is_in_webshop(String type) {
	loginpage.signin.click();
	Assert.assertTrue(driver.getTitle().equals("Demo Web Shop"));
	}

	@Given("Admin of the test me app enters")
	public void admin_of_the_test_me_app_enters(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> list=dataTable.asLists();
	    for(List<String> strings:list)
	    {
	    	for(String s:strings)
	    	{
	    		System.out.println(s+"\t");
	    	}
	    	System.out.println("");
	    }
	}

}
