package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\THALAVEL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		
		WebElement userId = driver.findElement(By.id("email"));
		userId.sendKeys("vjy2221@gmail.com");
		userId.clear();
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234567890");
		password.clear();
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
		forgot.click();
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		create.click();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("vijay@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("123456");
		
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
		
		WebElement forgotPass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotPass.click();
		
		
	}
	

}
