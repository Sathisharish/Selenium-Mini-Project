package com.practice;

import java.io.File;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_project_1st_half {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		String a = driver.getTitle();
		System.out.println(a);
		System.out.println();

		String b = driver.getCurrentUrl();
		System.out.println(b);
		System.out.println();

		if (a.equalsIgnoreCase("my store")) {

			if (b.equalsIgnoreCase("http://automationpractice.com/index.php")) {

				System.out.println("you have launched " + a + " page sucessfully");

			}

		} else {
			System.out.println("selected page " + a + " is incorrect");
		}
		System.out.println();

		WebElement sigin = driver.findElement(By.className("login"));// //a[@class="'ogin']
		sigin.click();

		Thread.sleep(4000);

		String c = driver.getCurrentUrl();
		System.out.println(c);
		System.out.println();

		if (c.equals("http://automationpractice.com/index.php?controller=authentication&back=my-account")) {

			System.out.println("you are now in account creation page");
		} else
			System.out.println("Selected page is incorrect");
		System.out.println();

		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("sathish4321@gmail.com");
		String d = email.getAttribute("value");

		System.out.println("Entered mail ID is " + d);
		System.out.println();

		WebElement acc = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span/i"));
		acc.click();

		Thread.sleep(10000);

		WebElement tit = driver.findElement(By.xpath("//h1[text()='Create an account']"));
		String e = tit.getText();
		System.out.println(e);
		System.out.println();

		if (e.equalsIgnoreCase("create an account")) {

			System.out.println("Kindly fill the details for account creation");

		} else
			System.out.println("Incorrect page");
		System.out.println();

		WebElement sex = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		boolean se = sex.isSelected();
		System.out.println("Gender selection status : " + se);
		System.out.println();

		sex.click();

		boolean sel = sex.isSelected();
		System.out.println("Gender selection status : " + sel);

		WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		boolean dd = fn.isDisplayed();
		System.out.println("First name is displayed : " + dd);
		System.out.println();
		fn.sendKeys("sathish");

		WebElement ln = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		boolean ee = ln.isEnabled();
		System.out.println("Last name is enabled : " + ee);
		System.out.println();
		ln.sendKeys("Kumar");

		WebElement psw = driver.findElement(By.id("passwd"));
		System.out.println(
				"password should contain min 1 Uppercase 1 lowercase 1 specialchar 1numerical and 5 in length");
		psw.sendKeys("S@thish123");

		WebElement day = driver.findElement(By.id("days"));

		Select s = new Select(day);
		boolean mu = s.isMultiple();
		System.out.println("The drop down is multiple : " + mu);

		s.selectByIndex(18);

		List<WebElement> o = s.getOptions();

		ListIterator<WebElement> li = o.listIterator();
		while (li.hasNext()) {

			if (li.next().getText().equalsIgnoreCase("19")) {
				System.out.println("selected day is 19");
				System.out.println();
			}

		}

		WebElement mo = driver.findElement(By.id("months"));

		Select s1 = new Select(mo);

		s1.selectByValue("11");
		WebElement fs = s1.getFirstSelectedOption();
		String f1 = fs.getText();
		System.out.println(f1);
		System.out.println();

		WebElement ye = driver.findElement(By.id("years"));

		Select s3 = new Select(ye);

		s3.selectByVisibleText("1995  ");

		List<WebElement> as = s3.getAllSelectedOptions();

		for (WebElement ww : as) {

			String tt = ww.getText();

			System.out.println(tt);
			System.out.println();
		}

		WebElement cb = driver.findElement(By.id("newsletter"));
		boolean cbo = cb.isSelected();
		System.out.println("Check box selected : " + cbo);
		System.out.println();

		cb.click();

		boolean cbox = cb.isSelected();
		System.out.println("Check box selected : " + cbox);
		System.out.println();

		WebElement cb1 = driver.findElement(By.id("optin"));
		cb1.click();

		WebElement afl = driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		afl.sendKeys("sathish");

		WebElement aln = driver.findElement(By.xpath("(//input[@type=\"text\"])[6]"));
		aln.sendKeys("Kumar");

		WebElement cmpy = driver.findElement(By.xpath("(//input[@type=\"text\"])[7]"));
		cmpy.sendKeys("Greens");

		WebElement al1 = driver.findElement(By.id("address1"));
		al1.sendKeys("Gandhi street");

		WebElement al2 = driver.findElement(By.id("address2"));
		al2.sendKeys("Selvaraj nagar");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");

		WebElement st = driver.findElement(By.id("id_state"));

		Select state = new Select(st);
		state.selectByValue("5");

		List<WebElement> sta = state.getOptions();

		for (WebElement st1 : sta) {
			String s2 = st1.getText();
			if (s2.equalsIgnoreCase("California")) {

				System.out.println("Selected state is " + st1.getText());

			}

		}
		System.out.println();

		WebElement pc = driver.findElement(By.name("postcode"));
		pc.sendKeys("12345");

		WebElement hp = driver.findElement(By.id("phone"));
		hp.sendKeys("9876543210");

		WebElement mp = driver.findElement(By.id("phone_mobile"));
		mp.sendKeys("9988776655");

		WebElement al = driver.findElement(By.id("alias"));
		al.sendKeys("Reference");

		System.out.println("click submit");
		System.out.println();

		WebElement sub = driver.findElement(By.id("submitAccount"));
		sub.click();

		Thread.sleep(4000);

		TakesScreenshot log = (TakesScreenshot) driver;

		File save = log.getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\heman\\eclipse-workspace\\Selenium Intro\\Mini project\\1.png");

		FileUtils.copyFile(save, path);

	}

}
