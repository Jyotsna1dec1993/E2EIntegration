package Package_Integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class TC_03 {
	public void test_01() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//Users//jyotsnasingh//Downloads//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://testsite.com");
		//driver.wait(1000);
		driver.quit();
	}

}
