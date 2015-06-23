package O2O.pages;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.Thucydides;
import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * @author srinivasa.kuncha
 *
 */
public class opportunityToOrderPage extends PageObject  {
	
	/******** Define Elements of Opportunity Registration Tab *******************************************************************************************************************************************************************/
	
	private WebElementFacade clickOnOppToOrderBtn() { 		return element(By.cssSelector("input[value='Opportunity To Order']")); 							}
	private WebElementFacade oppName() 				{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id62:j_id66")); 					}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id96:j_id100")); 					}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id139:j_id143")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id151:j_id155")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id102:j_id106")); 				}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id157:j_id161")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id90:j_id94")); 					}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id116:j_id120")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id108:j_id112"));					}
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id60:j_id61:j_id79:agencyFieldPanel']/select/option[2]"));	}
	private WebElementFacade selectBillingAgency1() { 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id60:j_id61:j_id79:j_id84:agencyFieldPanel']/select/option[2]"));	}
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id137")); 						}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id203")); 								}
	private WebElementFacade clickOppEditBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id205")); 								}
	private WebElementFacade clickOppDeleteBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id206")); 								}
	
	/******** Define Elements of OpportunityLine Tab **********************************************************************************************************************/
	private WebElementFacade clickOnNewOppLineBtn() { 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id213")); 										}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:fieldsSection:j_id280:j_id283")); 		}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:fieldsSection:j_id261:j_id267")); 		}
	private WebElementFacade selectBillingAgent1() 	{ 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id211:j_id215:0:fieldsSection:j_id261:line_billingAgentFieldPanel']/div/select/option[2]")); }
	
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:fieldsSection:j_id289:j_id291")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:fieldsSection:j_id292:j_id296")); 		}
	private WebElementFacade enterYield() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:fieldsSection:j_id297:j_id301")); 		}
	
	/******** Define Elements of DM Display Package  *******************************************************************************************************************************/
	
	private WebElementFacade selectTitle() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:0:j_id305:j_id309")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:1:j_id305:j_id309")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:2:j_id305:j_id309")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:3:j_id305:j_id309")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:4:j_id305:j_id309")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id320:selectedInsertionDates"));	} //  example date format "19/03/2015"
/*	private WebElementFacade enterInsertionPO() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id330:j_id333")); 			}*/
	private WebElementFacade selectSize() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id331:j_id333")); 			}
	private WebElementFacade enterSizeCMs() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id336:j_id347")); 			}
	private WebElementFacade enterSizeColumns() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id336:j_id349")); 			}
	
	/******** Define Elements For MailPlus Package  ********************************************************************************************************************************/
	
	private WebElementFacade selectWebsite()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:1:j_id305:j_id309")); 	}
	private WebElementFacade selectAdUnit()			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id304:4:j_id305:j_id309")); 	}
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id302:0:j_id303:j_id326:j_id329")); 			}
	private WebElementFacade clickOppLineCancel()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id366")); 										}
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id371")); 										}
	private WebElementFacade clickAddtoOppLine()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id374")); 										}
	private WebElementFacade clickAddtoOppLineandCopy(){ 	return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id215:0:j_id377")); 										}
	
	/******** Define Elements of Opportunity Line which will be converted to Order in CCI ***************************************************************************************************/	

	private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.xpath("//*[@id='j_id0:opportunityToPrintForm:j_id211:singleInsertionPanel']/table/tbody/tr[1]/td[1]/input")); 										 }
	private WebElementFacade clickOnCreateSelectedLineinCCI(){ 		return element(By.name("j_id0:opportunityToPrintForm:j_id211:j_id662")); 												 }
	private WebElementFacade clickOnEditOppLineImgBtn()		 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id211:singleInsertionPanel']/table/tbody/tr/td[2]/img"));}
	private WebElementFacade clickOnCancelOppLineImgBtn()	 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id211:singleInsertionPanel']/table/tbody/tr/td[4]/img"));}
	 private WebElementFacade addPackage()   	 			 { return element(By.xpath("//fieldset/div/div/div/h4/a/span"));									}
	 private WebElementFacade selectModule()   	 			 { return element(By.id("Order.Schedule.Material:material.moduleCode"));							}
	 private WebElementFacade acceptOrder()   	 			 { return element(By.xpath("//nav[button='Accept']/button[3]"));									} 
