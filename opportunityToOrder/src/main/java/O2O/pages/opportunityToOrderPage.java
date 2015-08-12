package O2O.pages;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	private WebElementFacade oppName() 				{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id66:j_id70")); 					}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id104:j_id108")); 					}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id146:j_id150")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id158:j_id162")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id111:j_id115")); 				}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id164:j_id168")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id98:j_id102")); 					}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id125:j_id128")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id117:j_id121"));					}
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id64:j_id65:j_id85:agencyFieldPanel']/select/option[2]"));	}
	private WebElementFacade selectBillingAgency1() { 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id60:j_id61:j_id79:j_id84:agencyFieldPanel']/select/option[2]"));	}
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id65:j_id145")); 						}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id238")); 								}
	/*private WebElementFacade clickOppEditBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id240")); 								}
	private WebElementFacade clickOppDeleteBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id241")); 								}
	private WebElementFacade clickOppCloseWon() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id243")); 								}
	private WebElementFacade clickOppCloseLost() 	{ 		return element(By.name("j_id0:opportunityForm:j_id64:j_id245")); 								}*/
	
	/******** Define Elements of OpportunityLine Tab *******************************************************************************************************************************/
	private WebElementFacade clickOnNewOppLineBtn() { 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id264")); 										}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:fieldsSection:j_id308:j_id312")); 		}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:fieldsSection:j_id325:j_id328")); 		}
	private WebElementFacade selectBillingAgent1() 	{ 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id212:j_id216:0:fieldsSection:j_id260:line_billingAgentFieldPanel']/div/select/option[2]")); }
	
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:fieldsSection:j_id334:j_id338")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:fieldsSection:j_id340:j_id345")); 		}
	private WebElementFacade enterYield() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:fieldsSection:j_id349:j_id353")); 		}
	
	/******** Define Elements of DM Display Package  *******************************************************************************************************************************/
	
	private WebElementFacade selectTitle() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:0:j_id360:j_id364")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:1:j_id360:j_id364")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:2:j_id360:j_id364")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:3:j_id360:j_id364")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:4:j_id360:j_id364")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id375:selectedInsertionDates"));	} //  example date format "19/03/2015"
	/*private WebElementFacade selectSize() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id261:j_id265:0:j_id352:0:j_id354:j_id386:j_id388")); 			}
	private WebElementFacade enterSizeCMs() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id261:j_id265:0:j_id352:0:j_id354:j_id392:j_id394")); 			}
	private WebElementFacade enterSizeColumns() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id261:j_id265:0:j_id352:0:j_id354:j_id395:j_id397")); 			}*/
	
	/******** Define Elements For MailPlus Package  ********************************************************************************************************************************/
	
	/*private WebElementFacade selectWebsite()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:0:j_id360:j_id364")); 	}
	private WebElementFacade selectAdUnit()			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id356:0:j_id358:j_id359:4:j_id360:j_id364")); 	}
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id261:j_id265:0:j_id352:0:j_id354:j_id377:j_id380")); 			}
	private WebElementFacade clickOppLineCancel()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id249:j_id253:0:j_id396")); 										}
	private WebElementFacade clickSaveAndNew()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id426")); 										}
	private WebElementFacade clickSaveAndCopy()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id429")); 											}*/
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id266:0:j_id423")); 										}
	/******** Define Elements of Opportunity Line which will be converted to Order in CCI ***************************************************************************************************/	

	 private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.xpath("//*[@id='j_id0:opportunityToPrintForm:j_id262:singleInsertionPanel']/table/tbody/tr/td[1]/input")); }
	 private WebElementFacade clickOnCreateSelectedLineinCCI()	 { 		return element(By.name("j_id0:opportunityToPrintForm:j_id262:j_id722")); 												 }
	 /*private WebElementFacade clickOnEditOppLineImgBtn()		 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id245:singleInsertionPanel']/table/tbody/tr/td[2]/img"));}
	 private WebElementFacade clickOnCancelOppLineImgBtn()	 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id245:singleInsertionPanel']/table/tbody/tr/td[4]/img"));}*/
	 private WebElementFacade addPackage()   	 			 { return element(By.xpath("//fieldset/div/div/div/h4/a/span"));									}
	 private WebElementFacade selectModule()   	 			 { return element(By.id("Order.Material:material.moduleCode"));										}
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
					waitFor(1).second();
					selectOppStage().selectByVisibleText(record.get("oppStage"));
					waitFor(3).second();
					enterOppStartDate().type(record.get("oppStartDate"));
					enterOppEndDate().type(record.get("oppEndDate"));	
					enterOppCloseDate().type(record.get("oppCloseDate")); 
					waitFor(1).second();
					enterOppEstdVal().type(record.get("oppEstdValue"));	
					waitFor(1).second();
					selectOppType().selectByVisibleText(record.get("oppType"));
					waitFor(2).second();
					selectOppContactRole().selectByVisibleText(record.get("oppContactRole")); 
					waitFor(2).second();
			}
			} catch (Exception e1) {}
		}
	}
	public void selectContactForOpportunity(String contact){
		
		/*System.out.println("Contact id is ----------------------------------------------------> "+contact);*/
		try{
			selectContact1().selectByVisibleText(contact);
		} catch (Exception defalutelement) {
			
			System.out.println(" Account Type is Private Advertiser ");
		}
		
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
		waitFor(4).seconds();
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
					        /*selectBillingAgent().selectByVisibleText(record.get("billingAgent"));
							waitFor(4).seconds();*/
							selectPackage().selectByVisibleText(record.get("package"));
							waitFor(8).seconds();
							enterOrderPO().type(record.get("insertionPO"));
							waitFor(1).seconds();
							enterSalesPrice().type("1500");
							waitFor(1).seconds();
					//		selectTitle().selectByVisibleText(record.get("title"));
							selectPublication().selectByVisibleText(record.get("publication"));
							waitFor(8).seconds();
							selectSection().selectByVisibleText(record.get("section"));
							waitFor(6).seconds();
							selectSubSection().selectByVisibleText(record.get("subsection"));
							waitFor(6).seconds();
							selectZones().selectByVisibleText(record.get("zones"));
							waitFor(6).seconds();
							enterInsertionDate().typeAndTab(record.get("insertionDate"));
							waitFor(1).seconds();
						/*	selectSize().selectByVisibleText(record.get("size"));
							waitFor(4).seconds();
							enterInsertionPO().type(record.get("insertionPO"));
							waitFor(1).seconds();
							clickOppLineSave().click(); // 1
							waitFor(10).seconds();*/
							clickOppLineSave().click();
							waitFor(12).seconds();
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
		waitFor(6).seconds();
	}
	public void convertApprovedOppLinesAsOrder(){
		clickOnCreateSelectedLineinCCI().click();
		waitFor(45).seconds();
		 getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));
     	 WebElement element = getDriver().switchTo().activeElement();
     	 waitFor(2).seconds();
		 addPackage().click();
		 waitFor(6).seconds();
		 selectModule().selectByVisibleText("10x2");
		 waitFor(12).seconds();
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
