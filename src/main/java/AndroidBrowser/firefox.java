package AndroidBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
	
	@Test
	public void startup()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
	}

}
