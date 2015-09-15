package O2O.pages;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	private WebElementFacade oppName() 				{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id87:j_id91")); 					}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id125:j_id129")); 				}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id167:j_id171")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id179:j_id183")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id132:j_id136")); 				}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id185:j_id189")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id119:j_id123")); 				}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id146:j_id149")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id138:j_id142"));					}
	
	private WebElementFacade selectAgency() 		{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id85:j_id86:j_id106:agencyFieldPanel']")); }
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id85:j_id86:j_id106:agencyFieldPanel']/div/select/option[2]")); }
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id166")); 						}
	private WebElementFacade selectPartnership() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id200:j_id203")); 				}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id267")); 								}
	/*private WebElementFacade clickOppEditBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id261")); 								}
	private WebElementFacade clickOppDeleteBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id262")); 								}
	private WebElementFacade clickOppCloseWon() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id264")); 								}
	private WebElementFacade clickOppCloseLost() 	{ 		return element(By.name("j_id0:opportunityForm:j_id85:j_id266")); 								}*/
	
	/******** Define Elements of OpportunityLine Tab ***************************************************************************************************************************************************************************/
	private WebElementFacade clickOnNewOppLineBtn() { 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id293")); 										}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:fieldsSection:j_id337:j_id341")); 		}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:fieldsSection:j_id356:j_id359")); 		}
	
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:fieldsSection:j_id365:j_id369")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:fieldsSection:j_id371:j_id375")); 		}
	private WebElementFacade enterYield() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:fieldsSection:j_id380:j_id383")); 		}
	
	/******** Define Elements of DM Display Package  ***************************************************************************************************************************************************************************/
	
	private WebElementFacade selectTitle() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id390:0:j_id391:j_id395")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id390:1:j_id391:j_id395")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id390:2:j_id391:j_id395")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id390:3:j_id391:j_id395")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id390:4:j_id391:j_id395")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id406:selectedInsertionDates"));	} //  example date format "19/03/2015"
	/*private WebElementFacade selectSize() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id377:0:j_id379:j_id411:j_id413")); 			}
	private WebElementFacade enterSizeCMs() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id377:0:j_id379:j_id417:j_id419")); 			}
	private WebElementFacade enterSizeColumns() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id377:0:j_id379:j_id420:j_id422")); 			}*/
	
	/******** Define Elements For MailPlus Package  ******************************************************************************************************************************************************/
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id387:0:j_id389:j_id412:j_id415")); 			}
	/*private WebElementFacade selectWebsite()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id377:0:j_id379:j_id380:0:j_id381:j_id385")); 	}
	private WebElementFacade selectAdUnit()			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id377:0:j_id379:j_id380:4:j_id381:j_id385")); 	}
	
	private WebElementFacade clickOppLineCancel()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id439")); 										}
	private WebElementFacade clickSaveAndNew()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id447")); 										}
	private WebElementFacade clickSaveAndCopy()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id283:j_id287:0:j_id450")); 											}*/
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id295:0:j_id454")); 										}
	private WebElementFacade acceptAlert()			{ 		return element(By.name("j_id0:popUpFrame2:j_id45")); }
	/******** Define Elements of Opportunity Line which will be converted to Order in CCI ***************************************************************************************************************/	

	 private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.xpath("//*[@id='inprogressTable']/tbody/tr[1]/td[1]/input")); }
	 private WebElementFacade clickOnCreateSelectedLineinCCI()	 { 		return element(By.name("j_id0:opportunityToPrintForm:j_id291:j_id765")); 												 }
	 /*private WebElementFacade clickOnEditOppLineImgBtn()		 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id245:singleInsertionPanel']/table/tbody/tr/td[2]/img"));}
	 private WebElementFacade clickOnCancelOppLineImgBtn()	 { 		return element(By.name("//*[@id='j_id0:opportunityToPrintForm:j_id245:singleInsertionPanel']/table/tbody/tr/td[4]/img"));}*/
	 private WebElementFacade addPackage()   	 			 { return element(By.xpath("//fieldset/div/div/div/h4/a/span"));									}
	 private WebElementFacade selectModule()   	 			 { return element(By.id("Order.Material:material.moduleCode"));										}
	 private WebElementFacade selectPrice()   	 			 { return element(By.xpath(".//*[@id='SchedulingAccordion']/div/div[3]/div[1]/h4/a/span"));			}
	 private WebElementFacade selectInsertion()   			 { return element(By.xpath("//*[@id='ActivePriceDetailView']/label[3]"));							}
	 private WebElementFacade selectedInsertionDate()		 { return element(By.xpath("//fieldset/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[2]/a"));		}
	 private WebElementFacade selectBasePrice()	 		 	 { return element(By.xpath("//tbody/tr[14]/td[1]/a"));												}
	 private WebElementFacade supplyPriceType()	 			 { return element(By.xpath("//*[@id=':overridePriceDetail']"));										}
	 private WebElementFacade supplyPrice()					 { return element(By.xpath("//tbody/tr[23]/td[3]/div/input"));										}
	 private WebElementFacade updateInsLevelRevenue() 		 { return element(By.xpath("//tbody/tr[23]/td[3]/div/span/button/i"));							    }
	 private WebElementFacade acceptOrder()   	 			 { return element(By.xpath("//nav[button='Accept']/button[3]"));									} 
	 private WebElementFacade orderID()      	 			 { return element(By.xpath(".//*[@id='SchedulingAccordion']/div/div[1]/div[2]/div/div[2]/fieldset/div[1]/div/p")); }
