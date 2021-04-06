package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "F:\\Tools\\chromedriver_win32\\chromedriver.exe");
	
	
	//open real browser
	 
	 driver = new ChromeDriver();
	 
	 //Firefox Driver
	 
	// System.setProperty("webdriver.gecko.driver", "F:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		
		//open real browser
		 
		 //driver = new FirefoxDriver();
	 
	 //Time
	 Thread.sleep(3000);
	
	//close Browser
	
	driver.close();
	
	}

}