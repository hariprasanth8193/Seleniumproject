package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement scrollto = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));
		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("arguments[0].scrollIntoView(false)", scrollto);
		Thread.sleep(5000);
		
		
		WebElement dragbank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dragamount = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dragsales = driver.findElement(By.id("credit1"));
		WebElement dragamount1 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		
		WebElement dropbank = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement dropamount = driver.findElement(By.id("amt7"));
		WebElement dropsales = driver.findElement(By.xpath("(//ol[@id='loan'])[1]"));
		WebElement dropamount1 = driver.findElement(By.id("amt8"));
		
		
		Actions a = new Actions(driver);
		a.dragAndDrop(dragbank,dropbank).build().perform();
		Thread.sleep(5000);
		a.dragAndDrop(dragamount, dropamount).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(dragsales, dropsales).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(dragamount1, dropamount1).build().perform();
		Thread.sleep(1000);
		
		WebElement logo = driver.findElement(By.xpath("(//a[@title = 'Home'])[1]"));
		JavascriptExecutor script1 = (JavascriptExecutor) driver;
		script1.executeScript("arguments[0].scrollIntoView(true)",logo );
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	
	
	
}
