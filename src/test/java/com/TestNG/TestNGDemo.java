package com.TestNG;

import org.testng.annotations.Test;

//enabled
//description
//priority
//invocationCount
//invocationTimeOut

public class TestNGDemo {
  @Test(priority=2,description="Demo1")
  public void Demo1() {
	  System.out.println("Demo1 executed");
  }
  @Test(priority=1)
  public void demo1() {
	  System.out.println("demo1 executed");
  }
 
  @Test(priority=3)
  public void demo2() {
	  System.out.println("demo2 executed");
  }
  
}
