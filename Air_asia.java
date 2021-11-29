package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Air_asia {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.airasia.co.in/home");
		System.out.println();

		Thread.sleep(2500);

		Actions mo = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String a = driver.getTitle();
		System.out.println(a);
		System.out.println();

		if (a.contains("AirAsia")) {

			System.out.println("correct launch");

		} else {
			System.out.println("Incorrect launch ");

		}
		System.out.println();

		Robot key = new Robot();

		key.keyPress(KeyEvent.VK_ESCAPE);
		key.keyRelease(KeyEvent.VK_ESCAPE);

		WebElement b = driver.findElement(By.id("One Way"));
		b.click();

		WebElement c = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[144]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div/div/div[1]/div"));
		c.click();

		WebElement d = driver.findElement(By.xpath("//div[text()='Mumbai']"));
		d.click();

		WebElement d1 = driver.findElement(By.xpath("(//div[@class='flight-search-source-code'])[1]"));
		String d2 = d1.getText();
		System.out.println(d2);
		System.out.println();

		Thread.sleep(2500);

		WebElement f = driver.findElement(By.xpath("//div[text()='Kolkata']"));
		f.click();

		WebElement f1 = driver.findElement(By.xpath("(//div[@class='flight-search-source-code'])[2]"));
		String f2 = f1.getText();
		System.out.println(f2);
		System.out.println();

		WebElement g = driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']"));
		g.click();

		WebElement h = driver.findElement(By.xpath("//div[text()='Dec 2021']"));
		js.executeScript("arguments[0].scrollIntoView();", h);
		// mo.moveToElement(h).perform();

		Thread.sleep(4000);

		WebElement i = driver.findElement(By.xpath("(//div[@class='calender-day'])[92]")); //
		mo.moveToElement(i).perform();
		mo.click().perform();

		WebElement j = driver.findElement(By.xpath("//button[text()='Back']"));
		j.click();

		WebElement k = driver.findElement(By.xpath("(//div[contains(@class,'-arrow-wrapper')])[1]"));
		k.click();

		WebElement l = driver.findElement(By.xpath("(//img[@alt='plus'])[1]"));

		for (int l2 = 0; l2 < 2; l2++) {

			mo.click(l).perform();

		}

		WebElement m = driver.findElement(By.xpath("(//img[@alt='plus'])[4]"));
		m.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\ air asia guest.png");
		FileUtils.copyFile(save, path);

		WebElement n = driver.findElement(By.xpath("//button[text()='Done']"));
		n.click();

		WebElement o = driver.findElement(By.xpath("//img[@class='flight-search-icon']"));
		o.click();

		Thread.sleep(5000);

		WebElement p = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		p.click();

		WebElement q = driver.findElement(By.xpath("(//label[text()='After 6 PM'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", q);
		q.click();

		WebElement r = driver.findElement(By.xpath("//div[@class='fa-sd-source']"));
		String s1 = r.getText();
		System.out.println(s1);
		System.out.println();

		WebElement s = driver.findElement(By.xpath("//div[@class='fa-sd-destination']"));
		String t1 = s.getText();
		System.out.println(t1);
		System.out.println();

		if (s1.equalsIgnoreCase(d2) && t1.equalsIgnoreCase(f2)) {
			System.out.println("Validated source and destination place sucessfully");

		} else {
			System.out.println("Mismatch in source and destination place");

		}
		System.out.println();

		/*
		 * List<WebElement> t = driver.findElements(By.tagName("label")); int size =
		 * t.size(); System.out.println(size); System.out.println();
		 */

		List<WebElement> list = driver.findElements(By.xpath("//label[@class='discounted-price']"));
		int size1 = list.size();
		System.out.println(size1);
		System.out.println();

		ArrayList<Integer> aaa = new ArrayList<Integer>();

		ArrayList<String> li = new ArrayList<String>();
		for (WebElement u : list) {

			li.add(u.getText());
			System.out.println(u.getText());

			String v = u.getText().replaceAll(",", "");
			String w = v.substring(1);
			System.out.println(w);
			int x = Integer.parseInt(w);
			aaa.add(x);

		}

		Collections.sort(aaa);

		Integer y = aaa.get(0);

		System.out.println("The lowest value is " + y);

		String z = String.valueOf(y);
		System.out.println(z);

		String aa = z.substring(0, 1) + "," + z.substring(1);
		System.out.println(aa);

		WebElement bb = driver.findElement(By.xpath("//label[contains(text(),'" + aa + "')]"));
		String cc = bb.getText();
		System.out.println(cc);

		int dd = li.indexOf(cc);
		System.out.println(dd);
		System.out.println();

		int ee = dd + 1;

		String ff = String.valueOf(ee);

		System.out.println(ff);
		System.out.println();

		/*
		 * WebElement parent = bb.findElement(By.xpath("./..")); String dd =
		 * parent.getTagName(); System.out.println(dd);
		 */

		/*
		 * WebElement dd = driver.findElement(By.xpath("//label[contains(text(),'" + aa
		 * + "')]//parent::span")); String ee = dd.getTagName();
		 */

		Thread.sleep(5000);

		WebElement gg = driver.findElement(By.xpath("(//input[@type='radio'])[" + ff + "]"));
		js.executeScript("arguments[0].click();", gg);

		Thread.sleep(5000);

		WebElement hh = driver.findElement(By.xpath("//button[text()='Continue']"));
		mo.moveToElement(hh).perform();
		mo.click().perform();

		Thread.sleep(5000);

		WebElement ii = driver.findElement(By.xpath("(//span[@class='city-code-info'])[1]"));
		String jj = ii.getText();
		System.out.println(jj);
		System.out.println();

		WebElement kk = driver.findElement(By.xpath("(//span[@class='city-code-info'])[2]"));
		String ll = kk.getText();
		System.out.println(ll);
		System.out.println();

		if (s1.equalsIgnoreCase(jj) && t1.equalsIgnoreCase(ll)) {
			System.out.println("Validated source and destination place sucessfully");

		} else {
			System.out.println("Mismatch in source and destination place");

		}
		System.out.println();

		Thread.sleep(5000);

		TakesScreenshot mm = (TakesScreenshot) driver;
		File save1 = mm.getScreenshotAs(OutputType.FILE);
		File path1 = new File(
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\air asia booking.png");
		FileHandler.copy(save1, path1);

	}

}
