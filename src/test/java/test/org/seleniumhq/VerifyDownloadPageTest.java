package test.org.seleniumhq;
	
	import org.junit.Assert;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class VerifyDownloadPageTest {
		
		@Test
		public void test01(){
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.seleniumhq.org/");
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Get Selenium']")));
			driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
			System.out.println(driver.getTitle());
			Assert.assertEquals("Downloads", driver.getTitle());
			driver.quit();
		}
		
	}

