package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertviews {

	
	public static void main(String[] args) throws InterruptedException {
		
		Alertviews av = new Alertviews();
		av.alertoptions();
	}
	public void alertoptions() throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		drv.manage().window().maximize();
		//pause
        Thread.sleep(5000);	
		//ConfirmAlert
		WebElement simplealert = drv.findElement(By.xpath("//button[text()='Simple Alert']")); 
		simplealert.click();	
		//explicit wait
		WebDriverWait wait = new WebDriverWait(drv,60) ;
		wait.until(ExpectedConditions.alertIsPresent());
		//Alert
		Alert a = drv.switchTo().alert();
		a.accept();
		drv.switchTo().defaultContent(); 
		//implicitwait
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//ConfirmAlert
		WebElement confirmalert = drv.findElement(By.xpath("//button[text()='Confirm Pop up']"));
		confirmalert.click();
		Alert ca = drv.switchTo().alert();
		ca.dismiss();
		drv.switchTo().defaultContent();
		Thread.sleep(5000);
		//PromptAlert
		WebElement promptalert = drv.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		promptalert.click();
		Thread.sleep(5000);
		Alert pa = drv.switchTo().alert();
		pa.sendKeys("Yes");
		pa.accept();
	    drv.switchTo().defaultContent();
		drv.close();	
	}
	

	
	
	
}
