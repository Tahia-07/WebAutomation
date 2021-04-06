package com.TestNG;

import org.testng.annotations.Test;

import com.Base.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class LoginDataDriven extends BaseClass {
	 @DataProvider(name="TestData")
	  public Object[][] searchData2() {
	   Object [][] data = new Object[3][2];
	   data [0][0]= "Invalid@gmail.com";
	   data[0][1] = "123456";
	  
	   data[1][0] = "tahiapeuli@gmail.com";
	   data[1][1] = "12345";
	   
	   
	   data[2][0] = "Invalid@gmail.com";
	   data[2][1] = "123456";
	   
	   return data;
	   
  }
	 
	 
	 @BeforeTest
		public void config() {
			launchChrome();

		}
	 
	 @Test(dataProvider = "TestData")
	  public void LoginTest(String email, String password) throws InterruptedException {
		  driver.get("https://demo.opencart.com/index.php?route=account/login");
		  
		  WebElement Email = driver.findElement(By.id("input-email"));
			WebElement Password = driver.findElement(By.id("input-password"));
			WebElement Login = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			
			Email.clear();
			Email.sendKeys(email);
			Thread.sleep(3000);
			
			Password.clear();
			Password.sendKeys(password);
			Thread.sleep(3000);
			
			Login.click();
			
	  }
	  
	  @AfterTest
		public void closeTest() {

			closeBrowser();
		}
}
