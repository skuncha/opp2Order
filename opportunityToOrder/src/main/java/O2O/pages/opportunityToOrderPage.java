package O2O.pages;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;

import net.thucydides.core.Thucydides;
import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * @author srinivasa.kuncha
 *
 */
public class opportunityToOrderPage extends PageObject  {
	
	/******** Define Elements of Opportunity Registration Tab **********************************************************************************************/
	
	private WebElementFacade clickOnOppToOrderBtn() { 		return element(By.cssSelector("input[value='Opportunity To Order']")); 							}
	private WebElementFacade oppName() 				{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id62:j_id66")); 					}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id96:j_id100")); 					}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id138:j_id142")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id150:j_id154")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id102:j_id106")); 				}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id156:j_id160")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id90:j_id94")); 					}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id115:j_id119")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id108:j_id112"));					}
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id60:j_id61:j_id79:agencyFieldPanel']/select/option[2]"));	}
	private WebElementFacade selectBillingAgency1() { 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id60:j_id61:j_id79:j_id84:agencyFieldPanel']/select/option[2]"));	}
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id61:j_id137")); 						}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id202")); 								}
	private WebElementFacade clickOppEditBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id204")); 								}
	private WebElementFacade clickOppDeleteBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id60:j_id205")); 								}
	
	
	/*private WebElementFacade oppName() 			{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id49:j_id53")); 					}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id83:j_id87")); 					}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id125:j_id129")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id137:j_id141")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id89:j_id93")); 					}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id143:j_id147")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id77:j_id81")); 					}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id102:j_id106")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id95:j_id99"));					}
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.name("//*[@id='j_id0:opportunityForm:j_id47:j_id48:j_id66:agencyFieldPanel']/select/option[2]"));					}
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id48:j_id124")); 						}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id189")); 								}
	private WebElementFacade clickOppEditBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id191")); 								}
	private WebElementFacade clickOppDeleteBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id47:j_id192")); 								}*/
	
	/******** Define Elements of OpportunityLine Tab **********************************************************************************************************************/
	private WebElementFacade clickOnNewOppLineBtn() { 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id212")); 										}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:fieldsSection:j_id289:j_id292")); 		}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:fieldsSection:j_id260:j_id266")); 		}
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:fieldsSection:j_id298:j_id300")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:fieldsSection:j_id301:j_id305")); 		}
	private WebElementFacade enterYield() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:fieldsSection:j_id306:j_id310")); 		}
	
	/*private WebElementFacade clickOnNewOppLineBtn(){ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id199")); 										}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:fieldsSection:j_id272:j_id275")); 		}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:fieldsSection:j_id247:j_id253")); 		}
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:fieldsSection:j_id280:j_id282")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:fieldsSection:j_id283:priceInputId")); 	}
	private WebElementFacade enterYield() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:fieldsSection:j_id287:yieldInputId")); 	}*/
	
	/******** Define Elements of DM Display Package  *******************************************************************************************************************************/
	
	private WebElementFacade selectTitle() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:0:j_id314:j_id318")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:1:j_id314:j_id318")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:2:j_id314:j_id318")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:3:j_id314:j_id318")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:4:j_id314:j_id318")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id329:selectedInsertionDates"));	} //  example date format "19/03/2015"
	private WebElementFacade enterInsertionPO() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id339:j_id342")); 			}
	private WebElementFacade selectSize() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id343:j_id345")); 			}
	private WebElementFacade enterSizeColumns() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id343:j_id348")); 			}
	private WebElementFacade enterSizeCMs() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id343:j_id350")); 			}
	
	/*private WebElementFacade selectTitle() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:0:j_id294:j_id298")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:1:j_id294:j_id298")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:2:j_id294:j_id298")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:3:j_id294:j_id298")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:4:j_id294:j_id298")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id304:selectedInsertionDates"));	} //  example date format "19/03/2015"
	private WebElementFacade enterInsertionPO() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id314:j_id317")); 			}
	private WebElementFacade selectSize() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id318:j_id320")); 			}
	private WebElementFacade enterSizeColumns() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id318:coloumnsInputId")); 	}
	private WebElementFacade enterSizeCMs() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id318:cmsInputId")); 		}*/
	
	/******** Define Elements For MailPlus Package  ********************************************************************************************************************************/
	
	private WebElementFacade selectWebsite()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:1:j_id314:j_id318")); 	}
	private WebElementFacade selectAdUnit()			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id313:4:j_id314:j_id318")); 	}
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id311:0:j_id312:j_id335:j_id338")); 			}
	private WebElementFacade clickOppLineCancel()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id367")); 										}
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id372")); 										}
	private WebElementFacade clickAddtoOppLine()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id375")); 										}
	private WebElementFacade clickAddtoOppLineandCopy(){ 	return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id214:0:j_id378")); 										}
	
	/*private WebElementFacade selectWebsite()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:1:j_id294:j_id298")); 	}
	private WebElementFacade selectAdUnit()			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:4:j_id294:j_id298")); 	}
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id310:j_id313")); 			}
	private WebElementFacade selectDistribution()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id291:0:j_id292:j_id293:4:j_id294:j_id298")); 	}
	private WebElementFacade clickOppLineCancel()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id329")); 										}
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id334")); 										}
	private WebElementFacade clickOppLineSaveNew()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id337")); 										}
	private WebElementFacade clickOppLineSaveCopy()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id201:0:j_id340")); 										}*/
	
	/******** Define Elements of Opportunity Line which will be converted to Order in CCI ***************************************************************************************************/	

	private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id510:0:j_id512")); 										 }
	private WebElementFacade clickOnCreateSelectedLineinCCI(){ 		return element(By.name("j_id0:opportunityToPrintForm:j_id210:j_id662")); 												 }
	private WebElementFacade clickOnEditOppLineImgBtn()		 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id210:singleInsertionPanel']/table/tbody/tr/td[2]/img"));}
	private WebElementFacade clickOnCancelOppLineImgBtn()	 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id210:singleInsertionPanel']/table/tbody/tr/td[4]/img"));}
	
	/*private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id466:0:j_id468")); 										 }
	private WebElementFacade clickOnCreateSelectedLineinCCI(){ 		return element(By.name("j_id0:opportunityToPrintForm:j_id197:j_id611")); 												 }
	private WebElementFacade clickOnEditOppLineImgBtn()		 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id197:singleInsertionPanel']/table/tbody/tr/td[2]/img"));}
	private WebElementFacade clickOnCancelOppLineImgBtn()	 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id197:singleInsertionPanel']/table/tbody/tr/td[4]/img"));}*/
	
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
			for (Map<String, String> record : testDataSrc.getData()) {
				try {
					waitFor(4).seconds();
					oppName().type(record.get("oppName"));
					selectOppStage().selectByVisibleText(record.get("oppStage"));
					enterOppStartDate().type(record.get("oppStartDate")); 
					enterOppEndDate().type(record.get("oppEndDate"));	
					enterOppCloseDate().type(record.get("oppCloseDate")); 
					enterOppEstdVal().type(record.get("oppEstdValue"));	
					selectOppType().selectByVisibleText(record.get("oppType"));
//					selectBillingAgency().click();
					selectOppContactRole().selectByVisibleText(record.get("oppContactRole")); 
//					selectNewBusinessCB().selectByVisibleText(record.get("oppName"));  
//					selectContact().selectByVisibleText(record.get("oppContactRole")); 		
				} catch (Exception e1) {}
			}
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
		waitFor(10).seconds();
		
	}
	public void clickOnNewOpportunityLine(){
		clickOnNewOppLineBtn().click();
		waitFor(5).seconds();
	}
	public void createOpportunityLineUsingCSV(String CSVfile) throws Exception {
		File filePath = new File(CSVfile);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
			for (Map<String, String> record : testDataSrc.getData()) {
				try {
		selectBillingAgent().selectByVisibleText(record.get("billingAgent"));
		selectPackage().selectByVisibleText(record.get("package"));
		waitFor(5).seconds();
		enterOrderPO().type(record.get("insertionPO"));
		waitFor(1).seconds();
//		selectTitle().selectByVisibleText(record.get("title"));
		selectPublication().selectByVisibleText(record.get("publication"));
		waitFor(5).seconds();
		selectSection().selectByVisibleText(record.get("section"));
		waitFor(6).seconds();
		selectSubSection().selectByVisibleText(record.get("subsection"));
		waitFor(5).seconds();
		selectZones().selectByVisibleText(record.get("zones"));
		waitFor(5).seconds();
		enterInsertionDate().typeAndTab(record.get("insertionDate"));
		waitFor(1).seconds();
		selectSize().selectByVisibleText(record.get("size"));
		waitFor(1).seconds();
		enterInsertionPO().type(record.get("insertionPO"));
		waitFor(1).seconds();
				} catch (Exception e1) {}
			}
		}
	}
	public void validateOppotunityLineRecord(){
		Thucydides.takeScreenshot();
		clickOppLineSave().click();
		waitFor(14).seconds();
	}
	public void selectOpportunityLinesToConvertAsOrders(){
		selectOppLineToBeConvertedCB().click();
		waitFor(4).seconds();
	}
	public void convertApprovedOppLinesAsOrder(){
		clickOnCreateSelectedLineinCCI().click();
		waitFor(45).seconds();
	}
	
}
