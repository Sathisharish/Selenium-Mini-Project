package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Snapdeal {

	public static void main(String[] args) throws AWTException, Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Actions ac = new Actions(driver);

		Robot Ro = new Robot();

		String a1 = driver.getTitle();
		System.out.println(a1);

		String a2 = driver.getCurrentUrl();
		System.out.println(a2);

		if (a1.contains("www. Snapdeal.com")) {
			System.out.println("Validated sucessfully ");
		} else
			System.out.println("Incorrect - launch ");

		WebElement a = driver.findElement(By.xpath("//span[text()='Electronics']//parent::a"));

		ac.moveToElement(a).perform();

		WebElement b = driver.findElement(By.xpath("//span[text()='Semi Automatic']//ancestor::p"));
		ac.moveToElement(b).perform();
		ac.click().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement c = driver.findElement(By.xpath("//a[contains(@title,'TVs, Audio')]//following-sibling::i"));
		ac.moveToElement(c).perform();
		ac.click().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement d = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		// d.click();
		// js.executeScript("arguments[0].value='602024';", d);
		d.sendKeys("602024");

		WebElement e = driver.findElement(By.xpath("//button[text()='Check']"));
		e.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement f = driver.findElement(By.xpath("//div[contains(text(),'DTH Service')]"));
		ac.moveToElement(f).perform();
		Thread.sleep(1000);
		ac.click().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement g = driver
				.findElement(By.xpath("//p[contains(@title,'TATA Sky HD Connection with One Month Fami')]"));
		// js.executeScript("arguments[0].scrollIntoView(true);", g);

		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(1500);

		WebElement h = driver.findElement(By.xpath("//span[@data-price='1799']"));
		ac.moveToElement(h).perform();
		Thread.sleep(1500);
		ac.click().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> i = driver.getWindowHandles();
		for (String j : i) {
			
			String url = driver.switchTo().window(j).getCurrentUrl();
			
			if (url.contains("https://www.snapdeal.com/product/tata-sky-hd-family-kids")) {

				driver.switchTo().window(j);
			}
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\tatasky cart.png");
		FileUtils.copyFile(save, path);		
		
		WebElement k = driver.findElement(By.xpath("//span[text()='add to cart']"));
		k.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement l = driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
		l.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		TakesScreenshot m = (TakesScreenshot) driver;
		File save1 = m.getScreenshotAs(OutputType.FILE);
		File path1 = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\tatasky order.png");
		FileHandler.copy(save1, path1);
		
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		WebElement n = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-menu']"));
		ac.moveToElement(n).perform();
		ac.click().perform();
		Thread.sleep(1000);
		
		WebElement o = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[2]"));
		ac.moveToElement(o).perform();
		ac.click().perform();
		Thread.sleep(1000);
		
		WebElement p = driver.findElement(By.xpath("//span[text()='Jackets']"));
		ac.moveToElement(p).click().perform();
		//ac.click().perform();

		Thread.sleep(10000);
		
		for (int j1 = 0; j1 < 5; j1++) {
			
		js.executeScript("window.scrollBy(0,2200)", "");
		Thread.sleep(5000);
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement q = driver.findElement(By.xpath("//p[text()='Hangup Multi Checks Casual Blazers']"));
		ac.moveToElement(q).perform();
		ac.click().perform();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Set<String> r = driver.getWindowHandles();
		for (String s : r) {
			String t = driver.switchTo().window(s).getTitle();
			if (t.contains("Hangup Multi Checks Casual Blazers")) {
				
				driver.switchTo().window(s);
				
			}
			
		}
		
		WebElement u = driver.findElement(By.xpath("//div[@selectedattr='40']"));
		ac.moveToElement(u).click().perform();
		
		Thread.sleep(2000);
		
		TakesScreenshot w= (TakesScreenshot) driver;
		File save2 = w.getScreenshotAs(OutputType.FILE);
		File path2 = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\ jacket cart.png");
		FileUtils.copyFile(save2, path2);
		
		WebElement v = driver.findElement(By.xpath("//span[text()='add to cart']"));
		ac.moveToElement(v).click().perform();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement x = driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
		ac.moveToElement(x).click().perform();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		TakesScreenshot y= (TakesScreenshot) driver;
		File save3 = y.getScreenshotAs(OutputType.FILE);
		File path3 = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\ jacket order.png");
		FileUtils.copyFile(save3, path3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
