package com.AdminLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminLogin {

	public static void main(String[] args) {
		String patientdob="26/04/1993";
		String[]temp=patientdob.split("/");
		String dt=temp[0];
		String mt=temp[1];
		String year=temp[2];
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://selenium4testing.com/hms/index.php#");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		String pgtitle=driver.getTitle();
		System.out.println(pgtitle);
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[1]/a")).click();
		Select brlist=new Select(driver.findElement(By.name("PATIENT_CAT")));
		brlist.selectByIndex(1);
		Select title=new Select(driver.findElement(By.name("TITLE")));
		title.selectByIndex(1);
		driver.findElement(By.name("PNT_NAME")).sendKeys("Subhani");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Shaik");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.className("tcalSelected")).click();
		//String calyear,calmonth,caldate;
		//calyear=driver.findElement(By.id("tcalControls")).getText();
		//System.out.println(calyear);
		 //driver.findElement(By.id("tcalPrevYear")).click();
		 //calyear=driver.findElement(By.id("tcalControls")).getText();
		// System.out.println(calyear);
		 //while (!calyear.equalsIgnoreCase(year)) {
			// driver.findElement(By.id("tcalPrevYear")).click();
			 //calyear=driver.findElement(By.id("tcalControls")).getText();
			// System.out.println(calyear);
			
			 
			 
			
		}
		 
		  //driver.findElement(By.id("tcalPrevMonth")).click();
		  //driver.findElement(By.xpath("html/body/div[4]/table[2]/tbody/tr[3]/td[4]")).click();
		
		  
		  
		  
		  
		  
		  
		  
		 // System.out.println(calyear);
		/*while(!calyear.equals(year));
		{
			driver.findElement(By.id("tcalControls")).getText();
			driver.findElement(By.id("tcalPrevYear")).click();
	        calyear=driver.findElement(By.id("tcalControls")).getText();
			
		}*/
		/*
		calmonth=driver.findElement(By.id("tcalControls")).getText();
		while (!calmonth.equalsIgnoreCase(mt)) {
			driver.findElement(By.id("tcalPrevMonth")).click();
			calmonth=driver.findElement(By.id("tcalControls")).getText();
			
		}
		*/
		/*WebElement cal;
		cal=driver.findElement(By.id("tcalGrid"));
		List<WebElement>rows,cols;
		rows=cal.findElements(By.tagName("tr"));
		for (int i = 0; i <rows.size(); i++) {
			cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j <cols.size(); j++) {
				String caldt=cols.get(j).getText();
				if(caldt.equals(dt)){
					cols.get(j).click();
					break;
					
				}
				
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		

	}

