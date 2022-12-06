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

public class DailyRead extends Loginfunction  {

		 
		public DailyRead() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	
		//public AndroidDriver <AndroidElement>driver =capabilities();
		//public StepDefinationsHomepageOpenlink() throws MalformedURLException {}
		
	
		@Given("^Login to Curaprox for Read Article$")
		    public void login_to_curaprox_Read_Article() throws Throwable {
			// main code link to loginfunction class 	
			super.loginfun();
		System.out.println("Hello test");
			
		    }

		@Given("^Home Screen open and navigate to Daily Read section$")
	    public void home_screen_open_and_navigate_to_daily_read_section() throws Throwable {
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"DAILY READ\").instance(0))");
			try {
			    driver.findElement(MobileBy.AndroidUIAutomator(
			            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
			} catch (InvalidSelectorException e) {
			    // ignore
			}
	
		}

	    @Then("^Click on recant post$")
	    public void click_on_recant_post() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"DAILY READ\")").getText();
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(new PointOption().withCoordinates(427, 1140)).perform();
	    	driver.findElementByAndroidUIAutomator("text(\"ARTICLES\")").click();
	    }

	    @Then("^Click on back button$")
	    public void click_on_back_button() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[63,110][90,165]']")).click();
	    }

	    @Then("^Click on See All$")
	    public void click_on_See_All() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"DAILY READ\")").getText();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[927,965][1038,1013]']")).click();
	    	
	    }

	    @Then("^Click on Daily Read See all button and click on article click$")
	    public void click_on_daily_read_see_all_button_and_click_on_article_click() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Designer of Curaprox’s Love Edition, illustrator Sam Vanbelle: “These toothbrushes can be a daily reminder to cherish your partner.”\").instance(0))");
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Designer of Curaprox’s Love Edition, illustrator Sam Vanbelle: “These toothbrushes can be a daily reminder to cherish your partner.”\")").click();
	    }

	    @Then("^Click on back button and click back button$")
	    public void click_on_back_button_and_click_back_button() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"ARTICLES\")").getText();
	    	driver.navigate().back();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"ARTICLES\")").getText();
	    	driver.navigate().back();
	    }

	    @Then("^Click on my account option and log out$")
	    public void click_on_my_account_option_and_log_out() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    
	    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	try {
			    driver.findElement(MobileBy.AndroidUIAutomator(
			            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
			} catch (InvalidSelectorException e) {
			    // ignore
			}
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    }

		// TODO Auto-generated constructor stub
	}



