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


public class AppTest extends basics
{


	AndroidDriver driver;
	@BeforeSuite
public  void checkapp() throws InterruptedException, IOException {
		
		
		// TODO Auto-generated method stub
	
		
		 driver=setcapabilities();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     System.out.println("wait for 10 sec");
     Thread.sleep(10000L);
  //xpath id className, androidUIautomator
     /*    xpath Syntax
      *    //tagName[@attribute='value']
    
      * 
      */
	}
	@Test
	public  void checkappnew() throws InterruptedException, IOException {
		
     driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
     System.out.println("preference clicked");
     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
     driver.findElementById("android:id/checkbox").click();
     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
     driver.findElementsByClassName("android.widget.Button").get(1).click();
    
	}



	}

