package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");
		sleep(5000);
		
		driver.manage().window().maximize();
		sleep(5000);

		driver.findElement(By.name("firstname")).sendKeys("Lisa");
		

		driver.findElement(By.name("lastname")).sendKeys("Karter");
		sleep(5000);

		driver.findElement(By.name("reg_email__")).sendKeys("lisa123@mail.com");
		

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("lisa123@mail.com");
		sleep(5000);

		driver.findElement(By.id("password_step_input")).sendKeys("klasdjf3214");

		driver.findElement(By.id("day")).sendKeys("1");

		driver.findElement(By.id("month")).sendKeys("Jan");

		driver.findElement(By.id("year")).sendKeys("2001");
		sleep(5000);

		driver.findElement(By.className("_8esa")).click();
		sleep(5000);

		driver.findElement(By.name("websubmit")).click();
		
		
		
	}

	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
