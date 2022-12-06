package mainFunction;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;
import stepDefinations.Loginfunction;

public class Allnotification extends Loginfunction  {

		 
		public Allnotification() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

		  @Given("^Login to Curaprox for all notification$")
		    public void login_to_curaprox_for_all_notification() throws Throwable {
			  super.loginfun();
				System.out.println("Hello test");
		    }

		    @Given("^Home Screen open and navigate to notification$")
		    public void home_screen_open_and_navigate_to_notification() throws Throwable {
		    	driver.findElementByAndroidUIAutomator("text(\"Home\")").getText();
		    	((AndroidDriver) driver).openNotifications();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.navigate().back();
		    }

		    @Given("^Home Screen open and navigate to bell icon$")
		    public void home_screen_open_and_navigate_to_bell_icon() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[858,147][927,229]']")).click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"NOTIFICATION CENTER\")").getText();
		    }

		    @Given("^Verify all message$")
		    public void verify_all_message() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	String text = "You have earned 250 curapoints for completing onboarding";
		    	if(text=="You have earned 250 curapoints for completing onboarding")
		    	{
		    	
		    	driver.findElementByAndroidUIAutomator("text(\"You have earned 250 curapoints for completing onboarding\")").getText();
		    	}
		    	else 
		    	{
		    		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    		driver.findElementByAndroidUIAutomator("text(\"NOTIFICATION CENTER\")").getText();
		    		System.out.println("Please Complete Onboarding get 250 CuraPoint");
		    	}
		    	driver.navigate().back();
		    }
		    

		    @Given("^Navigate to shop click on toothbrushes$")
		    public void navigate_to_shop_click_on_toothbrushes() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"Shop\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"Toothbrushes\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"Sorted by: Popularity\")").click();
		    	
		    }

		    @Given("^Click sorted and verify it$")
		    public void click_sorted_and_verify_it() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"Name, A to Z\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"Name, A to Z\")").getText();
		    	driver.navigate().back();
		    }

		    @Given("^Click on My Account and verify all sections and subsections$")
		    public void click_on_my_account_and_verify_all_sections_and_subsections() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"My Profile\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"MY PROFILE\")").getText();
		    	driver.navigate().back();
		    	driver.findElementByAndroidUIAutomator("text(\"My CuraPoints\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"My CuraPoints\")").getText();
		    	driver.navigate().back();
		    }


		    @Then("^Click on my account option and log out for notification$")
		    public void click_on_my_account_option_and_log_out_for_notification() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			    
		    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
		    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
		    }
	
		// TODO Auto-generated constructor stub
	}



