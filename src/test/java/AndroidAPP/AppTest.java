package AndroidAPP;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest
{

	@BeforeSuite
	public AndroidDriver setcapabilities() throws InterruptedException, IOException {
	
		
		Runtime.getRuntime().exec("cmd /c start C:\\appiumstart.bat");
		Thread.sleep(150000L);
		
		File appDir = new File("src");
		   
		File app = new File(appDir, "ApiDemos-debug.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "zy2233369c");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		
 System.out.println("Device Found");
		 
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
		 System.out.println("Appium SetUp for Android is successful and Appium Driver is launched successfully");
		
	return driver;
	}


	}

