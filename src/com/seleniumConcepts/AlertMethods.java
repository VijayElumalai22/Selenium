package com.seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\THALAVEL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		
		//Simple Alert.....
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		
		//Confirm Alert......
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		
		//Prompt Alert......
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Vijay");
		prompt.accept();
		
		
		
		
		
		
		
		
		
	}

}
