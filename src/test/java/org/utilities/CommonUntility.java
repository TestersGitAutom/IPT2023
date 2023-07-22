package org.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUntility {
	public static WebDriver driver;
	
	public void OpenBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("fire")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver =new ChromeDriver();
	}
	else {
		System.out.println("Invalid BrowserName");
		throw new WebDriverException();
		
	}
		
	}
	public void openUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
    } 
	
	public String getTitle() {
		return driver.getTitle();

	}
	
	
	public void implicitWait(long sec) {
		  driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	
	
	public void enterValue(WebElement e,String value) {
	WebDriverWait w = new WebDriverWait(driver, 20);
	w.until(ExpectedConditions.visibilityOf(e));
	try{
		e.sendKeys(value);
	    }
   catch (Exception ex) {
	jsSenKeys(e, value);
	ex.printStackTrace();
         }
        
	}
	
	public void jsSenKeys(WebElement e, String input) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+input+"')", e);

    }
    public void jsClick(WebElement e) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", e);
		
    }
    
  
	
     public void clickButton(WebElement e) {
			    WebDriverWait w = new WebDriverWait(driver, 20);
			    w.until(ExpectedConditions.elementToBeClickable(e));
				try{
					e.click();
				}catch (Exception ex) {
					jsClick(e);
					ex.printStackTrace();
				}
		}
     public String getAttribute(WebElement e) {
 	 return e.getAttribute("value"); 
    
     
     }		
     public String getText(WebElement e) {
     	 return e.getText(); 
     }
    
    public void takesScreenshot(String image) {
    	try{ FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), 
	new File(System.getProperty("user.dir")+"\\src\\test\\resource\\Screenshots"+image+".png"));
	}
    	catch (Exception e) {
    		e.printStackTrace();
		}
    }
     
     
     public String getProperty(String key) {
    	 String pr=null;
    		try{ Properties p=new Properties();
    			 FileReader fl=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\config.properties");
    			 p.load(fl);
    			  pr = p.getProperty(key);
    			  
    		}
    		
    		catch (Exception e) {
    			e.printStackTrace();
    			
    		}
    			return pr;
	}
    
    
    public void closeBrowser() {
	driver.quit();

    }
       }