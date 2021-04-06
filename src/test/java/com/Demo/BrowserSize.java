package com.Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserSize {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 //Open Test Site/URL
		 
		 driver.get("https://www.google.com/");
		 
		 //Get Browser size
		 
		 //int height= driver.manage().window().getSize().getHeight();
		 int height= driver.manage().window().getSize().height;
		 int width= driver.manage().window().getSize().getWidth();
		 System.out.println("Height: "+ height+ " Width: "+width);
		 
		 //Set specific width and height 
		 
		 driver.manage().window().setSize(new Dimension(1000,500));
		 
		 int height1= driver.manage().window().getSize().height;
		 int width1= driver.manage().window().getSize().getWidth();
		 System.out.println("Height: "+ height1+ " Width: "+width1);
		 
		

	}

}