/***************************************************************************************************************************************************************************************************************/
	
	public void clickOnOpportunityToOrder(){
		waitFor(3).seconds();
		clickOnOppToOrderBtn().click();
		waitFor(4).seconds();
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
					waitFor(4).second();
					enterOppStartDate().type(record.get("oppStartDate"));
					waitFor(1).second();
					enterOppEndDate().type(record.get("oppEndDate"));
					waitFor(1).second();
					enterOppCloseDate().type(record.get("oppCloseDate")); 
					waitFor(1).second();
					enterOppEstdVal().type(record.get("oppEstdValue"));	
					waitFor(1).second();
					selectOppType().selectByVisibleText(record.get("oppType"));
					waitFor(2).second();
					selectOppContactRole().selectByVisibleText(record.get("oppContactRole")); 
					waitFor(1).second();
					selectNewBusinessCB().click();
					waitFor(1).second();
/*					selectDateflexCB().click();
					waitFor(2).second();*/
					try { selectPartnership().selectByVisibleText("No"); 
					} catch (Exception noElement) {System.out.println("*** Mail Display users no need to fill Partnership field *** "); }
					waitFor(1).second();
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
			selectAgency().click();
			waitFor(2).second();
			selectBillingAgency().click();
			waitFor(5).second();
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
							waitFor(5).seconds();
							enterOrderPO().type(record.get("insertionPO"));
							waitFor(1).seconds();
							enterSalesPrice().type("2000");
							waitFor(1).seconds();
					//		selectTitle().selectByVisibleText(record.get("title"));
							selectPublication().selectByVisibleText(record.get("publication"));
							waitFor(5).seconds();
							selectSection().selectByVisibleText(record.get("section"));
							waitFor(5).seconds();
							selectSubSection().selectByVisibleText(record.get("subsection"));
							waitFor(5).seconds();
							selectZones().selectByVisibleText(record.get("zones"));
							waitFor(5).seconds();
							enterInsertionDate().typeAndTab(record.get("insertionDate"));
							waitFor(1).seconds();
						/*	selectSize().selectByVisibleText(record.get("size"));
							waitFor(4).seconds();*/
							clickOppLineSave().click();
							waitFor(12).seconds();
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
		 waitFor(1).seconds();
		 getDriver().switchTo().activeElement();
		 waitFor(1).seconds();
		 acceptAlert().click();
		 waitFor(45).seconds();
		 getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));
     	 WebElement element = getDriver().switchTo().activeElement();
     	 waitFor(2).seconds();
		 addPackage().click();
		 waitFor(4).seconds();
		 selectModule().selectByVisibleText("10x2");
		 waitFor(6).seconds();
		 selectPrice().click();
		 waitFor(3).seconds();
		 selectInsertion().click();
		 waitFor(3).seconds();
		 selectedInsertionDate().click();
		 waitFor(3).seconds();
		 selectBasePrice().click();
		 waitFor(3).seconds();
		 supplyPriceType().selectByVisibleText("UserRevenue");
		 waitFor(1).seconds();
		 supplyPrice().type("2000");
		 waitFor(1).seconds();
		 updateInsLevelRevenue().click();
		 waitFor(5).seconds();
		 /*System.out.println("Order id is --------------------->   "+orderID().getText());*/
		 acceptOrder().click();
		 waitFor(15).seconds();
		 Thucydides.takeScreenshot();
		 getDriver().quit();
		 try {
	    	 WebDriverWait wait1 = new WebDriverWait(getDriver(), 3);
	    	 if(wait1.until(ExpectedConditions.alertIsPresent())!=null)
	    	      getDriver().switchTo().alert().accept();
	    	 }
	    	 catch (Exception x) {// getDriver().quit();
	    		 //getDriver().switchTo().alert().accept();
	    		 }
	}
	
}
