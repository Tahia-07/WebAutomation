package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationTest {
  @Test
  public void test() {
	  System.out.println("test method executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClassd executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest executed");
  }

}
