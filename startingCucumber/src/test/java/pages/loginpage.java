package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {

	@FindBy(how=How.XPATH,using="//a[contains(@href, 'RegisterUser.htm')]")
	static public WebElement signup;
	@FindBy(how=How.ID,using= "userName")
	static public WebElement username;
	@FindBy(how=How.ID,using= "Email")
	static public WebElement email;
	@FindBy(how=How.ID,using="Password")
	static public WebElement password;
	@FindBy(how=How.CSS,using= "input[value='Log in']")
	static public WebElement signin;
	
}
