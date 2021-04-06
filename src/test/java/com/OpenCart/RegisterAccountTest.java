package com.OpenCart;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class RegisterAccountTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		openHomePage();
		OpenRegisterPage();
	TC_01_RegisterAccountTest();
		TC_02_RegisterAccountTest();
		//closeBrowser();
		
    System.out.println(getSaltString()+ "@gmail.com");


	}
	
	protected static String getSaltString() {
		String SALTCHARS = "abcdef12345";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		
		while(salt.length()<5) {
			int index = (int) (rnd.nextFloat()*SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		
		String saltStr = salt.toString();
		return saltStr;
		
	}
	
	public static void OpenRegisterPage() throws InterruptedException {
		
		WebElement MyAccount= driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);
		
		WebElement Register= driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a"));
		Register.click();
		Thread.sleep(4000);
	}
	
	public static void TC_01_RegisterAccountTest() throws InterruptedException {
		WebElement FirstName = driver.findElement(By.id("input-firstname"));
		WebElement LastName = driver.findElement(By.id("input-lastname"));
		WebElement Email = driver.findElement(By.id("input-email"));
		WebElement Telephone = driver.findElement(By.id("input-telephone"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement PasswordConfirm = driver.findElement(By.id("input-confirm"));
		WebElement PrivacyPolicy = driver.findElement(By.name("agree"));
		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		
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
		Email.sendKeys(getSaltString()+"@gmail.com");
		Thread.sleep(2000);
		Telephone.sendKeys("01712345234");
		Thread.sleep(2000);
		 Password.sendKeys("12345");
		Thread.sleep(2000);
		PasswordConfirm.sendKeys("12345");
		
		 PrivacyPolicy.click();
		 Continue.click();
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		
	}
	
	
	public static void TC_02_RegisterAccountTest() throws InterruptedException {
		WebElement FirstName = driver.findElement(By.id("input-firstname"));
		WebElement LastName = driver.findElement(By.id("input-lastname"));
		WebElement Email = driver.findElement(By.id("input-email"));
		WebElement Telephone = driver.findElement(By.id("input-telephone"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement PasswordConfirm = driver.findElement(By.id("input-confirm"));
		WebElement PrivacyPolicy = driver.findElement(By.name("agree"));
		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		
		
		FirstName.clear();
		LastName.clear();
		Email.clear();
		Telephone.clear();
		Password.clear();
		PasswordConfirm.clear();
		
	
		FirstName.sendKeys("JGJHBNM");
		Thread.sleep(2000);
		LastName.sendKeys("Islam");
		Thread.sleep(2000);
		Email.sendKeys(getSaltString()+ "@gmail.com");
		Thread.sleep(2000);
		Telephone.sendKeys("01712345237");
		Thread.sleep(2000);
		 Password.sendKeys("12345");
		Thread.sleep(2000);
		PasswordConfirm.sendKeys("12346");
		Thread.sleep(4000);
		
		
		PrivacyPolicy.click();
		PrivacyPolicy.click();
		 Continue.click();
		 Thread.sleep(5000);

}
}
