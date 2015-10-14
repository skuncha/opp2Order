package O2O.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.reports.history.SystemDateProvider;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class opportunityToDigital extends PageObject {
	
	public static String lnDesc, oppName;
	long timeNow = System.currentTimeMillis();
/*	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date sysdate = new Date();*/
	
	private WebElementFacade accountMapping() 			 {	return element(By.xpath("//div[14]/div/div/div/table/tbody/tr/td[2]/input")); 			}
	private WebElementFacade sourceSystem() 			 {	return element(By.id("00ND0000005WVcR")); 												}
	private WebElementFacade customerRef() 			 	 {	return element(By.id("00ND0000005WVcQ")); 												}
	private WebElementFacade accountMappingSave() 		 {	return element(By.xpath("//*[@id='bottomButtonRow']/input[1]")); 						}
	private WebElementFacade clickOnAddDigitalProducts() {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id953"));   				}
	private WebElementFacade selectProduct() 		     {	return element(By.xpath("//div[@id='j_id0:opportunityToDigitalForm:j_id921:j_id956:j_id957:multiselectPanel']/table/tbody/tr/td/select/option[13]")); }
	private WebElementFacade addProduct() 				 {	return element(By.xpath("//div[2]/a/img")); 							   				}
	private WebElementFacade clickOnNext() 				 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id991"));   				}
	private WebElementFacade enterSalesPrice() 			 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1026:0:j_id1055")); 	}
	private WebElementFacade saveDigitalLines() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1076")); 				}
	private WebElementFacade selectDigitalLine() 		 {	return element(By.xpath("//span[3]/table/tbody/tr/td[1]/input")); 						}
	private WebElementFacade editDigitalLine() 		 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1152")); 				}
	private WebElementFacade copyLine() 		 	 	 {	return element(By.xpath("//table/tbody/tr/td[8]/img")); 								}
	private WebElementFacade copydates() 		 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1077")); 				}
	private WebElementFacade deactivateDigitalLine() 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1153")); 				}
	private WebElementFacade deactivateReason() 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1110:j_id1111")); 		}
	private WebElementFacade deactivateReasonSave() 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1115")); 				}
	private WebElementFacade refreshTable() 			 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1118")); 				}
	private WebElementFacade createNewOppFromSelected()  {	return element(By.name("j_id0:opportunityToDigitalForm:j_id921:j_id1154")); 			}
	private WebElementFacade opportunityCopy()  		 {	return element(By.xpath("//*[@id='j_id0:sectionHeaderPanel']/div[1]/div/div[1]/h2")); 	}
	private WebElementFacade lineDescription() 	 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1026:0:j_id1060")); 	}
	private WebElementFacade lineDescFromTable() 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1123:0:j_id1133")); 	}
	private WebElementFacade closedWon() 	 	 		 {	return element(By.id("j_id0:opportunityForm:j_id100:j_id309"));					 		}
	private WebElementFacade oppStage() 			 	 {  return element(By.id("j_id0:opportunityForm:j_id100:j_id241:j_id258"));					}
	private WebElementFacade closedLost() 	 	 		 {	return element(By.id("j_id0:opportunityForm:j_id100:j_id311"));					 		}
	private WebElementFacade closedLostreason() 		 {  return element(By.id("j_id0:opportunityForm:j_id100:j_id236:j_id237"));					}
	private WebElementFacade closedLostSave() 			 {  return element(By.id("j_id0:opportunityForm:j_id100:j_id312"));							}
	private WebElementFacade oppClosedError() 			 {	return element(By.xpath("//*[@id='j_id0:opportunityToDigitalForm:j_id921:j_id922']/div[2]/table/tbody/tr/td[2]/span")); }
	private WebElementFacade lineOneFID() 		 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1026:0:selectedInsertionDates")); 		}
	private WebElementFacade lineOneProductName() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1123:0:j_id1131")); 	}
	private WebElementFacade lineTwoProductName() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1123:1:j_id1131")); 	}
	private WebElementFacade scheduledlineOneFID() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1123:0:j_id1147")); 	}
	private WebElementFacade scheduledlineTwoFID() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id921:j_id1123:1:j_id1147")); 	}
	
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

	public void copyAndSaveALine() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		editDigitalLine().click();
		waitFor(5).seconds();
		copyLine().click(); 
		waitFor(5).seconds();
		saveDigitalLines().click();
		waitFor(5).seconds();
		assertThat(lineOneProductName().getText(),is(equalTo(lineTwoProductName().getText())));
	}
	
	public void copyDatesOnMltipleLines(int NoOfLines) {
		
	/*	String s = dateFormat.format(sysdate);*/
		selectDigitalLine().click();
		waitFor(5).seconds();
		editDigitalLine().click();
		waitFor(5).seconds();
		while (NoOfLines > 0) {
			copyLine().click();
			waitFor(5).seconds();
			NoOfLines--;
		}
		lineOneFID().typeAndTab("14/3/2016");
		waitFor(1).seconds();
		copydates().click();
		waitFor(3).seconds();
		saveDigitalLines().click();
		waitFor(5).seconds();
		assertThat(scheduledlineOneFID().getText(),is(equalTo(scheduledlineTwoFID().getText())));
	}
	
	public void deactivateLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		deactivateDigitalLine().click();
		waitFor(5).seconds();
		deactivateReason().selectByVisibleText("Created in error");
		deactivateReasonSave().click();
		waitFor(5).seconds();
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
	
	public void oppStageAsClosedWon() {
		closedWon().click();
		waitFor(1).seconds();
		try {	getDriver().switchTo().alert().accept();	}
		catch (Exception noPopUp){}
		waitFor(5).seconds();
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