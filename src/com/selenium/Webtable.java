package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public void webtbl() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("https://www.google.com/");
		drv.navigate().to("http://toolsqa.com/automation-practice-table/");
        WebElement heading = drv.findElement(By.xpath("//table//caption//strong"));
        System.out.println("  Heading     "  +   heading.getText());
            
               List<WebElement> option = drv.findElements(By.tagName("th"));
              for(WebElement option1 : option) {
            	 System.out.println( "option      "  +option1.getText());
              }
              
              WebElement Body = drv.findElement(By.xpath("//table//tbody/tr[4]/td[2]"));
              String s = Body.getText();
              System.out.println("Body    " + s);             
              
             List<WebElement> items = drv.findElements(By.xpath("//table//tbody/tr[2]"));
             System.out.println("Items    "); 
             for(int i = 0 ;i<items.size();i++) {
            	 String text = items.get(i).findElement(By.tagName("td")).getText();
            	 System.out.println("text   "+ text); 
            	
	}
             drv.close();
	}
	
	public static void main(String[] args) {
		Webtable wt = new Webtable();
		wt.webtbl();
		
	}
	
}
