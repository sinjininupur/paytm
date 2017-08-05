package AndroidAPP;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class basics {
	
public AndroidDriver setcapabilities() throws InterruptedException, IOException {
	
		
		Runtime.getRuntime().exec("cmd /c start C:\\appium.bat");
		Thread.sleep(10000L);
		
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
		  
	/*	 driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		     System.out.println("preference clicked");
		     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		     driver.findElementById("android:id/checkbox").click();
		     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		     driver.findElementsByClassName("android.widget.Button").get(1).click();*/
		 
	return driver;
	}

}
