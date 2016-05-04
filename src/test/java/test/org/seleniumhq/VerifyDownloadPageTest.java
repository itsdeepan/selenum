package test.org.seleniumhq;
	
	import java.util.concurrent.TimeUnit;

import org.junit.Assert;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class VerifyDownloadPageTest {
		
		@Test
		public void test01(){
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.seleniumhq.org/");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
			System.out.println(driver.getTitle());
			Assert.assertEquals("Downloads", driver.getTitle());
			driver.quit();
		}
		
	}

