package test.org.seleniumhq;
	
	import org.junit.Assert;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class VerifyDownloadPageTest {
		
		@Test
		public void test01(){
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.seleniumhq.org/");
			driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
			System.out.println(driver.getTitle());
			Assert.assertEquals("Downloads", driver.getTitle());
			driver.quit();
		}
		
	}

