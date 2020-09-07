package com.selenium.masterpart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtractSpecificElementOnWebPage {

	WebDriver driver = null;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/wridd/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://edition.cnn.com");
		driver.manage().window().maximize();

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void getElements() {

//		WebElement newsAndBuzz = driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-2']/div[5]/div/div[1]/ul/h2"));
		//WebElement newsAndBuzz = driver.findElement(By.xpath("//body/div/section[3]/div[5]/div[1]/div[1]//li/article"));
		
		List<WebElement> newsAndBuzzLinks = driver.findElements(By.xpath("//body/div/section[3]/div[5]/div[1]/div[1]//li/article//a"));

		System.out.println("Number of Top Stories on CNN are : "+ newsAndBuzzLinks.size());

		for (WebElement topLink : newsAndBuzzLinks) {
			String topLinkText = topLink.getText();

			if (!topLinkText.isEmpty()) {
				System.out.println(topLinkText);
			}

		}

	}

}