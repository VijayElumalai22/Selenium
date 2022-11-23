package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\THALAVEL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("VijayElumalai");
		driver.findElement(By.id("password")).sendKeys("TheeranVJ@2219");
		driver.findElement(By.id("login")).click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Hervey");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByIndex(1);
		
		WebElement NumofRooms = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(NumofRooms);
		s4.selectByValue("3");
		
		driver.findElement(By.id("datepick_in")).sendKeys("12/11/2022");
		
		driver.findElement(By.id("datepick_out")).sendKeys("13/11/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByValue("0");
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Vijay");
		
		driver.findElement(By.id("last_name")).sendKeys("Elumalai");
		
		driver.findElement(By.id("address")).sendKeys("NO.500, First Street, Tiruvannamalai");
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("7894456112347894");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select cc = new Select(cardtype);
		cc.selectByValue("VISA");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select m = new Select(month);
		m.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(year);
		y.selectByValue("2022");
		
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		driver.findElement(By.linkText("Booked Itinerary")).click();
		
		driver.findElement(By.xpath("//input[@id='logout']")).click();
		
		
		
	}

}
