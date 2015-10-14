package O2O.pages;

import java.io.File;
import java.util.Map;

import net.thucydides.core.Thucydides;
import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author srinivasa.kuncha
 *
 */
public class opportunityToOrderPage extends PageObject  {
	
	public static int count;
	
	/******** Define Elements of Opportunity Registration Tab *******************************************************************************************************************************************************************/
	
	private WebElementFacade clickOnOppToOrderBtn() { 		return element(By.cssSelector("input[value='Opportunity To Order']")); 							}
	private WebElementFacade oppName() 				{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id102:j_id106")); 				}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id146:j_id150")); 				}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id195:j_id199")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id160:j_id164")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id207:j_id211")); 				}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id213:j_id217")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id137:j_id141")); 				}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id174:j_id177")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id166:j_id170"));				}
	private WebElementFacade selectAgency() 		{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id100:j_id101:j_id121:agencyFieldPanel']")); }
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id100:j_id101:j_id121:agencyFieldPanel']/div/select/option[2]")); }
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id194")); 						}
	private WebElementFacade selectPrintPartnership(){ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id228:j_id231")); 				}
	private WebElementFacade selectDigitalPartnership(){ 	return element(By.name("j_id0:opportunityForm:j_id85:j_id86:j_id200:j_id203")); 				}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id304")); 								}
	/*private WebElementFacade clickOppEditBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id306")); 								}
	private WebElementFacade clickOppDeleteBtn() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id307")); 								}
	private WebElementFacade clickOppCloseWon() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id309")); 								}
	private WebElementFacade clickOppCloseLost() 	{ 		return element(By.name("j_id0:opportunityForm:j_id100:j_id311")); 								}*/
	
	/******** Define Elements of OpportunityLine Tab ***************************************************************************************************************************************************************************/
	private WebElementFacade clickOnNewOppLineBtn() { 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id331")); 										}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:fieldsSection:j_id375:j_id379")); 		}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:fieldsSection:j_id394:j_id397")); 		}
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:fieldsSection:j_id403:j_id407")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:fieldsSection:j_id409:j_id413")); 		}
	
	/******** Define Elements of DM Display Package  ***************************************************************************************************************************************************************************/
	
	private WebElementFacade selectTitle() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:0:j_id429:j_id433")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:1:j_id429:j_id433")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:2:j_id429:j_id433")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:3:j_id429:j_id433")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:4:j_id429:j_id433")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id444:selectedInsertionDates"));	} //  example date format "19/03/2015"
	private WebElementFacade selectSize() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id459:j_id461")); 			}
	/*private WebElementFacade enterSizeCMs() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id465:j_id467")); 			}
	private WebElementFacade enterSizeColumns() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id468:j_id470")); 			}*/
	
	/******** Define Elements For MailPlus Package  ******************************************************************************************************************************************************/
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id450:j_id453")); 			}
	private WebElementFacade selectWebsite()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:0:j_id429:j_id433")); 	}
	private WebElementFacade selectAdUnit()			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id425:0:j_id427:j_id428:4:j_id429:j_id433")); 	}
	private WebElementFacade clickOppLineCancel()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id487")); 										}
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id492")); 										}
	private WebElementFacade clickSaveAndNew()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id495")); 										}
	private WebElementFacade clickSaveAndCopy()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id498")); 										}
	private WebElementFacade clickEditOppLine()		{ 		return element(By.xpath("//tr[2]/td[2]/img")); 																			}
	private WebElementFacade clickCanceloppLine()	{ 		return element(By.xpath("//tr[1]/td[4]/img")); 																			}
	private WebElementFacade deactiveReason() 	 	{		return element(By.id("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id483:j_id484")); 								}
	private WebElementFacade deactiveReasonOK() 	{		return element(By.id("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id501")); 										}
	private WebElementFacade cancelReason() 	 	{		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id570:j_id572")); 								}
	private WebElementFacade cancelReasonSubmit() 	{		return element(By.id("j_id0:opportunityToPrintForm:j_id329:j_id333:0:j_id585")); 										}
	private WebElementFacade bookedPrice() 			{		return element(By.id("j_id0:opportunityToPrintForm:j_id329:j_id648:0:j_id790")); 										}
	private WebElementFacade yieldvalue() 			{		return element(By.id("j_id0:opportunityToPrintForm:j_id329:j_id648:0:j_id793")); 										}
	private WebElementFacade acceptAlert()			{ 		return element(By.name("j_id0:popUpFrame2:j_id47")); 																	}
	
	/******** Define Elements of Opportunity Line which will be converted to Order in CCI ***************************************************************************************************************/	
	
	 private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.xpath("//*[@id='inprogressTable']/tbody/tr[1]/td[1]/input")); 							}
	 private WebElementFacade clickOnCreateSelectedLineinCCI()	 { 		return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id805")); 			   						}
	 private WebElementFacade addPackage()   	 	{ return element(By.xpath("//fieldset/div/div/div/h4/a/span"));																	}
	 private WebElementFacade selectModule()   	 	{ return element(By.id("Order.Material:material.moduleCode"));																	}
	 private WebElementFacade selectPrice()   	 	{ return element(By.xpath(".//*[@id='SchedulingAccordion']/div/div[3]/div[1]/h4/a/span"));										}
	 private WebElementFacade selectInsertion()   	{ return element(By.xpath("//*[@id='ActivePriceDetailView']/label[3]"));														}
	 private WebElementFacade selectedInsertionDate(){ return element(By.xpath("//fieldset/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[2]/a"));									}
	 private WebElementFacade selectBasePrice()	 	{ return element(By.xpath("//tbody/tr[14]/td[1]/a"));																			}
	 private WebElementFacade supplyPriceType()	 	{ return element(By.xpath("//*[@id=':overridePriceDetail']"));																	}
	 private WebElementFacade supplyPrice()			{ return element(By.xpath("//tbody/tr[23]/td[3]/div/input"));																	}
	 private WebElementFacade updateInsLevelRevenue(){ return element(By.xpath("//tbody/tr[23]/td[3]/div/span/button/i"));							    							}
	 private WebElementFacade acceptOrder()   	 	{ return element(By.xpath("//nav[button='Accept']/button[3]"));																	} 
	 private WebElementFacade orderID()      	 	{ return element(By.xpath("//fieldset/div[1]/div/p")); 																			}
	 private WebElementFacade clickOnRefreshTable()	{ return element(By.name("j_id0:opportunityToPrintForm:j_id329:j_id609")); 			    										}
	 private WebElementFacade deactivateTable()		{ return element(By.xpath("//*[@id='j_id0:opportunityToPrintForm:j_id329:sectionheadercustomID']/div[1]")); 			    		}
	
	 
/*********************************************************************************************************************************************************************************************************/
	
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
					enterOppEndDate().type(record.get("oppEndDate"));
					enterOppCloseDate().type(record.get("oppCloseDate")); 
					enterOppEstdVal().type(record.get("oppEstdValue"));	
					try {
						selectPrintPartnership().selectByVisibleText(record.get("partnership"));
						waitFor(2).second();
					} catch (Exception digital) {
						selectDigitalPartnership().selectByVisibleText(record.get("partnership"));
						waitFor(1).second();
					}
					selectOppType().selectByVisibleText(record.get("oppType"));
					waitFor(4).second();
					
					/*selectOppContactRole().selectByVisibleText(record.get("oppContactRole")); 
					waitFor(1).second();
					selectNewBusinessCB().click();*/
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
		waitFor(11).seconds();
		
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
			for (Map<String, String> record : testDataSrc.getData()) {
				try {
					String Dateflex = record.get("dateflex");
					selectPackage().selectByVisibleText(record.get("package"));
					waitFor(5).seconds();
					enterOrderPO().type(record.get("insertionPO"));
					enterSalesPrice().type("2000");
					waitFor(1).seconds();
					// selectTitle().selectByVisibleText(record.get("title"));
					selectPublication().selectByVisibleText(
							record.get("publication"));
					waitFor(5).seconds();
					selectSection().selectByVisibleText(record.get("section"));
					waitFor(5).seconds();
					selectSubSection().selectByVisibleText(
							record.get("subsection"));
					waitFor(5).seconds();
					selectZones().selectByVisibleText(record.get("zones"));
					waitFor(5).seconds();
					enterInsertionDate()
							.typeAndTab(record.get("insertionDate"));
					waitFor(1).seconds();
					if (Dateflex.equalsIgnoreCase("Y")) {
						selectDateflexCB().click();
						waitFor(2).second();
					}
					clickOppLineSave().click();
					waitFor(15).seconds();
				} catch (Exception e1) {}
			}
		}
	}
	
	public void editOppLine() {
		clickEditOppLine().click();
		waitFor(8).seconds();
		selectSize().selectByVisibleText("10x2");
		waitFor(4).seconds();
	}

	public void oppLinesShouldBeUpdated() {

		clickOppLineSave().click();
		waitFor(15).seconds();
	}

	public void cancelOppLine() {
		clickCanceloppLine().click();
		waitFor(15).seconds();
		deactiveReason().selectByVisibleText("Created in error");
		waitFor(1).seconds();
		deactiveReasonOK().click();
		waitFor(8).seconds();
	}

	public void OppLineDeactivated() {
		waitFor(1).seconds();
		deactivateTable().click();
		waitFor(1).seconds();
	}

	public void orderLinecancelled() {
		waitFor(5).seconds();
		clickCanceloppLine().click();
		waitFor(15).seconds();
		cancelReason().selectByVisibleText("Customer request");
		waitFor(1).seconds();
		cancelReasonSubmit().click();
		waitFor(30).seconds();
	}

	public boolean verifyCancelledOrderLine() {
		waitFor(10).seconds();
		clickOnRefreshTable().click();
		waitFor(5).seconds();
		if ((bookedPrice().getText()).equals("GBP 0.00") && (yieldvalue().getText()).equals("GBP 0.00"))
			return true;
		return false;
	}
	public void creaetMultipleOppLinesUsingCSV(String CSVfile) throws Exception {
		File filePath = new File(CSVfile);
		if (filePath.isFile()) 
		{
				String file = filePath.getAbsolutePath();
				CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
				int s = testDataSrc.getData().size();
				count = s;
				for (Map<String, String> record : testDataSrc.getData()) 
				{
						System.out.println("records in the file is s --->  "+s);
			
						try {
								String Dateflex = record.get("dateflex");
								selectPackage().selectByVisibleText(record.get("package"));
								waitFor(5).seconds();
								enterOrderPO().type(record.get("insertionPO"));
								enterSalesPrice().type("2000");
								waitFor(1).seconds();
								// selectTitle().selectByVisibleText(record.get("title"));
								selectPublication().selectByVisibleText(record.get("publication"));
								waitFor(5).seconds();
								selectSection().selectByVisibleText(record.get("section"));
								waitFor(4).seconds();
								selectSubSection().selectByVisibleText(record.get("subsection"));
								waitFor(4).seconds();
								selectZones().selectByVisibleText(record.get("zones"));
								waitFor(7).seconds();
								enterInsertionDate().typeAndTab(record.get("insertionDate"));
								waitFor(1).seconds();
								if (Dateflex.equalsIgnoreCase("Y"))
								{
									selectDateflexCB().click();
									waitFor(2).second();
								}
								clickOppLineSave().click();
								waitFor(12).seconds();
							} catch (Exception e1) {}
						if (s==1)
							System.out.println("Iterations Completed --->  "+s);
						else {
								clickOnNewOppLineBtn().click();
								waitFor(4).seconds();
								s--;
							 }
				}
		}
}
	
	public void validateOppotunityLineRecord() {

		System.out.println("Opportunity Created Successful --> :  "
				+ getDriver().getCurrentUrl());
		Thucydides.takeScreenshot();
	}

	public void selectOpportunityLinesToConvertAsOrders() {
		
		selectOppLineToBeConvertedCB().click();
		waitFor(8).seconds();
	}