/***********************************************************************************************************************************************************************************************************************************/
	
	public void clickOnOpportunityToOrder(){
		waitFor(3).seconds();
		clickOnOppToOrderBtn().click();
		waitFor(2).seconds();
		
	}
	
	public void createOpportunityUsingCSV(String CSVfile) throws Exception {

		File filePath = new File(CSVfile);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
			try {
			for (Map<String, String> record : testDataSrc.getData()) {
				
					waitFor(4).seconds();
					oppName().type(record.get("oppName"));
					selectOppStage().selectByVisibleText(record.get("oppStage"));
					enterOppStartDate().type(record.get("oppStartDate")); 
					enterOppEndDate().type(record.get("oppEndDate"));	
					enterOppCloseDate().type(record.get("oppCloseDate")); 
					enterOppEstdVal().type(record.get("oppEstdValue"));	
					selectOppType().selectByVisibleText(record.get("oppType"));
					selectOppContactRole().selectByVisibleText(record.get("oppContactRole")); 
			}
			} catch (Exception e1) {}
		}
	}
	public void selectContactForOpportunity(String contact){
		
		/*System.out.println("Contact id is ----------------------------------------------------> "+contact);*/
		selectContact1().selectByVisibleText(contact);
	}
	
	public void selectAgencyToBeBilled(String CustomerAccount){
		
		if (CustomerAccount.equalsIgnoreCase("Brand") || CustomerAccount.equalsIgnoreCase("Client")){
			waitFor(2).second();
			try{
			selectBillingAgency().click();
			}catch (Exception nosuchelement) { }
		}
	}
	public void validateOppotunityRecord(){
		waitFor(1).second();
		clickOppSaveBtn().click();
		waitFor(15).seconds();
		
	}
	public void clickOnNewOpportunityLine(){
		clickOnNewOppLineBtn().click();
		waitFor(3).seconds();
	}
	public void createOpportunityLineUsingCSV(String CSVfile) throws Exception {
		File filePath = new File(CSVfile);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
			for (Map<String, String> record : testDataSrc.getData()) 
			{
				try {
						/*if (record.get("accType").equalsIgnoreCase("Brand") || record.get("accType").equalsIgnoreCase("Client") || record.get("accType").equalsIgnoreCase("Direct Advertiser")) // 1
						{ */
						/*	clickOnNewOppLineBtn().click();
							waitFor(5).seconds();*/
					        selectBillingAgent().selectByVisibleText(record.get("billingAgent"));
							waitFor(4).seconds();
							selectPackage().selectByVisibleText(record.get("package"));
							waitFor(10).seconds();
							enterOrderPO().type(record.get("insertionPO"));
							waitFor(1).seconds();
					//		selectTitle().selectByVisibleText(record.get("title"));
							selectPublication().selectByVisibleText(record.get("publication"));
							waitFor(10).seconds();
							selectSection().selectByVisibleText(record.get("section"));
							waitFor(10).seconds();
							selectSubSection().selectByVisibleText(record.get("subsection"));
							waitFor(10).seconds();
							selectZones().selectByVisibleText(record.get("zones"));
							waitFor(10).seconds();
							enterInsertionDate().typeAndTab(record.get("insertionDate"));
							waitFor(1).seconds();
						/*	selectSize().selectByVisibleText(record.get("size"));
							waitFor(4).seconds();
							enterInsertionPO().type(record.get("insertionPO"));
							waitFor(1).seconds();
							clickOppLineSave().click(); // 1
							waitFor(10).seconds();*/
							clickOppLineSave().click();
							waitFor(15).seconds();
							Thucydides.takeScreenshot();
						// }	
				} catch (Exception e1) {// clickOppLineCancel().click();waitFor(3).seconds(); 
	        	  						}    
	          }
			} 
	}
	public void validateOppotunityLineRecord(){
		
		/*clickOppLineSave().click();
		waitFor(15).seconds();*/
		System.out.println("OppLine Creation successful --> :  "+getDriver().getCurrentUrl());
		Thucydides.takeScreenshot();
		
	}
	public void selectOpportunityLinesToConvertAsOrders(){
		selectOppLineToBeConvertedCB().click();
		waitFor(4).seconds();
	}
	public void convertApprovedOppLinesAsOrder(){
		clickOnCreateSelectedLineinCCI().click();
		waitFor(50).seconds();
		 addPackage().click();
		 waitFor(4).seconds();
		 selectModule().selectByVisibleText("10x2");
		 acceptOrder().click();
		 waitFor(12).seconds();
		 try {
	    	 WebDriverWait wait1 = new WebDriverWait(getDriver(), 3);
	    	 if(wait1.until(ExpectedConditions.alertIsPresent())!=null)
	    	      getDriver().switchTo().alert().accept();
	    	 }
	    	 catch (Exception x) {}
	}
	
}
