package org.pageobjects;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.CommonUntility;


public class ProductsPage extends CommonUntility{
	
	Logger log;
	public ProductsPage() {
		 PageFactory.initElements(driver, this);
		  log= LogManager.getLogger(ProductsPage.class);
	}
 @FindBy(xpath="//div[@class='inventory_item_name']")
 private List<WebElement> allProducts;
 
 @FindBy(xpath="//div[text()='Sauce Labs Backpack']")
 private WebElement backpack;
 
 @FindBy(xpath="//div[@class='inventory_details_name large_size']")
 private WebElement productName;
  
 
  public String productnme; 
  
//   public void selectParticularProduct(String productname) {
//for (WebElement el : allProducts) {
//	String text = getText(el);
//	if(text.equals(productname)){
//		productnme= text;
//		   clickButton(el);
//		   break;
//	}
//	
//   }
//	   
//}
  
  List<String>   allproductBefore;
  List<String>   allproductAfter;
  
  public List<String> getAllProductName() {
       allproductBefore =new LinkedList<String>();
	for(WebElement product: allProducts) {
      allproductBefore.add(getText(product));
}
	log.info("All product name"+allproductBefore);
	return allproductBefore;
  } 
  
 
  public List<String> selectEveryProduct() throws InterruptedException {
	  allproductAfter =new LinkedList<String>();
	  List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	  for (int i =0;i<allProducts.size(); i++ ){
//			Thread.sleep(5000);
			WebElement el = driver.findElement(By.xpath("//div[@class='inventory_item_name'])["+(i+1)+"]"));
	    clickButton(el);
	    String text = getText(driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")));
	    allproductAfter.add(text);
	    driver.navigate().back();
	
}
		log.info("All product name"+allproductAfter);
		return allproductAfter;
}
  public void selectParticularProduct(String productname) {
	  WebElement pr = driver.findElement(By.xpath("//div[text()='"+productname+"']"));
	  productname=getText(pr);
 clickButton(pr);
	   
}
   
   public String getProductNameAfterSelect() {
       String pr = getText(productName);
   	return pr;


}
   
   
    public boolean verifyTheProductareSame() {
    	 boolean flag = false;
    	 
         if(getProductNameAfterSelect().equals(getProperty("product")) ) {
        	flag= true;
    }
    
	return flag;
	}
    
     public boolean verifyAllProductName() {
		boolean flag=false;
		if(allproductBefore.equals(allproductAfter)) {
		return true;
     }
		return flag;
				
	}
}
