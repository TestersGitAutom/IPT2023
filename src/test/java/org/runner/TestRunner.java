package org.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
            dryRun=false,stepNotifications=true, 
            glue="org.stepdefinition", 
            tags="@sc3", 
            plugin= {"html:src\\test\\resources\\Reports\\HtmlReport",
 					"json:src\\test\\resources\\Reports\\JsonReport\\report.json",
 					"junit:src\\test\\resources\\Reports\\JunitReport\\junitreport.xml"})

public class TestRunner {
    @AfterClass
    public static void report() {
    	Logger log = LogManager.getLogger(TestRunner.class);
    	JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\report.json");
    	log.info("Jvm Report Generated Successfull");
	}

}
