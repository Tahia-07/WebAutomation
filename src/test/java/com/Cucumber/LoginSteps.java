package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	WebDriver driver;
	
	
	@Given("Open Browser")
	public void open_browser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.opencart.com/");
		 
		
	}

	@Given("Navigate to Login Page")
	public void navigate_to_login_page() throws InterruptedException {
		
		 WebElement MyAccount= driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
			MyAccount.click();
			Thread.sleep(4000);
			
			WebElement Login= driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
			Login.click();
			Thread.sleep(4000);
	    
	    
	}

	@When("Enter valid email and valid password")
	public void enter_valid_email_and_valid_password() throws InterruptedException {
		
		WebElement Email = driver.findElement(By.id("input-email"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		Email.clear();
		Email.sendKeys("tahiapeuli@gmail.com");
		Thread.sleep(3000);
		
		Password.clear();
		Password.sendKeys("12345");
		Thread.sleep(3000);
		
		Login.click();
	    
	}

	@Then("Login successful")
	public void login_successful() {
		
		WebElement myAccount= driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
		Assert.assertEquals(true, myAccount.isDisplayed());
		System.out.println("Login successful, Test pass");
		
		driver.close();
	   
	}

		
	}


