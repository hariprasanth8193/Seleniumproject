package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

      public void Launch_browser() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    	  System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
          Thread.sleep(10000);
          
          TakesScreenshot ts = (TakesScreenshot) driver;
           File screenshotas = ts.getScreenshotAs(OutputType.FILE);
           File fnew = new File("D:\\New folder\\Study\\gmail.png");
           FileUtils.copyFile(screenshotas,fnew );
           
           
           
          driver.close();
          
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
	     Screenshot s = new Screenshot();
	     s.Launch_browser();
	}
	
	

}
