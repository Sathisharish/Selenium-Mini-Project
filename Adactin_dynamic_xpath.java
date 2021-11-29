package com.practice;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adactin_dynamic_xpath {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2500);
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot ro = new Robot();
		
		WebElement us = driver.findElement(By.id("username"));
		ac.moveToElement(us).click().perform();
		us.sendKeys("sathish11");
		
		WebElement ps = driver.findElement(By.id("password"));
		ac.moveToElement(ps).click().perform();
		ps.sendKeys("123456");
		
		WebElement lo = driver.findElement(By.id("login"));
		ac.moveToElement(lo).click().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement a = driver.findElement(By.id("location"));
		ac.moveToElement(a).click().perform();
		
		WebElement b = driver.findElement(By.xpath("//option[text()='Los Angeles']"));
	//	ac.moveToElement(b).click().perform();
	//	js.executeScript("arguments[0].click();", b);
		b.click();
		
		WebElement c = driver.findElement(By.id("hotels"));
		ac.moveToElement(c).click().perform();
		
		WebElement d = driver.findElement(By.xpath("//option[text()='Hotel Sunshine']"));
	//	ac.moveToElement(d).click().perform();
		d.click();
		
		
		WebElement e = driver.findElement(By.id("room_type"));
		ac.moveToElement(e).click().perform();
		
		WebElement f = driver.findElement(By.xpath("//option[text()='Deluxe']"));
	//	ac.moveToElement(f).click().perform();
		f.click();
		
		WebElement g = driver.findElement(By.id("room_nos"));
		ac.moveToElement(g).click().perform();
		
		WebElement i = driver.findElement(By.xpath("(//option[text()='3 - Three'])[1]"));
	//	ac.moveToElement(i).click().perform();
		i.click();
		
		WebElement j = driver.findElement(By.id("datepick_in"));
	//	ac.moveToElement(i).click().perform();
		j.click();
		j.clear();
		j.sendKeys("22/11/2021");
		
		WebElement k = driver.findElement(By.id("datepick_out"));
	//	ac.moveToElement(k).click().perform();
		k.click();
		k.clear();
		k.sendKeys("24/11/2021");
		
		WebElement l = driver.findElement(By.id("adult_room"));
	//	ac.moveToElement(l).click().perform();
		l.click();
		
		WebElement m = driver.findElement(By.xpath("(//option[text()='2 - Two'])[2]"));
	//	ac.moveToElement(m).click().perform();
		m.click();
		
		WebElement n = driver.findElement(By.id("child_room"));
		ac.moveToElement(n).click().perform();
		
		WebElement o = driver.findElement(By.xpath("(//option[text()='1 - One'])[3]"));
	//	ac.moveToElement(o).click().perform();
		o.click();
		
		WebElement p = driver.findElement(By.id("Submit"));
		ac.moveToElement(p).click().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement q = driver.findElement(By.id("radiobutton_0"));
		ac.moveToElement(q).click().perform();
		
		WebElement r = driver.findElement(By.id("continue"));
		ac.moveToElement(r).click().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement s = driver.findElement(By.id("first_name"));
		ac.moveToElement(s).click().perform();
		s.sendKeys("Sathish Kumar");
		
		WebElement t = driver.findElement(By.id("last_name"));
		ac.moveToElement(t).click().perform();
		t.sendKeys("Ravi Chandran");
		
		WebElement u = driver.findElement(By.id("address"));
		ac.moveToElement(u).click().perform();
		u.sendKeys("No:4/1380 gandhi street");
		
		WebElement v = driver.findElement(By.id("cc_num"));
		ac.moveToElement(v).click().perform();
		v.sendKeys("0123456789101112");
		
		WebElement w = driver.findElement(By.id("cc_type"));
		ac.moveToElement(w).click().perform();
		
		WebElement x = driver.findElement(By.xpath("//option[text()='Master Card']"));
	//	ac.moveToElement(x).click().perform();
		x.click();
		
		WebElement y = driver.findElement(By.id("cc_exp_month"));
		ac.moveToElement(y).click().perform();
		
		WebElement z = driver.findElement(By.xpath("//option[text()='November']"));
	//	ac.moveToElement(z).click().perform();
		z.click();
		
		WebElement aa = driver.findElement(By.id("cc_exp_year"));
		ac.moveToElement(aa).click().perform();
		
		WebElement bb = driver.findElement(By.xpath("//option[text()='2022']"));
	//	ac.moveToElement(bb).click().perform();
		bb.click();
		
		WebElement cc = driver.findElement(By.id("cc_cvv"));
		ac.moveToElement(cc).click().perform();
		cc.sendKeys("123");
		
		WebElement dd = driver.findElement(By.id("book_now"));
		ac.moveToElement(dd).click().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ee = driver.findElement(By.id("my_itinerary"));
		ac.moveToElement(ee).click().perform();
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File save1 = ts1.getScreenshotAs(OutputType.FILE);
		File path1 = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\adactin booking.png");
		FileUtils.copyFile(save1, path1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ff = driver.findElement(By.id("logout"));
		ac.moveToElement(ff).click().perform();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\adactin logout.png");
		FileUtils.copyFile(save, path);

		
	}

}
