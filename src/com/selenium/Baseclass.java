package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public  class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver browsers(String browser) {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Study\\Selenium\\src\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}else if(browser.equals("ie")){
		System.setProperty("webdriver.gecko.driver","D:\\New folder\\Study\\Selenium\\src\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}else {
		
		System.out.println("Invalid Browser");
	}
		return driver;
}

	
	//geturl
	
	public static void geturl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
	//Navigate
	
	public static void navigate(String navigate) {
		// TODO Auto-generated method stub
		driver.get(navigate);

	}
	
	//implicitwait
	
	public static void implicitwait(long time) {
		// TODO Auto-generated method stub
       driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	//explicitwait
	
    public static void explicitwait(long seconds,WebElement element) {
		// TODO Auto-generated method stub
    	WebDriverWait wait = new WebDriverWait(driver,seconds) ;
		
	}
    
    //isdisplayed
    
    public static boolean isdiplayed(WebElement element) {
		
				// TODO Auto-generated method stub
		boolean displayed=element.isDisplayed();
		return displayed;
	}
    
    //isselected
    
    public static boolean isselected(WebElement element) {
		// TODO Auto-generated method stub
    	boolean selected = element.isSelected();
    	return selected;

	}
	
    //isEnable
    public static boolean ISEnabled(WebElement element) {
		// TODO Auto-generated method stub
    	boolean enabled = element.isEnabled();
    	return enabled;

	}
    
    public static void setText(WebElement element,CharSequence value) {
		// TODO Auto-generated method stub
    	try {
       if(isdiplayed(element)&&ISEnabled(element)){
    	   
    	   element.clear();
    	   element.sendKeys(value);
       }}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
       
   ///Dropdown
    	
    }
    	public static void dropdown(WebElement element, String options, String value) {
			// TODO Auto-generated method stub
    		Select s = new Select(element);
    		if(options.equals("Date")) {
    			s.selectByValue(value);
    		}
    			else if(options.equals("Index")) {
    				int parseInt = Integer.parseInt(value);
    				s.selectByIndex(parseInt);
    		}else if(options.equals("text")) {
    			s.selectByVisibleText(value);
    		}
    		String text = s.getFirstSelectedOption().getText();
    		List<WebElement> list = s.getOptions();
    		for(WebElement w : list) {
    			w.getText();
    			w.getAttribute("value");
    		}
    		
	}
    	//gettitle
    	public static String gettitle() {
			// TODO Auto-generated method stub
               String title = driver.getTitle();
               return title;
            		   
		}
    	
    	//geturl
    	private void getcurrenturl() {
			// TODO Auto-generated method stub
           String current =driver.getCurrentUrl();
		}
    	//ScreenShort
    	//public static void takescreenshort(String amazonScreenshort,Object Screenshotas) {
    		//TakesScreenshot tc =(TakesScreenshot)driver;
    		//tc.getScreenshotAs(OutputType.FILE);
    		//File fnew = new File("C:\\Eclipse\\SeleniumPractice\\Library\\"+ amazonScreenshort +".png");
    		//FileUtils.copyFile(Screenshotas, fnew);
    	//}
    	
    	public static void Scrollupdown(Object downscroll, Object UpScroll) {
    		JavascriptExecutor js = (JavascriptExecutor)driver;
    		js.executeScript("arguments[0].scrollIntoView(false);",downscroll);
    		
    		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    		
    		
    		JavascriptExecutor js1 = (JavascriptExecutor)driver;
    		js1.executeScript("arguments[0].scrollIntoView(true);",UpScroll);
    	}
    	
    	//Mouseover
    	public static void Mouseover(WebElement category) {
    		Actions ac = new Actions(driver);
    		ac.moveToElement(category).build().perform();

    	}
    	// DragandDrop
    	
    	public static void draganddrop(WebElement source, WebElement target) {
    		try {
    			Actions ac = new Actions(driver);
    			ac.dragAndDrop(source, target).build().perform();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}

    	//Doubleclick
    	public static void Doubleclick(WebElement element) {
    		try {
    			Actions ac = new Actions(driver);
    			ac.doubleClick(element).build().perform();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    		} 
    	

    	//Navigation
    	private static void Navigation(String options) {
    		try {
    			if(options.equals("refresh")) {
    				driver.navigate().refresh();
    			}else if (options.equals("forward")) {
    				driver.navigate().forward();
    			}else if (options.equals("backward")) {
    				driver.navigate().back();
    			}
    			}catch (Exception e) {
    				e.printStackTrace();
    			}
     	
    		}
    	
    	  // Navigate URL
    	private static void navigateurl(String url) {
    		try {
    			driver.navigate().to(url);
    			}catch (Exception e) {
    				e.printStackTrace();
    			}
     	
    		}
    	
    	//Gettext
    	public static String gettext(WebElement element) {
    		String text = null;
    		try {
    			text = element.getText();
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		return text;
    	}
    	// get Attribute
    	public static String getattributet(WebElement element, String options) {
    		String attribute = null;
    		try {
    			attribute = element.getAttribute(options);
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		return attribute;
    	}	
    	
    	//alert
    	public void handleAlert(String alerttype, String options) throws Exception {
    		Alert alert = driver.switchTo().alert();
    		
    		if(alerttype.equals("Sample")) {
    			if(options.equals("accept")) {
    				alert.accept();
    			}else{
    				
    				throw new Exception("Not Valid Option");
    			}
    			}else if (alerttype.equals("Confirm"));{
    			   if(options.equals("accept")){
    				   alert.accept();
    			   
    			   }else if (options.equals("dismiss")){
    				   alert.dismiss();
    			   }else if(alerttype.equals("prompt")) {
    				   if(options.equals("dismiss")) {
    					   alert.dismiss();
    				   }else {
    					   alert.sendKeys(options);
    					   alert.accept();
    				   }
    			   }
    		
    			   
    			}

    }	
    	}

    	
    	
