package test.org.seleniumhq;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class VerifyDownloadPageTest {
		
		@Test
		public void test01(){
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.seleniumhq.org/");
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
			System.out.println(driver.getTitle());
			Assert.assertEquals(driver.getTitle(),"Selenium - Web Browser Automation");
		
			driver.quit();
		}
		
	}

