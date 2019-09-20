package io.practo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCode {
	public static WebDriver driver;

//	public static WebElement waits() {
//		WebElement fluentWait(final By locator){
//		    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//		    		.withTimeout(30, TimeUnit.SECONDS)
//		            .pollingEvery(5, TimeUnit.SECONDS)
//		            .ignoring(NoSuchElementException.class);
//
//		    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		        public WebElement apply(WebDriver driver) {
//		            return driver.findElement(locator);
//		        }
//		    });
//
//		    return foo;
//		};
//	}

	public static void main(String[] args) {
		m();

	}

	public static void init() throws IOException {
		String chromeExePath = "D:\\Downloaded_softwares\\Selenium_softwares\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		driver = new ChromeDriver();
		
				
		driver.get("https://cnn.com/");

		driver.findElement(By.xpath("asas")).click();

		WebElement e = driver.findElement(By.xpath("//*[@id='footer-search-bar']"));
		e.sendKeys("hello");
		e.clear();

		
		Actions action = new Actions(driver);
		WebElement target = driver.findElement(By.id("asas"));
		action.moveToElement(target, 12, 122).click().build().perform();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.switchTo().defaultContent();
		Select s = new Select(driver.findElement(By.id("jk")));
		s.selectByIndex(33);

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("c://dfdf.png"));

		driver.findElement(By.id("wewe")).sendKeys(Keys.ENTER);

		Select oSelect = new Select(driver.findElement(By.id("sadsd")));
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();

		for (int i = 0; i < iListSize; i++) {
			// Storing the value of the option
			String sValue = oSelect.getOptions().get(i).getText();
			oSize.contains("ganesh");
			// Printing the stored value
			System.out.println(sValue);

			// Selecting all the elements one by one
			oSelect.selectByIndex(i);

		}

	}

	public static void m() {
		String s = "ganesh";
		char[] c = s.toCharArray();
		for (char a : c) {
			System.out.println(a);
		}
		System.out.println(s.indexOf('a'));

		String s2 = "hello ganesh";
		int i = s2.indexOf(s);
		System.out.println(i);
	}
	
	
	
	
	public static void ma() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert a = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		a.accept();
		
		Select s = new Select(driver.findElement(By.id("erer")));
		System.out.println(s.getOptions());
		
		
		
		
		WebElement from= driver.findElement(By.id("sdsd"));
		WebElement to= driver.findElement(By.id("sdsasasasd"));;
		Actions act = new Actions(driver);
		Action action = act.clickAndHold(from).moveToElement(to).release(to).build();
		action.perform();
			
		
	}

}
