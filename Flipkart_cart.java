package com.practice;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

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

public class Flipkart_cart {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Robot ro = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions ac = new Actions(driver);

		driver.get("https://www.flipkart.com");

		String a1 = driver.getCurrentUrl();
		System.out.println(a1);
		System.out.println();

		String at = driver.getTitle();
		System.out.println(at);
		System.out.println();

		if (at.contains(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {

			System.out.println("correct launch");

		} else {
			System.out.println("In-correct launch");
		}
		System.out.println();

		ro.keyPress(KeyEvent.VK_ESCAPE);
		ro.keyRelease(KeyEvent.VK_ESCAPE);

		WebElement a = driver.findElement(By.xpath("//div[text()='Mobiles']"));

		String b = a.getText();
		System.out.println(b);
		System.out.println();
		a.click();
		Thread.sleep(10000);

		WebElement find = driver.findElement(By.xpath("//span[text()='Price']"));
		js.executeScript("arguments[0].scrollIntoView();", find);

		Thread.sleep(10000);

		WebElement c = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
		c.click();

		for (int i = 0; i < 3; i++) {
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
		}
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

		// Thread.sleep(5000);

		String d = c.getAttribute("value");
		System.out.println("Min value selected is " + d);

		Thread.sleep(5000);

		/*
		 * WebElement d = se.getFirstSelectedOption(); String d1 = d.getText();
		 * System.out.println("Selected min price is " + d1);
		 */

		WebElement e = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		e.click();
		for (int i = 0; i < 4; i++) {
			ro.keyPress(KeyEvent.VK_UP);
			ro.keyRelease(KeyEvent.VK_UP);
		}
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		String g = e.getAttribute("value");
		System.out.println("Max value selected is " + g);
		System.out.println();

		/*
		 * Select sel = new Select(e); sel.selectByIndex(2); Thread.sleep(3500);
		 * 
		 * WebElement f = sel.getFirstSelectedOption(); String g = f.getText();
		 * System.out.println("Selected max price is " + g);
		 */
		Thread.sleep(5000);

		WebElement h = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div/div[1]/div/label/div[1]"));
		h.click();

		WebElement i = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div/div[1]/div/label/div[2]"));
		String j = i.getText();
		System.out.println("Selected Ram is " + j);
		System.out.println();

		Thread.sleep(3500);
		WebElement k = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[8]"));
		js.executeScript("arguments[0].click();", k);

		WebElement k1 = driver.findElement(By.xpath("(//div[@class='_3879cV'])[9]"));
		String k2 = k1.getText();
		System.out.println("Selected brands are:");
		System.out.println(k2);

		Thread.sleep(3500);
		WebElement l = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[8]"));
		js.executeScript("arguments[0].click();", l);

		WebElement m = driver.findElement(By.xpath("(//div[@class='_3879cV'])[9]"));
		String n = m.getText();
		System.out.println(n);

		Thread.sleep(3500);
		WebElement o = driver.findElement(By.xpath("//span[contains(text(),'MORE')]"));
		ac.moveToElement(o).perform();
		ac.click().perform();

		Thread.sleep(3500);

		WebElement q = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[27]"));
		js.executeScript("arguments[0].click();", q);

		Thread.sleep(3500);

		WebElement r = driver.findElement(By.xpath("(//div[@class='_3879cV'])[11]"));
		String s = r.getText();
		System.out.println(s);
		System.out.println();

		// Thread.sleep(5000);
		Thread.sleep(3500);
		WebElement t = driver.findElement(By.xpath("//div[text()='Newest First']"));
		System.out.println("Sort by " + t.getText());
		js.executeScript("arguments[0].click();", t);
		Thread.sleep(5000);

		WebElement u = driver.findElement(By.xpath("//div[text()='REDMI Note 10 Lite (Glacier White, 128 GB)']"));
		String v = u.getText();
		System.out.println(v);
		System.out.println();

		js.executeScript("arguments[0].click();", u);

		Set<String> w = driver.getWindowHandles();
		for (String x : w) {
			String z = driver.switchTo().window(x).getCurrentUrl();
			if (z != a1) {
				driver.navigate().to(z);

			}

		}

		WebElement aa = driver.findElement(By.xpath("(//img[@class='_30PAEw'])[1]"));
		ac.moveToElement(aa).perform();
		ac.click().perform();

		Thread.sleep(2500);

		WebElement bb = driver.findElement(By.partialLinkText("64 GB"));
		String cc = bb.getText();
		System.out.println("ROm selected is " + cc);
		js.executeScript("arguments[0].click();", bb);
		System.out.println();

		Thread.sleep(3500);

		WebElement dd = driver.findElement(By.partialLinkText("6 GB"));
		String ee = dd.getText();
		System.out.println("Ram selected is" + ee);
		System.out.println();
		js.executeScript("arguments[0].click();", dd);
		Thread.sleep(3500);

		WebElement ff = driver.findElement(By.id("pincodeInputId"));
		ff.sendKeys("602025");

		WebElement gg = driver.findElement(By.xpath("//span[text()='Check']"));
		js.executeScript("arguments[0].click();", gg);
		Thread.sleep(3500);

		WebElement hh = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		String ii = hh.getText();
		System.out.println(ii);
		System.out.println();
		ac.moveToElement(hh).perform();
		ac.click().perform();
		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\flipkart.png");
		FileHandler.copy(save, path);

		Thread.sleep(5000);

		WebElement jj = driver.findElement(By.partialLinkText("REDMI NOTE 10 LITE"));
		String kk = jj.getText();
		/*
		 * String kkk = kk.substring(6).toLowerCase(); System.out.println(kkk);
		 */

		WebElement ll = driver.findElement(By.xpath("//div[text()='6 GB RAM']"));
		String mm = ll.getText();
//		System.out.println(mm);
		String s1 = v.substring(0, 18);
		//System.out.println(s1);
		String s2 = kk.substring(0, 18);
		//System.out.println(s2);

		if (s1.equalsIgnoreCase(s2)) {
			if (mm.contains(ee)) {

				System.out.println("product validated sucessfully");
			}
		}

	}

}
