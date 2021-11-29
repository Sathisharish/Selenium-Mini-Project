package com.practice;

import java.awt.Robot; 
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Youtube_Project {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		// Thread.sleep(15000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement a = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		a.click();
		a.sendKeys("selenium");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);

		/*
		 * Robot kb = new Robot();
		 * 
		 * kb.keyPress(KeyEvent.VK_ENTER); kb.keyRelease(KeyEvent.VK_ENTER);
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement b = driver
				.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button"));
		b.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement c = driver.findElement(By.xpath(
				"(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));

		js.executeScript("arguments[0].scrollIntoView();", c);

		String d = c.getText();
		System.out.println(d);

		js.executeScript("arguments[0].click();", c);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(15000);

		WebElement e = driver.findElement(By.xpath("//video[@controlslist='nodownload']"));
		e.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement f = driver.findElement(By.xpath("//button[@title='Play (k)']"));
		f.click();

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File save = ts.getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\youtube.png");

		FileHandler.copy(save, path);
		
		
		WebElement g = driver.findElement(By.xpath("//h1[@class='title style-scope ytd-video-primary-info-renderer']"));
		String h = g.getText();
		System.out.println(h);
		
		if (h.equalsIgnoreCase(d)) {
			
			System.out.println("It is a match ");
			
		} else {
			System.out.println("It is not a match ");
		}
		
		
		driver.close();
	}

}
