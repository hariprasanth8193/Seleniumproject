package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {
	
	public void browser_launch() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("http://automationpractice.com/index.php");
	       WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
	       Signin.click();
	       WebElement Email = driver.findElement(By.id("email_create"));
	       Email.sendKeys("hari83@gmail.com");
	       WebElement CreateAcc = driver.findElement(By.id("SubmitCreate"));
	       CreateAcc.click();
	         Thread.sleep(10000);
	       WebElement Radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	       Radio.click();
	       WebElement Firstname = driver.findElement(By.name("customer_firstname"));
	       Firstname.sendKeys("Dhoni");
	       WebElement Lastname = driver.findElement(By.id("customer_lastname"));
	       Lastname.sendKeys("Kholi");
	       WebElement Password = driver.findElement(By.id("passwd"));
	       Password.sendKeys("12452461");
	       WebElement Firstname1 = driver.findElement(By.id("firstname"));
	       Firstname1.sendKeys("Jadeja");
	       WebElement Lastname1 = driver.findElement(By.id("lastname"));
	       Lastname1.sendKeys("Jadave");
	       WebElement company = driver.findElement(By.id("company"));
	       company.sendKeys("ICC");
	       WebElement Address = driver.findElement(By.name("address1"));
	       Address.sendKeys("street address,121212,company,tn");
	       WebElement City = driver.findElement(By.name("city"));
	       City.sendKeys("Chennai");
	       WebElement state = driver.findElement(By.id("id_state"));
	       Select Drop_State = new Select(state);
	       Drop_State.selectByIndex(4);
	       WebElement passcode = driver.findElement(By.name("postcode"));
	       passcode.sendKeys("72764");
	       WebElement Country = driver.findElement(By.id("id_country"));
	       Select Drop_country = new Select(Country);
	       Drop_country.selectByIndex(1);
	       WebElement mobilenumber = driver.findElement(By.name("phone_mobile"));
	       mobilenumber.sendKeys("9845742154");
	       WebElement submit = driver.findElement(By.name("submitAccount"));
	       submit.click();
	       
	      } 
	
	public static void main(String[] args) throws InterruptedException {
		Testing test = new Testing();
		test.browser_launch();
		
	}
	
	

}
