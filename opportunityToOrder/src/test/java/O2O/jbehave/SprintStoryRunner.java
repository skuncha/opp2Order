package O2O.jbehave;


import O2O.utils.*;
import net.thucydides.jbehave.ThucydidesJUnitStories;

/**
 * @author srinivasa.kuncha
 * @add - extends ThucydidesJUnitStories
 */
public class SprintStoryRunner extends ThucydidesJUnitStories
 {
	
	public SprintStoryRunner() {
		
		WebDriverConfigurer.configureDrivers();
		
//	findStoriesCalled("Test in Development.story");
//	findStoriesCalled("Opportunity To Order Smoke Tests.story");
//  findStoriesCalled("Advertiser Scenarios.story");
	findStoriesCalled("Opportunity To Digital.story");
//	findStoriesCalled("Create Accounts Using CSV file.story");
	
	}
}

