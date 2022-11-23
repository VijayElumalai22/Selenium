package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THALAVEL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		

		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Vijay");
		driver.findElement(By.name("lname")).sendKeys("Elumalai");
		
		
		
		
		
		
		
		
		
	}
}
