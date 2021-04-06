package com.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.OpenCart.RegisterAccountTest;

public class RegisterPageNavigation extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		openHomePage();
		RegisterAccountTest.OpenRegisterPage();
		RegisterNavigationTest();

	}
	
	
	public static void RegisterNavigationTest() throws InterruptedException {
		
		WebElement FirstName = driver.findElement(By.id("input-firstname"));
		WebElement LastName = driver.findElement(By.id("input-lastname"));
		WebElement Email = driver.findElement(By.id("input-email"));
		WebElement Telephone = driver.findElement(By.id("input-telephone"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement PasswordConfirm = driver.findElement(By.id("input-confirm"));
		
		
		FirstName.clear();
		LastName.clear();
		Email.clear();
		Telephone.clear();
		Password.clear();
		PasswordConfirm.clear();
	
		FirstName.sendKeys("Tahia");
		Thread.sleep(2000);
		LastName.sendKeys("Islam");
		Thread.sleep(2000);
		Email.sendKeys("Tahia@mail.com");
		Thread.sleep(2000);
		Telephone.sendKeys("01712345234");
		Thread.sleep(2000);
		 Password.sendKeys("12345");
		Thread.sleep(2000);
		PasswordConfirm.sendKeys("12345");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

}
