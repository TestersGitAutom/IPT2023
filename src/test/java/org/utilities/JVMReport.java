package org.utilities;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport extends CommonUntility{
	
	public static void generateJVMReport(String json) {
       File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReports");
       Configuration con=new Configuration(loc, "Swag Labs");
       CommonUntility com= new CommonUntility();
       con.addClassifications("Broswer Name", com.getProperty("browsername"));
       con.addClassifications("OS", com.getProperty("Window11"));
       con.addClassifications("Tester", com.getProperty("Abinesh"));
       con.addClassifications("Env", com.getProperty("QA"));
       con.addClassifications("Sprint", com.getProperty("23"));
       
       List<String> jsonFiles=new LinkedList<String>();
       jsonFiles.add(json);
       ReportBuilder r= new ReportBuilder(jsonFiles, con);
       r.generateReports();
	}

}
