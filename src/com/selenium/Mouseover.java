package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseover {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		WebElement elec = d.findElement(By.xpath("//span[text()='Electronics']"));
        Actions a = new Actions(d);
        a.moveToElement(elec).build().perform();
        Thread.sleep(10000);
		WebElement oppo = d.findElement(By.xpath("//a[@title='OPPO']"));
		oppo.click();
		Thread.sleep(5000);
		d.navigate().back();
		Thread.sleep(5000);
		
		d.close();
		
	}
	
	
	

}
