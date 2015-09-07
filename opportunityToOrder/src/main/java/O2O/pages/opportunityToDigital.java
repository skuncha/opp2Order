package O2O.pages;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class opportunityToDigital extends PageObject {
	
	private WebElementFacade clickOnAddDigitalProducts() {return element(By.id("j_id0:opportunityToDigitalForm:j_id868:j_id900")); }
	private WebElementFacade selectProduct() 		     {return element(By.xpath("//div[@id='j_id0:opportunityToDigitalForm:j_id868:j_id903:j_id904:multiselectPanel']/table/tbody/tr/td/select/option[10]")); }
	private WebElementFacade addProduct() 				 {return element(By.xpath("//div[2]/a/img")); 							   }
	private WebElementFacade clickOnNext() 				 {return element(By.id("j_id0:opportunityToDigitalForm:j_id868:j_id938")); }
	private WebElementFacade enterSalesPrice() 			 {return element(By.id("j_id0:opportunityToDigitalForm:j_id868:j_id973:0:j_id1004")); }
	private WebElementFacade saveDigitalLines() 		 {return element(By.id("j_id0:opportunityToDigitalForm:j_id868:j_id1025")); }
	private WebElementFacade selectDigitalLine() 		 {return element(By.xpath("//span[3]/table/tbody/tr/td/input")); }
	private WebElementFacade editDigitalLine() 		 	 {return element(By.id("j_id0:opportunityToDigitalForm:j_id868:j_id1101")); }
	private WebElementFacade DeactivateDigitalLine() 	 {return element(By.id("j_id0:opportunityToDigitalForm:j_id868:j_id1102")); }
	private WebElementFacade createNewOppFromSelected()  {return element(By.name("j_id0:opportunityToDigitalForm:j_id868:j_id1103")); }
	
	

	public void chooseDigitalProducts()
	{
		
		clickOnAddDigitalProducts().click();
		waitFor(5).seconds();
		selectProduct().click();
		waitFor(1).second();
		addProduct().click();	
		waitFor(1).second();
		clickOnNext().click();
		waitFor(5).seconds();
		
	}
public void createDigitalLine()
{
	enterSalesPrice().type("100");
	waitFor(1).second();
	saveDigitalLines().click();
	waitFor(5).seconds();
}

public void editLines()
{
	selectDigitalLine().click();
	waitFor(5).seconds();
	editDigitalLine().click(); 
	waitFor(5).seconds();
	enterSalesPrice().type("100");
	waitFor(1).second();
	saveDigitalLines().click();
	waitFor(5).seconds();
}

public void deactivateLines()
{
	selectDigitalLine().click();
	waitFor(5).seconds();
	DeactivateDigitalLine().click(); 
	waitFor(5).seconds();
}

public void createNewOppFromSelectedLines()
{
	selectDigitalLine().click();
	waitFor(5).seconds();
	createNewOppFromSelected().click(); 
	waitFor(5).seconds();
}
}