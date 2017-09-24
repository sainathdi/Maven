package com.codebind;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_proj {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		String enteremail = "sainathdi@yahoo.co.in";
		String pass = "sainath123";
		String post = "This is my third Post for Automation testing using Selenium and TestNg framework!!  woohooo!!..... !!!!! #seleniumAndtestNGFramework";
		String page = "http:\\www.facebook.com";
		String profile = "https://www.facebook.com/shiva.sampath.3";
		String searchname = "shiva.sampath.3";
		String message = "Hi Sampath, this is an automated selenium script trying to send a message to you by SAI";
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		// Login to facebook page
		driver1.get(page);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("Web Page successfully opened");

		WebDriverWait wait = new WebDriverWait(driver1, 15);
		
		//enter email in the field 
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='email']")));
		element.sendKeys(enteremail);
		
		System.out.println("Email was entered successfully");
		
		// enter password in the field
		WebElement password = driver1.findElement(By.xpath(".//*[@id='pass']"));
		password.sendKeys(pass);
		
		System.out.println("Password was entered successfully ");
		
		wait = new WebDriverWait(driver1, 50);
		
		
		// look for login button & click
		WebElement loginbutton = driver1.findElement((By.xpath(".//*[@id='u_0_2']")));
		loginbutton.click();
		Thread.sleep(1000);

		System.out.println("Facebook login was successfully");

	
		// look for profile button and click
		driver1.findElement(By.xpath(".//*[@id='u_0_a']/div[1]/div[1]/div/a")).click();
		
		System.out.println("redirected to profile page");
		
		
		// look for post section to type and post a message on the wall
		
		 driver1.findElement(By.name("xhpc_message_text")).sendKeys(post);
	
		Thread.sleep(3000);
		System.out.println("Found Post section");
		
		wait = new WebDriverWait(driver1, 50);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement post1 = driver1.findElement(By.xpath(("//button[contains(.,'Post')]")));
		Actions aj = new Actions(driver1);
		aj.pause(10000);
		
		post1.click();

		System.out.println("Message Posted on the wall successfully");
		
		
		
		/*
		  
		 //delete the message which was posted
		 
		driver1.findElement(By.xpath(".//*[@id='u_ps_0_0_q']")).click();
		
		driver1.findElement(By.xpath(".//*[@id='u_k_0']/div/ul/li[1]/a/span/span")).click();
		
		driver1.findElement(By.xpath(".//*[@id='u_13_1']/div[3]/button")).click();
		
		*/
		
		Thread.sleep(1000);
		
		/*
		// find facebook search field and fill 
		WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[@id='u_3_2']/input[2]"))));
		search.sendKeys(searchname);
		*/
		
		// go to his facebook profile
		driver1.get("https://www.facebook.com/shiva.sampath.3");
		
		
		driver1.findElement(By.xpath(".//*[@id='u_0_18']")).click();
		
		// Hit the options button to go to send message
		WebElement hitEnter = driver1.findElement(By.xpath(".//*[@class='_1mf _1mj']"));
		hitEnter.sendKeys(message);
		hitEnter.sendKeys(Keys.RETURN);
		
	
		
		
		// Send the message string into the message text field
		
	//	driver1.findElement(By.xpath(".//*[@id='u_3v_3']")).sendKeys(message);
		
		
		
		
	}

}
