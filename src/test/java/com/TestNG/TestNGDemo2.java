package com.TestNG;

import org.testng.annotations.Test;

//enabled
//description
//priority
//invocationCount
//invocationTimeOut

public class TestNGDemo2 {
  @Test(priority=4,description="Demo2")
  public void Demo2() {
	  System.out.println("Demo2 executed");
  }
  @Test(priority=3)
  public void demo3() {
	  System.out.println("demo3 executed");
  }
 
  @Test(priority=3)
  public void demo4() {
	  System.out.println("demo4 executed");
  }
  
}
