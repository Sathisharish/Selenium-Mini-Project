package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Amazon_cart {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot ro = new Robot();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String a = driver.getCurrentUrl();
		System.out.println(a);
		System.out.println();

		String b = driver.getTitle();
		System.out.println(b);
		System.out.println();

		if (a.equalsIgnoreCase("https://www.amazon.in/")) {

			System.out.println("Correct launch");

		} else {
			System.out.println("In-correct launch");

		}
		System.out.println();

		WebElement c = driver.findElement(By.partialLinkText("Electronics"));
		String ct = c.getText();
		System.out.println("You selected  " + ct);
		System.out.println();

		ac.moveToElement(c).perform();
		ac.click().perform();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement d = driver.findElement(By.partialLinkText("Computer accessories"));
		String dt = d.getText();
		System.out.println("Searching for " + dt + " in " + ct);
		System.out.println();

		d.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Featured')]"));
		e.click();

		WebElement f = driver.findElement(By.partialLinkText("Discount - Low to High"));
		String ft = f.getText();
		System.out.println("Sort price in " + ft);
		System.out.println();

		f.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement g = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		// js.executeScript("arguments[0].click();", g);
		ac.moveToElement(g).perform();
		ac.click().perform();
		// String gt = g.getText();

		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement h = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
		ac.moveToElement(h).perform();
		ac.click().perform();

		// String ht = h.getText();

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement i = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		ac.moveToElement(i).perform();
		ac.click().perform();

		// String it = i.getText();

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement j = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		ac.moveToElement(j).perform();
		ac.click().perform();

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement k = driver.findElement(By.id("low-price"));
		k.sendKeys("1000");
		String kt = k.getAttribute("value");
		System.out.println("Min price entered is " + kt);

		WebElement l = driver.findElement(By.id("high-price"));
		l.sendKeys("1500");
		String lt = l.getAttribute("value");
		System.out.println("Max price entered is " + lt);
		System.out.println();

		WebElement m = driver.findElement(By.xpath("//span[contains(text(),'Go')]"));
		ac.moveToElement(m).perform();
		ac.click().perform();

		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement n = driver.findElement(By.xpath(
				"//span[contains(text(),'HP USB Wireless/Cordless Spill Resistance Keyboard and Mouse Combo')]"));
		js.executeScript("arguments[0].click();", n);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Set<String> whs = driver.getWindowHandles();
		for (String wh : whs) {

			String url = driver.switchTo().window(wh).getCurrentUrl();

			if (url.contains("HP-Multimedia-Wireless-Keyboard")) {
				driver.navigate().to(url);
			}

		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement o = driver.findElement(By.xpath("//select[@name='quantity']"));
		Select p = new Select(o);
		p.selectByValue("3");

		String pt = p.getFirstSelectedOption().getText();
		System.out.println("quantity selected is " + pt);
		System.out.println();

		WebElement q = driver.findElement(By.id("submit.add-to-cart-announce"));
		ac.moveToElement(q).perform();
		ac.click().perform();

		WebElement ca = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]"));
		String car = ca.getText();
		System.out.println(car);
		System.out.println();

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement r = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		r.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement s = driver.findElement(By.partialLinkText("ness trackers & smartwatch"));
		String st = s.getText();
		System.out.println("you selected " + st);
		System.out.println();
		s.click();

		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement t = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]"));
		t.click();
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement u = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]"));
		u.click();
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement v = driver.findElement(By.id("low-price"));
		v.sendKeys("2000");
		String vt = v.getAttribute("value");
		System.out.println("min price entered is " + vt);
		System.out.println();

		WebElement w = driver.findElement(By.id("high-price"));
		w.sendKeys("8000");
		String wt = w.getAttribute("value");
		System.out.println("max price entered is " + wt);
		System.out.println();

		WebElement x = driver.findElement(By.xpath("//span[contains(text(),'Go')]"));
		ac.moveToElement(x).perform();
		ac.click().perform();
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement y = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[8]"));
		y.click();

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement z = driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']"));
		z.click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement aa = driver.findElement(By.partialLinkText("Low to High"));
		String aat = aa.getText();
		System.out.println("Sort using "+aat);
		System.out.println();
		
		aa.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement bb = driver.findElement(By.xpath(
				"//span[contains(text(),'Mi Watch Revolve (Chrome Silver)– Steel Frame, 1.39” AMOLED Display, 14 Days Battery, Heart Rate, Stress and Sleep Monitoring')]"));
		bb.click();

		Set<String> whs1 = driver.getWindowHandles();
		for (String wh1 : whs1) {

			String url1 = driver.switchTo().window(wh1).getCurrentUrl();

			if (url1.contains(
					"https://www.amazon.in/s?i=electronics&bbn=11599648031&rh=n%3A11599648031%2Cp_89%3AMI%7CboAt%2Cp_36%3A100000-800000%2Cp_n_specials_match%3A21618256031&s=price-asc-rank&dc&qid=1636523604&rnid=21618255031&ref=sr_st_price-asc-rank")) {
				driver.navigate().to(url1);
			}

		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(6000);

		WebElement cc = driver.findElement(By.id("submit.add-to-cart-announce"));
		ac.moveToElement(cc).perform();
		ac.click().perform();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		WebElement ca1 = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]"));
		String cart = ca1.getText();
		System.out.println(cart);
		System.out.println();

		WebElement ee = driver.findElement(By.partialLinkText("Cart"));
		ac.moveToElement(ee).perform();
		ac.click().perform();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		TakesScreenshot ff = (TakesScreenshot) driver;

		File save = ff.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\ amazon cat.png");
		FileHandler.copy(save, path);

	}

}
