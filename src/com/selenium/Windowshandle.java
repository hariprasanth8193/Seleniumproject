package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Windowshandle wh = new Windowshandle();
		wh.window();
		
	}
	
	
   public void window() throws AWTException, InterruptedException {
	// TODO Auto-generated method stub
	   
	   System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
	   
              drv.get("https://www.amazon.in/");
              drv.manage().window().maximize();
              drv.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
              String gt = drv.getWindowHandle();
              System.out.println("Windows Handle :  " + gt);
              
              WebElement Amazon = drv.findElement(By.xpath("//a[text()='Your Amazon.in']"));
             
              Actions ac = new Actions(drv);
              //Selecting the right click
              ac.contextClick(Amazon).build().perform();
              
              Thread.sleep(10000);
              //Clicking the menu
              Robot rb = new Robot();
              //option1
              rb.keyPress(KeyEvent.VK_DOWN);
              rb.keyRelease(KeyEvent.VK_DOWN);
              //option2
              rb.keyPress(KeyEvent.VK_DOWN);
              rb.keyRelease(KeyEvent.VK_DOWN);
             
              //Enter the selected option
             
              rb.keyPress(KeyEvent.VK_ENTER);
              rb.keyRelease(KeyEvent.VK_ENTER);
              
              
              drv.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
              Set<String> st = drv.getWindowHandles();
              List<String> st1 = new ArrayList<>();
              st1.addAll(st);
              System.out.println(st1);
              Thread.sleep(5000);
              
              
              for(int i = 0;i<st1.size();i++) {
            	  if(st1.get(i).equals(gt)) {
            	  drv.switchTo().window(st1.get(i));
            	  drv.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            	  Thread.sleep(1000);
            	  WebElement Mouseover = drv.findElement(By.id("nav-link-yourAccount"));
            	  Actions ac1 = new Actions(drv);
            	  ac1.moveToElement(Mouseover).build().perform();
            	  drv.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
            	  Thread.sleep(5000);
            	  
            	  
            	  }
              }
              

        	  drv.close();
              
              
              
              
              
     
		
		
}
	
}
