package com.task;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul[2]/li[1]/a")).click();
		Set<String>allwindows=driver.getWindowHandles();
		Object[]windows=allwindows.toArray();
		String window1=windows[0].toString();
		String window2=windows[1].toString();
		String window3=windows[2].toString();
		String window4=windows[3].toString();
		//String window5=windows[4].toString();
		//String window6=windows[5].toString();
		
		driver.switchTo().window(window2);
		driver.switchTo().window(window3);
		//driver.switchTo().window(window4);
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Report a problem")).click();
		System.out.println(title);
		//driver.switchTo().window(window4);
		driver.switchTo().window(window3).close();
		
	
		
		
		
			
		}
	

	}

