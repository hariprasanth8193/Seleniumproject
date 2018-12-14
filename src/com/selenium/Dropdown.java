package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("abcd");
		String Frsnme = firstname.getAttribute("value");
	    System.out.println(Frsnme);
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("efgh");
		String lstnme = lastname.getAttribute("value");
	    System.out.println(lstnme);
		WebElement number = driver.findElement(By.name("reg_email__"));
		number.sendKeys("9875421541");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("9854541111");
		WebElement day = driver.findElement(By.id("day"));
		Select Day = new Select(day);
		WebElement Firstopt = Day.getFirstSelectedOption();
		System.out.println(Firstopt.getText());
		Day.selectByIndex(15);
		List<WebElement> dayoption = Day.getOptions();
		System.out.println("Dayoptions");
		for(int i=0 ; i < dayoption.size(); i++) {
			System.out.println(dayoption.get(i).getText());
		}
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select Month = new Select(month);
		WebElement Firstoption = Month.getFirstSelectedOption();
		System.out.println(Firstoption.getText());
		Month.selectByVisibleText("Apr");
		System.out.println("Select the options");
		  List<WebElement> option = Month.getOptions();
		    for(int i=0; i < option.size();i++) {
		    	System.out.println(option.get(i).getText());
		    }
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select Year = new Select(year);
        WebElement firstoption1=Year.getFirstSelectedOption();
        System.out.println(firstoption1.getText());
		Year.selectByValue("2016");
	     
		  WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		    radio.click();
		
	
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
		driver.close();
		
		

	}
}
