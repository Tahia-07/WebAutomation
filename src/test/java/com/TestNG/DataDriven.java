package com.TestNG;

import org.testng.annotations.Test;

import com.Base.BaseClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataDriven extends BaseClass {
 

  /*@DataProvider(name="TestData")
  public Object[][] searchData() {
   Object [][] data = new Object[3][1];
   data [0][0] = "https://google.com";
   data[1][0] = "https://bing.com";
   data [2][0] = "https://bbc.com";
   
   return data;
    }*/
  
  @DataProvider(name="TestData2")
  public Object[][] searchData2() {
   Object [][] data = new Object[2][3];
   data [0][0]= "https://google.com";
   data[0][1] = "https://demo.opencart.com/";
   data[0][2] = "https://bing.com";
   
   data [1][0] = "https://bbc.com";
   data[1][1]="https://demo.opencart.com/index.php?route=account/register";
   data[1][2]=	"https://demo.opencart.com/index.php?route=account/login";   
   
   return data;
    }
  
  @Test(dataProvider = "TestData2")
  public void doSearch(String site) {
	  driver.get(site);
  }
  
  @BeforeTest
	public void config() {
		launchChrome();

	}
  
  @AfterTest
	public void closeTest() {

		closeBrowser();
	}
  
  }

