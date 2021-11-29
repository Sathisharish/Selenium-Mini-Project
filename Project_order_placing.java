package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Project_order_placing {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/basket/");

		Thread.sleep(5000);

		WebElement aa = driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/header/div/nav/ul/li[1]/a"));
		aa.click();

		WebElement a1 = driver.findElement(By.className("woocommerce-breadcrumb"));
		String b = a1.getText();
		System.out.println(b);
		System.out.println();

		if (b.equalsIgnoreCase("Home / Shop")) {

			System.out.println("You have sucessfully entered into practice site");

		} else
			System.out.println("Invalid site");
		/*
		 * WebElement c = driver.findElement(By.xpath("//a[@id='menu-icon']"));
		 * c.click();
		 * 
		 * WebElement d = driver.findElement(By.xpath("//a[text()='Shop']")); d.click();
		 */
		WebElement e = driver.findElement(By.xpath("(//a[@rel=\"nofollow\"])[2]"));
		e.click();

		Thread.sleep(2500);

		WebElement f = driver.findElement(By.xpath("//a[@title='View your shopping cart']"));
		f.click();

		Thread.sleep(4000);

		WebElement g = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input"));
		g.clear();
		g.sendKeys("3");

		WebElement g1 = driver.findElement(By.name("update_cart"));
		g1.click();

		Thread.sleep(2000);

		WebElement h = driver.findElement(By.xpath("//a[text()='Shop']"));
		h.click();

		WebElement i = driver.findElement(By.xpath("(//a[text()='Add to basket'])[6]"));
		i.click();

		Thread.sleep(2500);

		WebElement j = driver.findElement(By.xpath("//a[@class=\"wpmenucart-contents\"]"));
		j.click();

		WebElement k = driver.findElement(By.xpath("(//input[@type=\"number\"])[2]"));
		k.clear();
		k.sendKeys("3");

		WebElement l = driver.findElement(By.xpath("//input[@value=\"Update Basket\"]"));
		l.click();

		Thread.sleep(4000);

		WebElement m = driver.findElement(By.xpath("//a[contains(text(),' Checkout')]"));
		m.click();

		Thread.sleep(2500);

		WebElement n = driver.findElement(By.id("billing_first_name"));
		System.out.println(n.getText());
		n.sendKeys("sathish");
		System.out.println();
		String o = n.getAttribute("value");
		System.out.println(o);

		WebElement p = driver.findElement(By.id("billing_last_name"));
		System.out.println(p.getText());
		System.out.println();
		p.sendKeys("kumar");
		System.out.println(p.getAttribute("value"));

		WebElement q = driver.findElement(By.id("billing_company"));
		q.sendKeys("Greens");

		WebElement r = driver.findElement(By.id("billing_email"));
		r.sendKeys("abcdfe@gmail.com");

		WebElement s = driver.findElement(By.id("billing_phone"));
		s.sendKeys("9876543210");

		WebElement t = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/form[3]/div[1]/div[1]/div/p[6]/div/a/span[1]"));
		
		t.click();
		
		WebElement t1 = driver.findElement(By.xpath("(//input[@spellcheck='false'])[2]"));
		t1.sendKeys("India");
		
		WebElement t2 = driver.findElement(By.xpath("(//div[@role=\"option\"])[2]"));
		t2.click();
		
		System.out.println("selected country is " + t.getText());

		WebElement w = driver.findElement(By.xpath("//input[@placeholder='Street address']"));
		w.sendKeys("Gandhi street");

		WebElement x = driver.findElement(By.xpath("//input[contains(@placeholder,'Apartment')]"));
		x.sendKeys("1380,Selvaraj nagar");

		WebElement z = driver.findElement(By.id("billing_city"));
		z.sendKeys("Chennai");
		
		WebElement ff = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/form[3]/div[1]/div[1]/div/p[10]/div/a/span[1]"));
		//WebElement ff = driver.findElement(By.xpath("(//a[contains(@class,'choice')])[2]"));
		ff.click();
		
		WebElement ff1 = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		ff1.sendKeys("Tamil");
		
		WebElement ff2 = driver.findElement(By.xpath("(//div[@role='option'])"));
		ff2.click();

		WebElement y = driver.findElement(By.id("billing_postcode"));
		y.sendKeys("602024");

		/*
		 * WebElement hh = driver.findElement(By.id("createaccount")); hh.click();
		 * 
		 * WebElement bb = driver.findElement(By.id("account_password"));
		 * bb.sendKeys("s@thish123");
		 */

		WebElement cc = driver.findElement(By.id("payment_method_cod"));
		cc.click();		

		WebElement dd = driver.findElement(By.id("place_order"));
		dd.click();

		Thread.sleep(5000);

		TakesScreenshot ee = (TakesScreenshot) driver;

		File save = ee.getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\2-1.png");

		FileHandler.copy(save, path);

	}

}
