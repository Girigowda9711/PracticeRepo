package com.CalculatorInc.Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;
	@Test
	public void loginTest() {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 System.out.println("everything is working fine");
	 System.out.println("hey ok ");
	 System.out.println("it is last commit");
	 
	 driver.quit();
	 
	 
		
		
		}
	
	@Test
	public void loginTest1() {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	 driver.quit();
	 
	 
		
		
		}
	
	
	

	


}
