package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_project_2nd_half {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(4000);

		WebElement a = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		a.click();

		Thread.sleep(4000);

		WebElement b = driver.findElement(By.id("email"));
		b.sendKeys("sathish4321@gmail.com");

		WebElement c = driver.findElement(By.id("passwd"));
		c.sendKeys("S@thish123");

		WebElement d = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		d.click();

		Thread.sleep(10000);

		WebElement e = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions f = new Actions(driver);
		f.moveToElement(e).click().perform();

		Thread.sleep(8000);

		WebElement g = driver.findElement(By.xpath("(//span[@class='grower CLOSE'])[2]"));
		g.click();

		WebElement h = driver.findElement(By.xpath("(//a[contains(@title,'Browse our differen')])[1]"));
		h.click();

		Thread.sleep(15000);

		WebElement i = driver.findElement(By.xpath("(//a[@class='color_pick'])[2]"));
		i.click();

		Thread.sleep(10000);

		WebElement j = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		f.moveToElement(j).perform();

		for (int j2 = 0; j2 < 4; j2++) {

			f.click().perform();

		}

		WebElement k = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
		k.click();

		Select l = new Select(k);
		l.selectByVisibleText("L");

		WebElement m = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		m.click();

		Thread.sleep(5000);

		TakesScreenshot n = (TakesScreenshot) driver;

		File save = n.getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\add to cart.png");

		FileUtils.copyFile(save, path);
		
		Thread.sleep(4000);
		
		WebElement o = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		o.click();

		Thread.sleep(8000);

		WebElement p = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		p.click();

		Thread.sleep(8000);

		WebElement q = driver.findElement(By.xpath("//textarea[@name='message']"));
		q.sendKeys("Mini Project Second Half");

		WebElement r = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		r.click();

		Thread.sleep(8000);

		WebElement s = driver.findElement(By.id("uniform-cgv"));
		s.click();

		WebElement t = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkou')])[2]"));
		t.click();

		Thread.sleep(8000);

		WebElement u = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		u.click();

		Thread.sleep(8000);

		WebElement v = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		v.click();

		Thread.sleep(8000);

		WebElement w = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		f.moveToElement(w).perform();

		Robot x = new Robot();

		for (int x2 = 0; x2 <= 8; x2++) {

			x.keyPress(KeyEvent.VK_DOWN);
			x.keyRelease(KeyEvent.VK_DOWN);

		}

		Thread.sleep(5000);

		TakesScreenshot y = (TakesScreenshot) driver;

		File save1 = y.getScreenshotAs(OutputType.FILE);

		File path1 = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\order placed.png");

		FileHandler.copy(save1, path1);

		Thread.sleep(5000);

	

	}

}
