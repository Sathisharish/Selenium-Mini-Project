package com.practice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAutoParts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://shop.advanceautoparts.com/s/oil-change-bundle?campsource=homepage&campmedium=topleft&campcontent=oil-bundle");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> a = driver.findElements(By.tagName("b"));
		int size = a.size();
		System.out.println(size);

		List<WebElement> c = driver.findElements(By.xpath("//div[@class=\"aap-bb166\"]"));
		int size2 = c.size();
		System.out.println(size2);

		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

		for (WebElement b : a) {

			System.out.println(b.getText());
		}

		for (WebElement d : c) {
			String e = d.getText();
			// String f = e.replaceAll("[^0-9]", "");
			System.out.println(e);

		}

		for (int i = 0; i < size; i++) {

			map.put(a.get(i).getText(), c.get(i).getText());

		}
		System.out.println(map);
		
		System.out.println("*****************************************");

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> g : entrySet) {

			System.out.println(g);
		}
	}

}
