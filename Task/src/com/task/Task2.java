package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Task2{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		Thread.sleep(3000);
		String str=driver.findElement(By.xpath("//div/div/form/table/tbody/tr/td[1]/div[1]/div")).getText();
		System.out.println(str);
		String[] s=str.split("\n");
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].equalsIgnoreCase("selenium tutorial"))
			{
				driver.findElement(By.id("uh-search-box")).clear();
				driver.findElement(By.id("uh-search-box")).sendKeys(s[i]);
				driver.findElement(By.id("uh-search-button")).click();
			}
			
		}
				
		
		
	}

	}


