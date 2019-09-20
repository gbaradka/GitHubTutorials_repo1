package io.practo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class POM1 {
	WebDriver driver;
	@FindBy(xpath = "//input[@id='121sdfsdf")
	public WebElement ele;

	@FindBy(xpath = "//input[@id='121sdfsdf")
	public WebElement password;

	public void init() {
		String chromeExePath = "D:\\Downloaded_softwares\\Selenium_softwares\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		driver = new ChromeDriver();
	}

	@Test
	public void doLogin() {
		ele.sendKeys("gamnesh");
		password.sendKeys("password");
	}
}
