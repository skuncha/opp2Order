package O2O.jbehave;

import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import O2O.steps.EndUserSteps;

/**
 * @author srinivasa.kuncha
 *
 */
public class DefinitionSteps {

    @Steps
    EndUserSteps salesExecutive;
    
    
    @Given("Sales Executive is on the Salesfoce Login Page")
    public void homepage(){
    	salesExecutive.accesshomepage();
    }
    
    @When(" Sales Executive login to glue with valid credentials by supplying $username and $password")
    public void userCredentials(String username, String password)
    {
    	salesExecutive.supplyCredentialsToLogin(username, password);
    }
    
    @When(" Sales Executive set debug log on")
    public void debuglog(){
    	salesExecutive.setDebugLog();
    }
 /*   @When("Sales Executive verify debug log")
    public void verifydebuglog() throws Exception{
    	salesExecutive.verifydebuglog();
    }*/
    
    @Then(" Sales Executive should be able to login to glue successfully")
    public void successfulLogin(){
    	salesExecutive.isLoginSuccessful();
    }
    
    @When("  Sales Executive clicks on 'Accounts' Tab on glue Home page")
    public void clickOnAccountsTabOnHomePage(){
    	salesExecutive.clickOnAccountTab();
    }
    
/*    @When("  Sales Executive clicks on 'New' button")
    public void clickOnNewButtonUnderAccountsTab(){
    	salesExecutive.clickOnNewBtnUnderAccountsTab();
    }*/
    @When("  Sales Executive search for an account on Account Search Screen using $searchAccountName")
    public void clickOnSearchButtonFromAccountsSearchScreen(String searchAccountName){
    	salesExecutive.searchForCustomerPreviousAccount(searchAccountName);
    }
    
    @When("  Sales Executive clicks on 'NewAccount' button from search results section")
    public void clickOnNewAccountButtonUnderSearchResults(){
    	salesExecutive.clickOnNewBtnUnderSerachResults();
    }
    
    @When(" Sales Executive selects record type as '$Advertiser' and clicks on 'Continue' button")
    public void clickOnContinueButtonUnderRecrodTypeSection(String Advertiser)
    {
    	salesExecutive.selectRecrodType(Advertiser);
    }
    @When(" Sales Executive supply input as required to create customer account:$AccountTable")
    public void supplyInputValuesToCustomerNewAccount(ExamplesTable AccountTable){
    	Map<String, String> adviserMandValues = new HashMap<String, String>();
		for (Map<String, String> row : AccountTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			adviserMandValues.put(fieldName, fieldValue);
		}
		salesExecutive.supplyMandatoryFieldsForAdviserAccount(adviserMandValues);
    }
    @When("  Sales Executive clicks on 'Save' button")
    public void clickOnSaveButton(){
    	salesExecutive.saveCustomerRecrod();
    }
    @Then("Sales Executive should be able to create new customer account successfully")
    public void customerRecrodShouldBeCreatedSuccessfully(){
    	salesExecutive.recrodShouldBeCreatedSuccessfully();
    }
    @When("Sales Executive makes Booking Agency association with client")
    public void associateAgency(){
    	salesExecutive.associateBookingAgency();
    }
    @Then("Sales Executive should be able to create Agency association with client successfully")
    public void associationSuccessfull(){
    	
    }
    @When("Sales Executive clicks on 'new Contact' button to create contact record for customer:$ContactTable")
    public void createContactforCustomer(ExamplesTable ContactTable){
    	Map<String, String> contactMandValues = new HashMap<String, String>();
		for (Map<String, String> row : ContactTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			contactMandValues.put(fieldName, fieldValue);
		}
		salesExecutive.createNewContact(contactMandValues);
    }
    @Then("Sales Executive should be able to create contact successfully")
    public void contactRecordshouldBeCreatedSuccessfully(){
    	salesExecutive.isContactRecrodCreated();
    }
    @When("Sales Executive clicks on edit button to create Industry Category")
	public void editIndustryCategory(){
    	salesExecutive.editIndustryCategory();
	}
	@When("  Sales Executive supply input for $mainCategory, $subCategory and $minorCategory")
	public void selectCategoryValues(String mainCategory, String subCategory, String minorCategory){
		salesExecutive.selectCategoryValues(mainCategory, subCategory, minorCategory);
	}
	@When("  Sales Executive clicks on Save button")
	public void createIndustryCategory(){
		salesExecutive.createIndustryCategory();
	}
	@When("Sales Executive integrates customer account with CCI")
	public void linkBookingAgencyAccountWithCCI() {
		salesExecutive.linkBookingAgencyAccountWithCCIMail();
	}
	@When("  Sales Executive clicks on a record under Account Mapping Tab")
	public void clickOnAccountMapping() {
		salesExecutive.accessAccountMapping();
	}
	@Then("Sales Executive should see customer account mapping details returned from CCI when verified")
	public void checkAccountMapping() {
		salesExecutive.validateAccountMappingDetails();
	}	
	@When("Sales Executive clicks on a record under Finance Account Tab")
	public void clickOnFinanceAccount() {
		salesExecutive.accessFinanceAccount();
	}
	@Then("Sales Executive should see finance account details")
	public void checkFinanceAccountDetails(){
		salesExecutive.checkFinanceAccountDetails();
	}
	@When("Sales Executive clicks on 'Opportunity To Order' link to create Opportunity")
	public void clickOnOpportunityToOrderButton(){
		salesExecutive.clickOnOpportunityToOrder();
	}
	@When(" Sales Executive supplies input data from CSV $file to create Opportunity")
	public void supplyInputForOpportunity(String file) throws Exception{
		salesExecutive.supplyInputForNewOpportunity(file);
	}
	@Then("Sales Executive should be able to create Opportunity successfully")
	public void verifyOppotunityRecord(){
		salesExecutive.validateOppotunityRecord();
	}
	@When("Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line")
	public void clickOnNewOpportunityLineButton(){
		salesExecutive.clickOnNewOpportunityLine();
	}
	@When(" Sales Executive supplies input data from CSV $file to create Opportunity Line")
	public void supplyInpurForNewOpportunityLine(String file) throws Exception{
		salesExecutive.supplyInputForNewOpportunityLine(file);
	}
	@Then("Sales Executive should be able to create Opportunity Line successfully")
	public void verifyOppotunityLineRecord(){
		salesExecutive.validateOppotunityLineRecord();
	}
	@When("Sales Executive selects 'Opportunity Line(s)' to be converted as an Order")
	public void selectOpportunityLineThatNeedsToBeConverted(){
		salesExecutive.selectOpportunityLine();
	}
	@Then("Sales Executive should be able to open Order plugin with Opportunity Line details successfully")
	public void clickOnConvertButton(){
		salesExecutive.convertSelectedOpportunityLines();
	}
}
