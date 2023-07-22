package org.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.CommonUntility;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonUntility{
	Logger log;
	@Before
	public void setup() {
		
		 log = LogManager.getLogger(Hooks.class);
		   OpenBrowser(getProperty("browsername"));
		   openUrl(getProperty("url"));
		   implicitWait(20);	
   log.info("The Browser was succesfully initiated");
	}
 @After
     public void tearDown(Scenario sc) {
	 takesScreenshot(sc.getName());
	 TakesScreenshot tk=(TakesScreenshot)driver;
	 byte[] b = tk.getScreenshotAs(OutputType.BYTES);
	 sc.embed(b, "image/png");
	 closeBrowser();
	 log.info("The Browser was succesfully closed");
}
}
