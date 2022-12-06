package stepDefinationsHomepageOpenlink;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		//AndroidDriver <AndroidElement>driver =capabilities();
		//File appDir = new File("src/test/java");
		
		//File app= new File(appDir, "curaprox.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Curaproxemulator");
    	cap.setCapability(AndroidMobileCapabilityType.APPLICATION_NAME, "Curaprox Pro");
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ag.curaden.curaprox.affiliate");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ag.curaden.curaprox.affiliate.MainActivity");
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Curaproxemulator");
		
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		// UI Automator --> android app
		
		// uiautomator2
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

	AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
	
	return driver;
	
	}

	public static AndroidDriver<AndroidElement> gmailcapabilities() throws MalformedURLException
	{
File appDir = new File("src/test/java");
		
		File app= new File(appDir, "mymail.apk");
		DesiredCapabilities capb = new DesiredCapabilities();
    	capb.setCapability(MobileCapabilityType.DEVICE_NAME, "Curaproxemulator");
    	capb.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    	capb.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
    	AndroidDriver <AndroidElement> driver1 = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),capb);
    	
    	return driver1;
	}
}