public void selectPackagesToConvertedAsOrders() {
		
		count = count*2;
		while (count > 0){
			WebElementFacade selectPackages =  element(By.xpath("//*[@id='inprogressTable']/tbody/tr["+count+"]/td[1]/input"));
			selectPackages.click();
			waitFor(8).seconds();
			count= count-2;
		}
	}
	
  public void openCCIPluginToConvert(){
	  	clickOnCreateSelectedLineinCCI().click();
		waitFor(1).seconds();
		getDriver().switchTo().activeElement();
		waitFor(1).seconds();
		acceptAlert().click();
		waitFor(45).seconds();
  }

	public void convertApprovedOppLinesAsOrder() {
		
		getDriver().switchTo().frame(
		getDriver().findElement(By.tagName("iframe")));
		WebElement element = getDriver().switchTo().activeElement();
		waitFor(2).seconds();
		System.out.println("Order id is --------------------->   "
				+ orderID().getText());
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
		acceptOrder().click();
		try {
			WebElement prepaymentwindow1 = getDriver().switchTo()
					.activeElement();
			waitFor(1).seconds();
			prepaymentwindow1.findElement(By.xpath("//input[@value='Prepay']"))
					.click();
			waitFor(1).seconds();
			WebElement prepaymentwindow2 = getDriver().switchTo()
					.activeElement();
			waitFor(1).seconds();
			prepaymentwindow2.findElement(By.xpath("//input[@value='OK']"))
					.click();
		} catch (Exception NoPopUp) {
		}
		waitFor(15).seconds();
		Thucydides.takeScreenshot();
		clickOnRefreshTable().click();
		waitFor(5).seconds();
		// getDriver().quit();
		try {
			WebDriverWait wait1 = new WebDriverWait(getDriver(), 3);
			if (wait1.until(ExpectedConditions.alertIsPresent()) != null)
				getDriver().switchTo().alert().accept();
		} catch (Exception x) {// getDriver().quit();
			// getDriver().switchTo().alert().accept();
		}
	}

}
