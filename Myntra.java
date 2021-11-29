package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
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

public class Myntra {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");

		String a = driver.getCurrentUrl();
		System.out.println("Myntra url : "+a);

		String b = driver.getTitle();
		System.out.println("Title : "+b);

		if (b.contains("Myntra")) {
			System.out.println("Correct launch to myntra website ");

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions ac = new Actions(driver);
		Robot ro = new Robot();

		for (int j1 = 0; j1 < 5; j1++) {

			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(5000);
	
		}

		WebElement c = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[27]"));
		ac.moveToElement(c).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement d = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		ac.moveToElement(d).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement e = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		ac.moveToElement(e).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement f = driver.findElement(By.xpath("(//input[@type='checkbox'])[10]"));
		ac.moveToElement(f).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement g = driver.findElement(By.xpath("//h4[text()='Suede Structured Shoulder Bag']"));
		ac.moveToElement(g).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		String k = g.getText();
		System.out.println(k);

		Set<String> h = driver.getWindowHandles();

		for (String i : h) {
			String j = driver.switchTo().window(i).getTitle();
			if (j.contains(k)) {

				driver.switchTo().window(i);

			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * Thread.sleep(5000); ro.keyPress(KeyEvent.VK_ESCAPE);
		 * ro.keyRelease(KeyEvent.VK_ESCAPE); Thread.sleep(5000);
		 */
		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\myntra cart.png");
		FileUtils.copyFile(save, path);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement l = driver
				.findElement(By.xpath("//div[contains(@class,'pdp-add-to-bag pdp-button pdp-flex pdp-center')]"));
		ac.moveToElement(l).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement m = driver.findElement(By.xpath("//a[contains(@class,'pdp-goToCart pdp-add-to-bag')]"));
		ac.moveToElement(m).click().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement n = driver.findElement(
				By.xpath("//div[@class='addressStrip-base-changeBtn addressStrip-base-changeBtnDesktop']"));
		// ac.moveToElement(n).click().perform();
		js.executeScript("arguments[0].click();", n);
		
		
		Thread.sleep(5000);
		WebElement o = driver.findElement(By.id("pincode"));
		o.sendKeys("602024");

		WebElement p = driver.findElement(By.xpath("//div[text()='CHECK']"));
		ac.moveToElement(p).click().perform();

		Thread.sleep(2500);

		TakesScreenshot r = (TakesScreenshot) driver;
		File save1 = r.getScreenshotAs(OutputType.FILE);
		File path1 = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\myntra order.png");
		FileHandler.copy(save1, path1);

		WebElement q = driver.findElement(By.xpath("//div[text()='Place Order']"));
		js.executeScript("arguments[0].scrollIntoView(true);", q);
		js.executeScript("arguments[0].click();", q);
		// ac.moveToElement(q).click().perform();

	}

}
