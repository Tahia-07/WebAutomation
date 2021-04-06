package com.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class LoginTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchChrome();
		openHomePage();
		OpenLoginPage();
		TC_01_LoginTest();
		closeBrowser();

	}
	
	public static void OpenLoginPage() throws InterruptedException {
		WebElement MyAccount= driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);
		
		WebElement Login= driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
		Login.click();
		Thread.sleep(4000);
		
		String LoginPageTitle = driver.getTitle();
		System.out.println(LoginPageTitle);
		
		String LoginURL = driver.getCurrentUrl();
		System.out.println(LoginURL);
	}
	
	public static void TC_01_LoginTest() throws InterruptedException {
		
		WebElement Email = driver.findElement(By.id("input-email"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		Email.clear();
		Email.sendKeys("mail@mail.com");
		Thread.sleep(3000);
		
		Password.clear();
		Password.sendKeys("12345");
		Thread.sleep(3000);
		
		Login.click();
		
	}

}
