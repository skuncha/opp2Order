package O2O.jbehave;

import O2O.utils.WebDriverConfigurer;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	
	
	public AcceptanceTestSuite() {
		
		WebDriverConfigurer.configureDrivers();
		
		}
}
