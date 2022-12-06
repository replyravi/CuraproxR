package lessonComplete;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;
import stepDefinations.Loginfunction;

public class LessonComplete extends Loginfunction  {

		 
		public LessonComplete() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	
		//public AndroidDriver <AndroidElement>driver =capabilities();
		//public StepDefinationsHomepageOpenlink() throws MalformedURLException {}
		
	
		@Given("^Login to Curaprox$")
		    public void login_to_curaprox() throws Throwable {
			// main code link to loginfunction class 	
			super.loginfun();
		System.out.println("Hello test");
			
		    }

		    @Then("^Click on first lesson and start lesson$")
		    public void click_on_first_lesson_and_start_lesson() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"LESSON TO RECOMMEND\").instance(0))");
		    	// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LESSON TO RECOMMEND\"));");
		    	new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 0)).release().perform();
		    	driver.findElementByAndroidUIAutomator("text(\"Babies\")").click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"Babies\")").click();
		    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[56,725][450,1056]']")).click();
		    }

		    @Then("^Complete all the lesson page$")
		    public void complete_all_the_lesson_page() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[40,366][523,687]']")).click();
		    	driver.findElementByAndroidUIAutomator("text(\"Soothers: Pros, Cons, and How to Choose the Right One\")").click();
		    }

		    @Then("^Complete Quiz time$")
		    public void complete_quiz_time() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	//driver.findElementByAndroidUIAutomator("text(\"START THIS LESSON\")").click();
		    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[340,1653][740,1718]']")).click();
		    }

		    @Then("^Click on done$")
		    public void click_on_done() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"A cherry-shape tip.\")").click();
		    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[87,532][842,580]")).click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[338,1653][742,1718]']")).click();
		    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM ANSWER\")").click();
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(0))");
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"DONE\")").click();
		    }

		    @Then("^Click to my account and logout$")
		    public void click_to_my_account_and_logout() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	//driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
		    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
		    }

		// TODO Auto-generated constructor stub
	}



