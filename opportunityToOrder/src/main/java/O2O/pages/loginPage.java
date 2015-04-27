package O2O.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("https://test.salesforce.com/")
@DefaultUrl("https://dmgsalescloud--systemtest.cs8.my.salesforce.com/")

public class loginPage extends PageObject {

	private WebElementFacade username() 	{ return element(By.id("username"));	}
	private WebElementFacade password() 	{ return element(By.id("password"));	}
	private WebElementFacade loginbutton()  { return element(By.id("Login"));		}
    
	public void supplyCredentialsToLogin(String userName, String Password){
		
		getDriver().manage().window().maximize();
		username().type(userName);
		password().type(Password);
		
	}
	public void submitLogin(){
		
		loginbutton().click();
		waitFor(6).seconds();
	}
	
}