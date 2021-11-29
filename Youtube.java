package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

		Thread.sleep(4000);

		String a = driver.getTitle();
		System.out.println("Title of the page is : " + a);
		System.out.println();

		if (a.equalsIgnoreCase("youtube")) {

			System.out.println("Navigated to correct page ");

		} else
			System.out.println("Incorrect page ");
		System.out.println();
		Thread.sleep(2500);

		WebElement b = driver.findElement(By
				.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));// "//input[@role='combobox']"
		String c = b.getAttribute("placeholder");
		System.out.println("Default text in serach box is " + c);

		b.sendKeys("Latest hit songs tamil");
		String d = b.getAttribute("value");
		System.out.println(d);

		if (d.equalsIgnoreCase("Latest hit songs tamil")) {

			System.out.println("Input is validated successfully ");

		} else
			System.out.println("Invalid input");
		System.out.println();

		// WebElement e = driver.findElement(By.id("search-icon-legacy"));
		WebElement e = driver
				.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button"));
		e.click();

		Thread.sleep(4000);

		// WebElement f =
		// driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/div/div[1]/div/h3/a/yt-formatted-string"));

		WebElement f = driver.findElement(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/div/div[3]/yt-formatted-string/span[1]"));
		String g = f.getText();
		System.out.println(g);

		f.click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[text()='Skip Ads']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//video[@controlslist='nodownload']")).click();

		Thread.sleep(10000);

		WebElement h = driver.findElement(By.xpath("//button[@title='Play (k)']"));
		h.click();

		Thread.sleep(10000);

		WebElement i = driver.findElement(By.xpath("//button[@aria-label='Mute (m)']"));
		String i1 = i.getText();
		System.out.println(i1);

		i.click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("//video[@controlslist='nodownload']")).click();

		Thread.sleep(10000);

		WebElement j = driver.findElement(By.xpath("//button[@title='Play (k)']"));
		String j1 = i.getText();
		System.out.println(j1);

		j.click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("//video[@controlslist='nodownload']")).click();

		Thread.sleep(10000);

		WebElement k = driver.findElement(By.xpath("//button[@title='Miniplayer (i)']"));
		String k1 = k.getText();
		System.out.println(k1);
		
		Thread.sleep(10000);

		k.click();

		driver.navigate().back();

	}

}
