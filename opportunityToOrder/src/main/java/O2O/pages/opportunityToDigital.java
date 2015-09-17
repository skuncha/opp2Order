package O2O.pages;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class opportunityToDigital extends PageObject {
	
	public static String lnDesc, oppName;
	long timeNow = System.currentTimeMillis();
	
	private WebElementFacade accountMapping() 			 {	return element(By.xpath("//div[15]/div/div/div/table/tbody/tr/td[2]/input")); 			}
	private WebElementFacade sourceSystem() 			 {	return element(By.id("00ND0000005WVcR")); 												}
	private WebElementFacade customerRef() 			 	 {	return element(By.id("00ND0000005WVcQ")); 												}
	private WebElementFacade accountMappingSave() 		 {	return element(By.xpath("//*[@id='bottomButtonRow']/input[1]")); 						}
	private WebElementFacade clickOnAddDigitalProducts() {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id912"));   				}
	private WebElementFacade selectProduct() 		     {	return element(By.xpath("//div[@id='j_id0:opportunityToDigitalForm:j_id880:j_id915:j_id916:multiselectPanel']/table/tbody/tr/td/select/option[13]")); }
	private WebElementFacade addProduct() 				 {	return element(By.xpath("//div[2]/a/img")); 							   				}
	private WebElementFacade clickOnNext() 				 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id950"));   				}
	private WebElementFacade enterSalesPrice() 			 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id985:0:j_id1014")); 	}
	private WebElementFacade saveDigitalLines() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1035")); 				}
	private WebElementFacade selectDigitalLine() 		 {	return element(By.xpath("//span[3]/table/tbody/tr/td/input")); 							}
	private WebElementFacade editDigitalLine() 		 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1111")); 				}
	private WebElementFacade deactivateDigitalLine() 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1112")); 				}
	private WebElementFacade deactivateReason() 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1069:j_id1070")); 		}
	private WebElementFacade deactivateReasonSave() 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1074")); 				}
	private WebElementFacade refreshTable() 			 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1077")); 				}
	private WebElementFacade createNewOppFromSelected()  {	return element(By.name("j_id0:opportunityToDigitalForm:j_id880:j_id1113")); 			}
	private WebElementFacade opportunityCopy()  		 {	return element(By.xpath("//*[@id='j_id0:sectionHeaderPanel']/div[1]/div/div[1]/h2")); 	}
	private WebElementFacade lineDescription() 	 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id985:0:j_id1019")); 	}
	private WebElementFacade lineDescFromTable() 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id880:j_id1082:0:j_id1092")); 	}
	private WebElementFacade closedWon() 	 	 		 {	return element(By.id("j_id0:opportunityForm:j_id85:j_id272"));					 		}
	private WebElementFacade oppStage() 			 	 {  return element(By.id("j_id0:opportunityForm:j_id85:j_id213:j_id224"));					}
	private WebElementFacade closedLost() 	 	 		 {	return element(By.id("j_id0:opportunityForm:j_id85:j_id274"));					 		}
	private WebElementFacade closedLostreason() 		 {  return element(By.id("j_id0:opportunityForm:j_id85:j_id208:j_id209"));					}
	private WebElementFacade closedLostSave() 			 {  return element(By.id("j_id0:opportunityForm:j_id85:j_id275"));							}
	private WebElementFacade oppClosedError() 			 {	return element(By.xpath("//*[@id='j_id0:opportunityToDigitalForm:j_id880:j_id881']/div[2]/table/tbody/tr/td[2]/span")); }
	
	
	public void mapAccountWithSourceSystem() {
		
		String customDetailsPage = getDriver().getCurrentUrl(); 
		accountMapping().click();
		waitFor(3).seconds();
		sourceSystem().selectByVisibleText("Operative One"); // Hard coded because it is the only value is valid
		waitFor(1).second();
		customerRef().type("DT - " + timeNow);
		accountMappingSave().click();
		waitFor(3).seconds();
		getDriver().get(customDetailsPage);
		waitFor(5).seconds();
	}
	
	
	public void addDigitalProducts() {

		clickOnAddDigitalProducts().click();
		waitFor(5).seconds();
	}

	public void createDigitalLine() {
		
		selectProduct().click();
		waitFor(1).second();
		addProduct().click();
		waitFor(1).second();
		clickOnNext().click();
		waitFor(5).seconds();
		enterSalesPrice().type("100");
		waitFor(1).second();
		saveDigitalLines().click();
		waitFor(5).seconds();
	}

	public void editLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		editDigitalLine().click();
		waitFor(5).seconds();
		lineDescription().typeAndTab("test description");
		waitFor(1).second();
		saveDigitalLines().click();
		waitFor(5).seconds();
		lnDesc = lineDescFromTable().getText();
		assertThat(lnDesc,is(equalTo("test description")));
	}

	public void deactivateLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		deactivateDigitalLine().click();
		waitFor(5).seconds();
		deactivateReason().selectByVisibleText("Created in error");
		deactivateReasonSave().click();
		waitFor(3).seconds();
		refreshTable().click();
		waitFor(3).seconds();
	}

	public void createNewOppFromSelectedLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		createNewOppFromSelected().click();
		waitFor(8).seconds();
		oppName = opportunityCopy().getText();
		assertThat(oppName,is(equalTo("Srini Sanity Test-Copy")));
		System.out.println("Copied Opportunity is :     "+getDriver().getCurrentUrl());
	}
	
	public void oppStageAsClosedWon(){
		closedWon().click();
		waitFor(6).seconds();
	}
	public void OppStageShouldBeChanged(){
		String str = oppStage().getText();
		assertThat(str,is(equalTo("Closed Won")));
	}
	
	public void oppStageAsClosedLost(){
		closedLost().click();
		waitFor(5).seconds();
		closedLostreason().selectByVisibleText("Entered in Error");
		waitFor(1).seconds();
		closedLostSave().click();
		waitFor(4).seconds();
	}
	public void OppStageShouldBeClosedLost(){
		String str = oppStage().getText();
		assertThat(str,is(equalTo("Closed Lost")));
	}
	
	public void errorMessageWhenOppIsClosed(String errMessage){
		clickOnAddDigitalProducts().click();
		waitFor(3).seconds();
		String str = oppClosedError().getText();
		assertThat(str,is(equalTo(errMessage)));
		
	}
	
}