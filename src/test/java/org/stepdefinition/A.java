package org.stepdefinition;

import java.io.FileReader;
import java.util.Properties;

public class A {

	public static void main(String[] args) {
		String pr=null;
	try{ Properties p=new Properties();
		 FileReader fl=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\config.properties");
		 p.load(fl);
		  pr = p.getProperty("browsername");
		  Object obj = p.get("browsername");
	      String ss = obj.toString();
	      System.out.println(ss);
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
		 System.out.println(pr);
	}

}
