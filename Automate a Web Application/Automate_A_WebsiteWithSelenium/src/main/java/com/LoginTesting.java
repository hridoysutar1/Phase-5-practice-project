package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.facebook.com/login/");
	        sleep(5000);
	        
	        driver.manage().window().maximize();
	        sleep(5000);
	        
	        driver.findElement(By.id("email")).sendKeys("lisa@gmail.com");
	        sleep(5000);
	        driver.findElement(By.id("pass")).sendKeys("123456789");
	        sleep(5000);
	        
	        
	        driver.findElement(By.id("loginbutton")).click();
	        
	}
	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
